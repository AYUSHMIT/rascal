module lang::rascal::tests::functionality::CharacterTests

import ParseTree;
import String;

private bool check(type[&T] t, value x) = &T _ := x;

test bool singleA() = check(#[A], char(65));
test bool singleB() = check(#[B], char(66));
test bool notSingleB() = !check(#[A], char(66));
test bool singleAB1() = check(#[A-B], char(65));
test bool singleAB2() = check(#[A-B], char(66));

test bool charclassLUB() = set[[A-D]] _ := {char(65), char(66), char(67), char(68)};
test bool charclassLUB2() = set[[a-z]] _ := {char(i) | i <- [97..122]};

private list[![]] characters(str x) = [char(i) | i <- chars(x)];

test bool shortestRangesArePrinted() = "<#![]>" == "![]";
test bool complementOfNothingIsEverything() = (#![]).symbol == \char-class([range(1,0x10FFFF)]);
test bool charClassOrderedRanges() = (#[a-z A-Z]).symbol == \char-class([range(65,90),range(97,122)]);
test bool charClassMergedRanges() = (#[A-Z F-G]).symbol == \char-class([range(65,90)]);
test bool charClassExtendedRanges() = (#[A-M N-Z]).symbol == \char-class([range(65,90)]);

test bool differenceCC() = (#([a-zA-Z] -  [A-Z])).symbol == (#([a-z])).symbol;
test bool unionCC()      = (#([a-z]    || [A-Z])).symbol == (#([A-Za-z])).symbol;
test bool intersectCC()  = (#([A-Za-z] && [A-Z])).symbol == (#([A-Z])).symbol;