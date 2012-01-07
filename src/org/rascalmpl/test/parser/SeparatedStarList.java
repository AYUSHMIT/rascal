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
import org.rascalmpl.parser.gtd.stack.SeparatedListStackNode;
import org.rascalmpl.parser.uptr.NodeToUPTR;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.Factory;

/*
S ::= sep(A, b)*
A ::= a

sep(X, Y) means, a list of X separated by Y's.
*/
public class SeparatedStarList extends SGTDBF implements IParserTest{
	private final static IConstructor SYMBOL_START_S = VF.constructor(Factory.Symbol_Sort, VF.string("S"));
	private final static IConstructor SYMBOL_A = VF.constructor(Factory.Symbol_Sort, VF.string("A"));
	private final static IConstructor SYMBOL_b = VF.constructor(Factory.Symbol_Lit, VF.string("b"));
	private final static IConstructor SYMBOL_SEP_STAR_LIST_A = VF.constructor(Factory.Symbol_IterStarSepX, SYMBOL_A, Factory.Symbols.make(VF,SYMBOL_b));
	private final static IConstructor SYMBOL_a = VF.constructor(Factory.Symbol_Lit, VF.string("a"));
	private final static IConstructor SYMBOL_char_a = VF.constructor(Factory.Symbol_CharClass, VF.list(VF.constructor(Factory.CharRange_Single, VF.integer(97))));
	private final static IConstructor SYMBOL_char_b = VF.constructor(Factory.Symbol_CharClass, VF.list(VF.constructor(Factory.CharRange_Single, VF.integer(98))));
	
	private final static IConstructor PROD_S_SEPSTARLIST_A_b = VF.constructor(Factory.Production_Default,  SYMBOL_START_S, VF.list(SYMBOL_SEP_STAR_LIST_A), VF.set());
	private final static IConstructor PROD_SEPSTARLIST_A_b = VF.constructor(Factory.Production_Regular, SYMBOL_SEP_STAR_LIST_A);
	private final static IConstructor PROD_A_a = VF.constructor(Factory.Production_Default,  SYMBOL_A, VF.list(SYMBOL_a), VF.set());
	private final static IConstructor PROD_a_a = VF.constructor(Factory.Production_Default,  SYMBOL_a, VF.list(SYMBOL_char_a), VF.set());
	private final static IConstructor PROD_b_b = VF.constructor(Factory.Production_Default,  SYMBOL_b, VF.list(SYMBOL_char_b), VF.set());
	
	private final static AbstractStackNode NONTERMINAL_START_S = new NonTerminalStackNode(AbstractStackNode.START_SYMBOL_ID, 0, "S");
	private final static AbstractStackNode NONTERMINAL_A0 = new NonTerminalStackNode(0, 0, "A");
	private final static AbstractStackNode LITERAL_b1 = new LiteralStackNode(1, 1, PROD_b_b, new int[]{'b'});
	private final static AbstractStackNode LIST2 = new SeparatedListStackNode(2, 0, PROD_SEPSTARLIST_A_b, NONTERMINAL_A0, new AbstractStackNode[]{LITERAL_b1}, false);
	private final static AbstractStackNode LITERAL_a3 = new LiteralStackNode(3, 0, PROD_a_a, new int[]{'a'});
	
	private final static AbstractStackNode[] S_EXPECT_1 = new AbstractStackNode[1];
	static{
		S_EXPECT_1[0] = LIST2;
		S_EXPECT_1[0].setProduction(S_EXPECT_1);
		S_EXPECT_1[0].setParentProduction(PROD_S_SEPSTARLIST_A_b);
	}
	
	private final static AbstractStackNode[] A_EXPECT_1 = new AbstractStackNode[1];
	static{
		A_EXPECT_1[0] = LITERAL_a3;
		A_EXPECT_1[0].setProduction(A_EXPECT_1);
		A_EXPECT_1[0].setParentProduction(PROD_A_a);
	}
	
	public SeparatedStarList(){
		super();
	}
	
	public AbstractStackNode[] S(){
		return new AbstractStackNode[]{S_EXPECT_1[0]};
	}
	
	public AbstractStackNode[] A(){
		return new AbstractStackNode[]{A_EXPECT_1[0]};
	}
	
	public IConstructor executeParser(){
		return (IConstructor) parse(NONTERMINAL_START_S, null, "ababa".toCharArray(), new NodeToUPTR());
	}
	
	public IValue getExpectedResult() throws IOException{
		String expectedInput = "appl(prod(sort(\"S\"),[\\iter-star-seps(sort(\"A\"),[lit(\"b\")])],{}),[appl(regular(\\iter-star-seps(sort(\"A\"),[lit(\"b\")])),[appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])]),appl(prod(lit(\"b\"),[\\char-class([single(98)])],{}),[char(98)]),appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])]),appl(prod(lit(\"b\"),[\\char-class([single(98)])],{}),[char(98)]),appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])])])])";
		return new StandardTextReader().read(ValueFactoryFactory.getValueFactory(), Factory.uptr, Factory.Tree, new StringReader(expectedInput));
	}

	public static void main(String[] args){
		SeparatedStarList nrsl = new SeparatedStarList();
		IConstructor result = nrsl.executeParser();
		System.out.println(result);
		
		System.out.println("S((Ab)*(A(a),b,A(a),b,A(a))) <- good");
	}
}
