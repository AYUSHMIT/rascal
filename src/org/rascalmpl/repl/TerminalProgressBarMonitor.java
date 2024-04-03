package org.rascalmpl.repl;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

import org.rascalmpl.debug.IRascalMonitor;
import org.tukaani.xz.check.SHA256;

import io.usethesource.vallang.ISourceLocation;
import jline.Terminal;

/**
 * The terminal progress bar monitor wraps the standard output stream to be able to monitor
 * output and keep the progress bars at the same place in the window while other prints happen
 * asyncronously (or even in parallel). It can be passed to the IDEServices API such that
 * clients can start progress bars, make them grow and end them using the API in util::Monitor.
 * 
 * This gives the console the ability to show progress almost as clearly as an IDE can with a
 * UI experience. 
 * 
 * This class only works correctly if the actual _raw_ output stream of the terminal is wrapped
 * with an object of this class.
 */
public class TerminalProgressBarMonitor extends FilterOutputStream implements IRascalMonitor  {
    /**
     * We administrate an ordered list of named bars, which will be printed from
     * top to bottom just above the next prompt.
     */
    private List<ProgressBar> bars = new LinkedList<>();
    
    /**
     * This writer is there to help with the encoding to what the terminal needs. It writes directly to the
     * underlying stream.
     */
    private final PrintWriter writer;

    /**
     * The entire width in character columns of the current terminal. We do not support resizing (yet).
     */
    private final int lineWidth;

    /**
     * For portability it is important to encode according to the needs of the actual terminal.
     */
    private final String encoding;

    public TerminalProgressBarMonitor(OutputStream out, Terminal tm) {
        super(out);
        this.encoding = tm.getOutputEncoding() != null ? tm.getOutputEncoding() : "UTF8";
        this.writer = new PrintWriter(out, true, Charset.forName(encoding));
        this.lineWidth = tm.getWidth();
    }

    /**
     * Represents one currently running progress bar
     */
    private class ProgressBar {
        private final long threadId;
        private final String name;
        private int max;
        private int current = 0;
        private int previousWidth = 0;
        private int doneWidth = 0;
        private final int barWidth = lineWidth - "☐ ".length() - "   🕐 00:00:00.000 ".length();
        private final Instant startTime;
        private Duration duration;
        private String message = "";
        private int stepper = 0;
        private final String[] clocks = new String[] {"🕐" , "🕑", "🕒", "🕓", "🕔", "🕕", "🕖", "🕗", "🕘", "🕙", "🕛"};

        ProgressBar(String name, int max) {
            this.threadId = Thread.currentThread().getId();
            this.name = name;
            this.max = max;
            this.startTime = Instant.now();
            this.duration = Duration.ZERO;
            this.message = name;
        }

        void worked(int amount, String message) {
            this.current += Math.min(amount, max);
            this.duration = Duration.between(startTime, Instant.now());
            this.message = message;
        }

        /**
         * To avoid flickering of all bars at the same time, we only reprint
         * the current bar
         */
        void update() {
            // to avoid flicker we only print if there is a new bar character to draw
            if (newWidth() != previousWidth) {
                stepper++;
                writer.write(ANSI.hideCursor());
                writer.write(ANSI.moveUp(bars.size() - bars.indexOf(this)));
                write();
                writer.write(ANSI.moveDown(bars.size() - bars.indexOf(this)));
                writer.write(ANSI.showCursor());
            }
        }

        int newWidth() {
            current = Math.min(max, current); // for robustness sake
            var partDone = (current * 1.0) / (max * 1.0);
            return (int) Math.floor(barWidth * partDone);
        }
        /**
         * Print the current state of the progress bar
         */
        void write() {
            previousWidth = doneWidth;
            doneWidth = newWidth();
                        
            // var overWidth = barWidth - doneWidth;
            var done = current >= max ? "☑ " : "☐ ";

            // fill up and cut off:
            message = (message + " ".repeat(Math.max(0, barWidth - message.length()))).substring(0, barWidth);

            // capitalize
            message = message.substring(0, 1).toUpperCase() + message.substring(1, message.length());
            
            // split
            var frontPart = message.substring(0, doneWidth);
            var backPart = message.substring(doneWidth, message.length());
            var clock = clocks[stepper % clocks.length];

            if (barWidth < 1) {
                return; // robustness against very small screens. At least don't throw bounds exceptions
            }
            else if (barWidth <= 3) { // we can print the clock for good measure 
                writer.println(clock);
                return;
            }

            var line 
                = done 
                + ANSI.darkBackground() 
                + frontPart
                + ANSI.noBackground()
                + ANSI.lightBackground()
                + backPart
                + ANSI.noBackground()
                + " " + threadLabel() + " " + clock + " "
                + String.format("%d:%02d:%02d.%03d", duration.toHoursPart(), duration.toMinutes(), duration.toSecondsPart(), duration.toMillisPart())
                + " "
                ;

            writer.println(line);
        }

