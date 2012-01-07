/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.test.parser;

import java.io.IOException;
import java.io.StringReader;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.rascalmpl.parser.gtd.SGTDBF;
import org.rascalmpl.parser.gtd.stack.AbstractStackNode;
import org.rascalmpl.parser.gtd.stack.LiteralStackNode;
import org.rascalmpl.parser.gtd.stack.NonTerminalStackNode;
import org.rascalmpl.parser.uptr.NodeToUPTR;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.Factory;

/*
S ::= D | Da
D ::= C
C ::= Baa | Ba
B ::= A
A ::= a
*/
public class SplitAndMerge2 extends SGTDBF implements IParserTest{
	private final static IConstructor SYMBOL_START_S = VF.constructor(Factory.Symbol_Sort, VF.string("S"));
	private final static IConstructor SYMBOL_A = VF.constructor(Factory.Symbol_Sort, VF.string("A"));
	private final static IConstructor SYMBOL_B = VF.constructor(Factory.Symbol_Sort, VF.string("B"));
	private final static IConstructor SYMBOL_C = VF.constructor(Factory.Symbol_Sort, VF.string("C"));
	private final static IConstructor SYMBOL_D = VF.constructor(Factory.Symbol_Sort, VF.string("D"));
	private final static IConstructor SYMBOL_a = VF.constructor(Factory.Symbol_Lit, VF.string("a"));
	private final static IConstructor SYMBOL_aa = VF.constructor(Factory.Symbol_Lit, VF.string("aa"));
	private final static IConstructor SYMBOL_char_a = VF.constructor(Factory.Symbol_CharClass, VF.list(VF.constructor(Factory.CharRange_Single, VF.integer(97))));
	
	private final static IConstructor PROD_S_D = VF.constructor(Factory.Production_Default,  SYMBOL_START_S, VF.list(SYMBOL_D), VF.set());
	private final static IConstructor PROD_S_Da = VF.constructor(Factory.Production_Default,  SYMBOL_START_S, VF.list(SYMBOL_D, SYMBOL_a), VF.set());
	private final static IConstructor PROD_D_C = VF.constructor(Factory.Production_Default,  SYMBOL_D, VF.list(SYMBOL_C), VF.set());
	private final static IConstructor PROD_C_Ba = VF.constructor(Factory.Production_Default,  SYMBOL_C, VF.list(SYMBOL_B, SYMBOL_aa), VF.set());
	private final static IConstructor PROD_C_Baa = VF.constructor(Factory.Production_Default,  SYMBOL_C, VF.list(SYMBOL_B, SYMBOL_a), VF.set());
	private final static IConstructor PROD_a_a = VF.constructor(Factory.Production_Default,  SYMBOL_a, VF.list(SYMBOL_char_a), VF.set());
	private final static IConstructor PROD_aa_aa = VF.constructor(Factory.Production_Default,  SYMBOL_aa, VF.list(SYMBOL_char_a, SYMBOL_char_a), VF.set());
	private final static IConstructor PROD_B_A = VF.constructor(Factory.Production_Default,  SYMBOL_B, VF.list(SYMBOL_A), VF.set());
	private final static IConstructor PROD_A_a = VF.constructor(Factory.Production_Default,  SYMBOL_A, VF.list(SYMBOL_a), VF.set());
	
	private final static AbstractStackNode NONTERMINAL_START_S = new NonTerminalStackNode(AbstractStackNode.START_SYMBOL_ID, 0, "S");
	private final static AbstractStackNode NONTERMINAL_A0 = new NonTerminalStackNode(0, 0, "A");
	private final static AbstractStackNode NONTERMINAL_B1 = new NonTerminalStackNode(1, 0, "B");
	private final static AbstractStackNode NONTERMINAL_B2 = new NonTerminalStackNode(2, 0, "B");
	private final static AbstractStackNode NONTERMINAL_C3 = new NonTerminalStackNode(3, 0, "C");
	private final static AbstractStackNode NONTERMINAL_D4 = new NonTerminalStackNode(4, 0, "D");
	private final static AbstractStackNode NONTERMINAL_D5 = new NonTerminalStackNode(5, 0, "D");
	private final static AbstractStackNode LITERAL_a6 = new LiteralStackNode(6, 1, PROD_a_a, new int[]{'a'});
	private final static AbstractStackNode LITERAL_a7 = new LiteralStackNode(7, 0, PROD_a_a, new int[]{'a'});
	private final static AbstractStackNode LITERAL_a8 = new LiteralStackNode(8, 1, PROD_a_a, new int[]{'a'});
	private final static AbstractStackNode LITERAL_aa9 = new LiteralStackNode(9, 1, PROD_aa_aa, new int[]{'a','a'});
	
	private final static AbstractStackNode[] S_EXPECT_1 = new AbstractStackNode[1];
	static{
		S_EXPECT_1[0] = NONTERMINAL_D4;
		S_EXPECT_1[0].setProduction(S_EXPECT_1);
		S_EXPECT_1[0].setParentProduction(PROD_S_D);
	}
	
