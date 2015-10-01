module util::REPL


alias Completion
 = tuple[int offset, list[str] suggestions];

alias CommandResult
  = tuple[str result, list[Message] messages, str prompt] 
  ;

data REPL
  = repl(str title, str welcome, str prompt, loc history, 
         CommandResult (str line) handler,
         Completion(str line, int cursor) completor);


@javaClass{org.rascalmpl.library.util.TermREPL}
@Reflective
java void startREPL(REPL repl);