        private String threadLabel() {
            String name = Thread.currentThread().getName();
            if (name.isEmpty()) {
                return "  ";
            }
            
            char last = name.charAt(name.length() - 1);
            if (Character.isDigit(last)) {
                return new String(Character.toChars(((last - '0') + "⑴ ".codePointAt(0))));
            }

            return "  ";
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof ProgressBar 
                && ((ProgressBar) obj).name.equals(name)
                && ((ProgressBar) obj).threadId == threadId
                ;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + 31 * (int) threadId;
        }

        public void done() {
            this.current = Math.min(current, max);
            this.duration = Duration.between(startTime, Instant.now());
            this.message = name;
        }
    }

    /**
     * Clean the screen, ready for the next output (normal output or the next progress bars or both).
     * We use fancy ANSI codes here to move the cursor and clean the screen to remove previous versions
     * of the bars
     */
    private void eraseBars() {
        if (bars.isEmpty()) {
            writer.println();
        }
            
        writer.write(ANSI.hideCursor());
        writer.write(ANSI.moveUp(bars.size())); 
        writer.write(ANSI.clearToEndOfScreen()); 
        writer.write(ANSI.showCursor());
        writer.flush();
    }

    /**
     * ANSI escape codes convenience functions
     */
    private static class ANSI {
        static String moveUp(int n) {
            return "\u001B[" + n + "F";
        }

        public static String darkBackground() {
            return "\u001B[48;5;242m";
        }

        public static String noBackground() {
            return "\u001B[49m";
        }

        public static String lightBackground() {
            return "\u001B[48;5;249m";
        }

        static String moveDown(int n) {
            return "\u001B[" + n + "E";
        }

        static String clearToEndOfScreen() {
            return "\u001B[0J";
        }

        static String hideCursor() {
            return "\u001B[?25l";
        }

        static String showCursor() {
            return "\u001B[?25h";
        }
    }

    /**
     * Simply print the bars. No cursor movement here. Hiding the cursor prevents flickering.
     */
    private void printBars() {
        writer.write(ANSI.hideCursor());
        for (var pb : bars) {
            pb.write();
        }
        writer.write(ANSI.showCursor());
        writer.flush();
    }

    /**
     * Find a bar in the ordered list of bars, by name.
     * @param name of the bar
     * @return the current instance by that name
     */
    private ProgressBar findBarByName(String name) {
        return bars.stream()
            .filter(b -> b.threadId == Thread.currentThread().getId())
            .filter(b -> b.name.equals(name)).findFirst().orElseGet(() -> null);
    }
    
    @Override
    public synchronized void jobStart(String name, int workShare, int totalWork) {
        var pb = findBarByName(name);
        
        eraseBars(); // to make room for the new bars

        if (pb == null) {
            bars.add(new ProgressBar(name, totalWork));
        }
        else {
            // Zeno-bar: we add the new work to the already existing work
            pb.max += totalWork;
        }

        printBars(); // probably one line longer than before!
    }

    @Override
    public synchronized void jobStep(String name, String message, int workShare) {
        ProgressBar pb = findBarByName(name);
        
        if (pb != null) {
            pb.worked(workShare, message);
            pb.update();
        }
    }

    @Override
    public synchronized int jobEnd(String name, boolean succeeded) {
        var pb = findBarByName(name);

        if (pb != null) {
            eraseBars();
            // write it one last time into the scrollback buffer (on top)
            pb.done();
            pb.write();
            bars.remove(pb);
            // print the left over bars under this one.
            printBars();
            return pb.current;
        }

        return -1;
    }

    @Override
    public synchronized boolean jobIsCanceled(String name) {
       // ? don't know what this should do
       return false;
    }

    @Override
    public synchronized void jobTodo(String name, int work) {
        ProgressBar pb = findBarByName(name);
        
        if (pb != null) {
            pb.max += work;
            pb.update();
        }
    }

    @Override
    public synchronized void warning(String message, ISourceLocation src) {
        if (bars.size() > 0) {
            eraseBars();
        }
        writer.println(("[WARNING] " + src + ": " + message));
        if (bars.size() > 0) {
            printBars();
        }
    }

    /**
     * Here we make sure the progress bars are gone just before
     * someone wants to print in the console. When the printing
     * is ready, we simply add our own progress bars again.
     */
    @Override
    public synchronized void write(byte[] b) throws IOException {
        if (bars.size() > 0) {
            eraseBars();
            out.write(b);
            printBars();
        }
        else {
            out.write(b);
        }
    }

    /**
     * Here we make sure the progress bars are gone just before
     * someone wants to print in the console. When the printing
     * is ready, we simply add our own progress bars again.
     */
    @Override
    public synchronized void write(byte[] b, int off, int len) throws IOException {
    if (bars.size() > 0) {
            eraseBars();
            out.write(b, off, len);
            printBars();
        }
        else {
            out.write(b, off, len);
        }
    }

    /**
     * Here we make sure the progress bars are gone just before
     * someone wants to print in the console. When the printing
     * is ready, we simply add our own progress bars again.
     */
    @Override
    public synchronized void write(int b) throws IOException {
        if (bars.size() > 0) {
            eraseBars();
            out.write(b);
            printBars();
        }
        else {
            out.write(b);
        }
    }

    @Override
    public synchronized void endAllJobs() {
        // eraseBars();
        bars.clear();
        writer.write(ANSI.showCursor());
        writer.flush();
    }
}