	private final static AbstractStackNode[] S_EXPECT_2 = new AbstractStackNode[2];
	static{
		S_EXPECT_2[0] = NONTERMINAL_D5;
		S_EXPECT_2[0].setProduction(S_EXPECT_2);
		S_EXPECT_2[1] = LITERAL_a6;
		S_EXPECT_2[1].setProduction(S_EXPECT_2);
		S_EXPECT_2[1].setParentProduction(PROD_S_Da);
	}
	
	private final static AbstractStackNode[] A_EXPECT_1 = new AbstractStackNode[1];
	static{
		A_EXPECT_1[0] = LITERAL_a7;
		A_EXPECT_1[0].setProduction(A_EXPECT_1);
		A_EXPECT_1[0].setParentProduction(PROD_A_a);
	}
	
	private final static AbstractStackNode[] B_EXPECT_1 = new AbstractStackNode[1];
	static{
		B_EXPECT_1[0] = NONTERMINAL_A0;
		B_EXPECT_1[0].setProduction(B_EXPECT_1);
		B_EXPECT_1[0].setParentProduction(PROD_B_A);
	}
	
	private final static AbstractStackNode[] C_EXPECT_1 = new AbstractStackNode[2];
	static{
		C_EXPECT_1[0] = NONTERMINAL_B1;
		C_EXPECT_1[0].setProduction(C_EXPECT_1);
		C_EXPECT_1[1] = LITERAL_a8;
		C_EXPECT_1[1].setProduction(C_EXPECT_1);
		C_EXPECT_1[1].setParentProduction(PROD_C_Ba);
	}
	
	private final static AbstractStackNode[] C_EXPECT_2 = new AbstractStackNode[2];
	static{
		C_EXPECT_2[0] = NONTERMINAL_B2;
		C_EXPECT_2[0].setProduction(C_EXPECT_2);
		C_EXPECT_2[1] = LITERAL_aa9;
		C_EXPECT_2[1].setProduction(C_EXPECT_2);
		C_EXPECT_2[1].setParentProduction(PROD_C_Baa);
	}
	
	private final static AbstractStackNode[] D_EXPECT_1 = new AbstractStackNode[1];
	static{
		D_EXPECT_1[0] = NONTERMINAL_C3;
		D_EXPECT_1[0].setProduction(D_EXPECT_1);
		D_EXPECT_1[0].setParentProduction(PROD_D_C);
	}
	public SplitAndMerge2(){
		super();
	}
	
	public AbstractStackNode[] S(){
		return new AbstractStackNode[]{S_EXPECT_1[0], S_EXPECT_2[0]};
	}
	
	public AbstractStackNode[] A(){
		return new AbstractStackNode[]{A_EXPECT_1[0]};
	}
	
	public AbstractStackNode[] B(){
		return new AbstractStackNode[]{B_EXPECT_1[0]};
	}
	
	public AbstractStackNode[] C(){
		return new AbstractStackNode[]{C_EXPECT_1[0], C_EXPECT_2[0]};
	}
	
	public AbstractStackNode[] D(){
		return new AbstractStackNode[]{D_EXPECT_1[0]};
	}
	
	public IConstructor executeParser(){
		return (IConstructor) parse(NONTERMINAL_START_S, null, "aaa".toCharArray(), new NodeToUPTR());
	}
	
	public IValue getExpectedResult() throws IOException{
		String expectedInput = "amb({appl(prod(sort(\"S\"),[sort(\"D\"),lit(\"a\")],{}),[appl(prod(sort(\"D\"),[sort(\"C\")],{}),[appl(prod(sort(\"C\"),[sort(\"B\"),lit(\"aa\")],{}),[appl(prod(sort(\"B\"),[sort(\"A\")],{}),[appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])])]),appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])])]),appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])]),appl(prod(sort(\"S\"),[sort(\"D\")],{}),[appl(prod(sort(\"D\"),[sort(\"C\")],{}),[appl(prod(sort(\"C\"),[sort(\"B\"),lit(\"a\")],{}),[appl(prod(sort(\"B\"),[sort(\"A\")],{}),[appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])])]),appl(prod(lit(\"aa\"),[\\char-class([single(97)]),\\char-class([single(97)])],{}),[char(97),char(97)])])])])})";
		return new StandardTextReader().read(ValueFactoryFactory.getValueFactory(), Factory.uptr, Factory.Tree, new StringReader(expectedInput));
	}

	public static void main(String[] args){
		SplitAndMerge2 ms2 = new SplitAndMerge2();
		IConstructor result = ms2.executeParser();
		System.out.println(result);
		
		System.out.println("[S(D(C(B(A(a)),aa))),S(D(C(B(A(a)),a)),a)] <- good");
	}
}
