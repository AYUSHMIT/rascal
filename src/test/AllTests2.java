package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	IOTests.class,
//	ParsingTests.class,
	PatternTests.class,
	RecoveryTests.class,
	RegExpTests.class,
	ScopeTests.class
})

public class AllTests2 {
// Empty
}
