/*******************************************************************************
 * Copyright (c) 2009-2015 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Tijs van der Storm - Tijs.van.der.Storm@cwi.nl
 *   * Paul Klint - Paul.Klint@cwi.nl - CWI
 *   * Mark Hills - Mark.Hills@cwi.nl (CWI)
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
 *   * Michael Steindorfer - Michael.Steindorfer@cwi.nl - CWI
 *******************************************************************************/
package org.rascalmpl.ast;


import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.ISourceLocation;

public abstract class Expression extends AbstractAST {
  public Expression(ISourceLocation src, IConstructor node) {
    super(src /* we forget node on purpose */);
  }

  
  public boolean hasArguments() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Expression> getArguments() {
    throw new UnsupportedOperationException();
  }
  public boolean hasElements() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Expression> getElements() {
    throw new UnsupportedOperationException();
  }
  public boolean hasElements0() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Expression> getElements0() {
    throw new UnsupportedOperationException();
  }
  public boolean hasGenerators() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Expression> getGenerators() {
    throw new UnsupportedOperationException();
  }
  public boolean hasSubscripts() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Expression> getSubscripts() {
    throw new UnsupportedOperationException();
  }
  public boolean hasFields() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Field> getFields() {
    throw new UnsupportedOperationException();
  }
  public boolean hasMappings() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Mapping_Expression> getMappings() {
    throw new UnsupportedOperationException();
  }
  public boolean hasStatements() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Statement> getStatements() {
    throw new UnsupportedOperationException();
  }
  public boolean hasStatements0() {
    return false;
  }

  public java.util.List<org.rascalmpl.ast.Statement> getStatements0() {
    throw new UnsupportedOperationException();
  }
  public boolean hasComprehension() {
    return false;
  }

  public org.rascalmpl.ast.Comprehension getComprehension() {
    throw new UnsupportedOperationException();
  }
  public boolean hasConcrete() {
    return false;
  }

  public org.rascalmpl.ast.Concrete getConcrete() {
    throw new UnsupportedOperationException();
  }
  public boolean hasArgument() {
    return false;
  }

  public org.rascalmpl.ast.Expression getArgument() {
    throw new UnsupportedOperationException();
  }
  public boolean hasCondition() {
    return false;
  }

  public org.rascalmpl.ast.Expression getCondition() {
    throw new UnsupportedOperationException();
  }
  public boolean hasDefinitions() {
    return false;
  }

  public org.rascalmpl.ast.Expression getDefinitions() {
    throw new UnsupportedOperationException();
  }
  public boolean hasElseExp() {
    return false;
  }

  public org.rascalmpl.ast.Expression getElseExp() {
    throw new UnsupportedOperationException();
  }
  public boolean hasExpression() {
    return false;
  }

  public org.rascalmpl.ast.Expression getExpression() {
    throw new UnsupportedOperationException();
  }
  public boolean hasFirst() {
    return false;
  }

  public org.rascalmpl.ast.Expression getFirst() {
    throw new UnsupportedOperationException();
  }
  public boolean hasInit() {
    return false;
  }

  public org.rascalmpl.ast.Expression getInit() {
    throw new UnsupportedOperationException();
  }
  public boolean hasLast() {
    return false;
  }

  public org.rascalmpl.ast.Expression getLast() {
    throw new UnsupportedOperationException();
  }
  public boolean hasLhs() {
    return false;
  }

  public org.rascalmpl.ast.Expression getLhs() {
    throw new UnsupportedOperationException();
  }
  public boolean hasPattern() {
    return false;
  }

  public org.rascalmpl.ast.Expression getPattern() {
    throw new UnsupportedOperationException();
  }
  public boolean hasReplacement() {
    return false;
  }

  public org.rascalmpl.ast.Expression getReplacement() {
    throw new UnsupportedOperationException();
  }
  public boolean hasResult() {
    return false;
  }

  public org.rascalmpl.ast.Expression getResult() {
    throw new UnsupportedOperationException();
  }
  public boolean hasRhs() {
    return false;
  }

  public org.rascalmpl.ast.Expression getRhs() {
    throw new UnsupportedOperationException();
  }
  public boolean hasSecond() {
    return false;
  }

  public org.rascalmpl.ast.Expression getSecond() {
    throw new UnsupportedOperationException();
  }
  public boolean hasSymbol() {
    return false;
  }

  public org.rascalmpl.ast.Expression getSymbol() {
    throw new UnsupportedOperationException();
  }
  public boolean hasThenExp() {
    return false;
  }

  public org.rascalmpl.ast.Expression getThenExp() {
    throw new UnsupportedOperationException();
  }
  public boolean hasValue() {
    return false;
  }

  public org.rascalmpl.ast.Expression getValue() {
    throw new UnsupportedOperationException();
  }
  public boolean hasKeywordArguments() {
    return false;
  }

  public org.rascalmpl.ast.KeywordArguments_Expression getKeywordArguments() {
    throw new UnsupportedOperationException();
  }
  public boolean hasLabel() {
    return false;
  }

  public org.rascalmpl.ast.Label getLabel() {
    throw new UnsupportedOperationException();
  }
  public boolean hasLiteral() {
    return false;
  }

  public org.rascalmpl.ast.Literal getLiteral() {
    throw new UnsupportedOperationException();
  }
  public boolean hasField() {
    return false;
  }

  public org.rascalmpl.ast.Name getField() {
    throw new UnsupportedOperationException();
  }
  public boolean hasKey() {
    return false;
  }

  public org.rascalmpl.ast.Name getKey() {
    throw new UnsupportedOperationException();
  }
  public boolean hasName() {
    return false;
  }

  public org.rascalmpl.ast.Name getName() {
    throw new UnsupportedOperationException();
  }
  public boolean hasOptFirst() {
    return false;
  }

  public org.rascalmpl.ast.OptionalExpression getOptFirst() {
    throw new UnsupportedOperationException();
  }
  public boolean hasOptLast() {
    return false;
  }

  public org.rascalmpl.ast.OptionalExpression getOptLast() {
    throw new UnsupportedOperationException();
  }
  public boolean hasParameters() {
    return false;
  }

  public org.rascalmpl.ast.Parameters getParameters() {
    throw new UnsupportedOperationException();
  }
  public boolean hasQualifiedName() {
    return false;
  }

  public org.rascalmpl.ast.QualifiedName getQualifiedName() {
    throw new UnsupportedOperationException();
  }
  public boolean hasType() {
    return false;
  }

  public org.rascalmpl.ast.Type getType() {
    throw new UnsupportedOperationException();
  }
  public boolean hasVisit() {
    return false;
  }

  public org.rascalmpl.ast.Visit getVisit() {
    throw new UnsupportedOperationException();
  }

  

  
  public boolean isAddition() {
    return false;
  }

  static public class Addition extends Expression {
    // Production: sig("Addition",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Addition(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isAddition() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAddition(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Addition)) {
        return false;
      }        
      Addition tmp = (Addition) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 5 + 47 * lhs.hashCode() + 197 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isAll() {
    return false;
  }

  static public class All extends Expression {
    // Production: sig("All",[arg("java.util.List\<org.rascalmpl.ast.Expression\>","generators")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Expression> generators;
  
    public All(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Expression> generators) {
      super(src, node);
      
      this.generators = generators;
    }
  
    @Override
    public boolean isAll() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAll(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof All)) {
        return false;
      }        
      All tmp = (All) o;
      return true && tmp.generators.equals(this.generators) ; 
    }
   
    @Override
    public int hashCode() {
      return 251 + 467 * generators.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getGenerators() {
      return this.generators;
    }
  
    @Override
    public boolean hasGenerators() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(generators));
    }
            
  }
  public boolean isAnd() {
    return false;
  }

  static public class And extends Expression {
    // Production: sig("And",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public And(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isAnd() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAnd(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof And)) {
        return false;
      }        
      And tmp = (And) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 821 + 977 * lhs.hashCode() + 181 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isAnti() {
    return false;
  }

  static public class Anti extends Expression {
    // Production: sig("Anti",[arg("org.rascalmpl.ast.Expression","pattern")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression pattern;
  
    public Anti(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression pattern) {
      super(src, node);
      
      this.pattern = pattern;
    }
  
    @Override
    public boolean isAnti() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAnti(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Anti)) {
        return false;
      }        
      Anti tmp = (Anti) o;
      return true && tmp.pattern.equals(this.pattern) ; 
    }
   
    @Override
    public int hashCode() {
      return 433 + 787 * pattern.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(pattern));
    }
            
  }
  public boolean isAny() {
    return false;
  }

  static public class Any extends Expression {
    // Production: sig("Any",[arg("java.util.List\<org.rascalmpl.ast.Expression\>","generators")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Expression> generators;
  
    public Any(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Expression> generators) {
      super(src, node);
      
      this.generators = generators;
    }
  
    @Override
    public boolean isAny() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAny(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Any)) {
        return false;
      }        
      Any tmp = (Any) o;
      return true && tmp.generators.equals(this.generators) ; 
    }
   
    @Override
    public int hashCode() {
      return 991 + 797 * generators.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getGenerators() {
      return this.generators;
    }
  
    @Override
    public boolean hasGenerators() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(generators));
    }
            
  }
  public boolean isAppendAfter() {
    return false;
  }

  static public class AppendAfter extends Expression {
    // Production: sig("AppendAfter",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public AppendAfter(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isAppendAfter() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAppendAfter(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof AppendAfter)) {
        return false;
      }        
      AppendAfter tmp = (AppendAfter) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 487 + 809 * lhs.hashCode() + 773 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isAsType() {
    return false;
  }

  static public class AsType extends Expression {
    // Production: sig("AsType",[arg("org.rascalmpl.ast.Type","type"),arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Type type;
    private final org.rascalmpl.ast.Expression argument;
  
    public AsType(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Type type,  org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.type = type;
      this.argument = argument;
    }
  
    @Override
    public boolean isAsType() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionAsType(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof AsType)) {
        return false;
      }        
      AsType tmp = (AsType) o;
      return true && tmp.type.equals(this.type) && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 953 + 97 * type.hashCode() + 479 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Type getType() {
      return this.type;
    }
  
    @Override
    public boolean hasType() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(type), clone(argument));
    }
            
  }
  public boolean isBracket() {
    return false;
  }

  static public class Bracket extends Expression {
    // Production: sig("Bracket",[arg("org.rascalmpl.ast.Expression","expression")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
  
    public Bracket(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression) {
      super(src, node);
      
      this.expression = expression;
    }
  
    @Override
    public boolean isBracket() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionBracket(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Bracket)) {
        return false;
      }        
      Bracket tmp = (Bracket) o;
      return true && tmp.expression.equals(this.expression) ; 
    }
   
    @Override
    public int hashCode() {
      return 463 + 89 * expression.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression));
    }
            
  }
  public boolean isCallOrTree() {
    return false;
  }

  static public class CallOrTree extends Expression {
    // Production: sig("CallOrTree",[arg("org.rascalmpl.ast.Expression","expression"),arg("java.util.List\<org.rascalmpl.ast.Expression\>","arguments"),arg("org.rascalmpl.ast.KeywordArguments_Expression","keywordArguments")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final java.util.List<org.rascalmpl.ast.Expression> arguments;
    private final org.rascalmpl.ast.KeywordArguments_Expression keywordArguments;
  
    public CallOrTree(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  java.util.List<org.rascalmpl.ast.Expression> arguments,  org.rascalmpl.ast.KeywordArguments_Expression keywordArguments) {
      super(src, node);
      
      this.expression = expression;
      this.arguments = arguments;
      this.keywordArguments = keywordArguments;
    }
  
    @Override
    public boolean isCallOrTree() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionCallOrTree(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof CallOrTree)) {
        return false;
      }        
      CallOrTree tmp = (CallOrTree) o;
      return true && tmp.expression.equals(this.expression) && tmp.arguments.equals(this.arguments) && tmp.keywordArguments.equals(this.keywordArguments) ; 
    }
   
    @Override
    public int hashCode() {
      return 71 + 181 * expression.hashCode() + 349 * arguments.hashCode() + 499 * keywordArguments.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getArguments() {
      return this.arguments;
    }
  
    @Override
    public boolean hasArguments() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.KeywordArguments_Expression getKeywordArguments() {
      return this.keywordArguments;
    }
  
    @Override
    public boolean hasKeywordArguments() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(arguments), clone(keywordArguments));
    }
            
  }
  public boolean isClosure() {
    return false;
  }

  static public class Closure extends Expression {
    // Production: sig("Closure",[arg("org.rascalmpl.ast.Type","type"),arg("org.rascalmpl.ast.Parameters","parameters"),arg("java.util.List\<org.rascalmpl.ast.Statement\>","statements")],breakable=false)
  
    
    private final org.rascalmpl.ast.Type type;
    private final org.rascalmpl.ast.Parameters parameters;
    private final java.util.List<org.rascalmpl.ast.Statement> statements;
  
    public Closure(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Type type,  org.rascalmpl.ast.Parameters parameters,  java.util.List<org.rascalmpl.ast.Statement> statements) {
      super(src, node);
      
      this.type = type;
      this.parameters = parameters;
      this.statements = statements;
    }
  
    @Override
    public boolean isClosure() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionClosure(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Closure)) {
        return false;
      }        
      Closure tmp = (Closure) o;
      return true && tmp.type.equals(this.type) && tmp.parameters.equals(this.parameters) && tmp.statements.equals(this.statements) ; 
    }
   
    @Override
    public int hashCode() {
      return 149 + 569 * type.hashCode() + 701 * parameters.hashCode() + 487 * statements.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Type getType() {
      return this.type;
    }
  
    @Override
    public boolean hasType() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Parameters getParameters() {
      return this.parameters;
    }
  
    @Override
    public boolean hasParameters() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Statement> getStatements() {
      return this.statements;
    }
  
    @Override
    public boolean hasStatements() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(type), clone(parameters), clone(statements));
    }
            
  }
  public boolean isComposition() {
    return false;
  }

  static public class Composition extends Expression {
    // Production: sig("Composition",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Composition(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isComposition() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionComposition(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Composition)) {
        return false;
      }        
      Composition tmp = (Composition) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 151 + 353 * lhs.hashCode() + 383 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isComprehension() {
    return false;
  }

  static public class Comprehension extends Expression {
    // Production: sig("Comprehension",[arg("org.rascalmpl.ast.Comprehension","comprehension")],breakable=false)
  
    
    private final org.rascalmpl.ast.Comprehension comprehension;
  
    public Comprehension(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Comprehension comprehension) {
      super(src, node);
      
      this.comprehension = comprehension;
    }
  
    @Override
    public boolean isComprehension() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionComprehension(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Comprehension)) {
        return false;
      }        
      Comprehension tmp = (Comprehension) o;
      return true && tmp.comprehension.equals(this.comprehension) ; 
    }
   
    @Override
    public int hashCode() {
      return 251 + 283 * comprehension.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Comprehension getComprehension() {
      return this.comprehension;
    }
  
    @Override
    public boolean hasComprehension() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(comprehension));
    }
            
  }
  public boolean isConcrete() {
    return false;
  }

  static public class Concrete extends Expression {
    // Production: sig("Concrete",[arg("org.rascalmpl.ast.Concrete","concrete")],breakable=false)
  
    
    private final org.rascalmpl.ast.Concrete concrete;
  
    public Concrete(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Concrete concrete) {
      super(src, node);
      
      this.concrete = concrete;
    }
  
    @Override
    public boolean isConcrete() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionConcrete(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Concrete)) {
        return false;
      }        
      Concrete tmp = (Concrete) o;
      return true && tmp.concrete.equals(this.concrete) ; 
    }
   
    @Override
    public int hashCode() {
      return 41 + 37 * concrete.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Concrete getConcrete() {
      return this.concrete;
    }
  
    @Override
    public boolean hasConcrete() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(concrete));
    }
            
  }
  public boolean isDescendant() {
    return false;
  }

  static public class Descendant extends Expression {
    // Production: sig("Descendant",[arg("org.rascalmpl.ast.Expression","pattern")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression pattern;
  
    public Descendant(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression pattern) {
      super(src, node);
      
      this.pattern = pattern;
    }
  
    @Override
    public boolean isDescendant() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionDescendant(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Descendant)) {
        return false;
      }        
      Descendant tmp = (Descendant) o;
      return true && tmp.pattern.equals(this.pattern) ; 
    }
   
    @Override
    public int hashCode() {
      return 41 + 359 * pattern.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(pattern));
    }
            
  }
  public boolean isDivision() {
    return false;
  }

  static public class Division extends Expression {
    // Production: sig("Division",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Division(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isDivision() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionDivision(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Division)) {
        return false;
      }        
      Division tmp = (Division) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 769 + 601 * lhs.hashCode() + 503 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isEnumerator() {
    return false;
  }

  static public class Enumerator extends Expression {
    // Production: sig("Enumerator",[arg("org.rascalmpl.ast.Expression","pattern"),arg("org.rascalmpl.ast.Expression","expression")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression pattern;
    private final org.rascalmpl.ast.Expression expression;
  
    public Enumerator(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression pattern,  org.rascalmpl.ast.Expression expression) {
      super(src, node);
      
      this.pattern = pattern;
      this.expression = expression;
    }
  
    @Override
    public boolean isEnumerator() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionEnumerator(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Enumerator)) {
        return false;
      }        
      Enumerator tmp = (Enumerator) o;
      return true && tmp.pattern.equals(this.pattern) && tmp.expression.equals(this.expression) ; 
    }
   
    @Override
    public int hashCode() {
      return 7 + 3 * pattern.hashCode() + 127 * expression.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(pattern), clone(expression));
    }
            
  }
  public boolean isEquals() {
    return false;
  }

  static public class Equals extends Expression {
    // Production: sig("Equals",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Equals(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isEquals() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionEquals(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Equals)) {
        return false;
      }        
      Equals tmp = (Equals) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 439 + 499 * lhs.hashCode() + 137 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isEquivalence() {
    return false;
  }

  static public class Equivalence extends Expression {
    // Production: sig("Equivalence",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Equivalence(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isEquivalence() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionEquivalence(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Equivalence)) {
        return false;
      }        
      Equivalence tmp = (Equivalence) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 709 + 641 * lhs.hashCode() + 167 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isFieldAccess() {
    return false;
  }

  static public class FieldAccess extends Expression {
    // Production: sig("FieldAccess",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","field")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name field;
  
    public FieldAccess(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name field) {
      super(src, node);
      
      this.expression = expression;
      this.field = field;
    }
  
    @Override
    public boolean isFieldAccess() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionFieldAccess(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof FieldAccess)) {
        return false;
      }        
      FieldAccess tmp = (FieldAccess) o;
      return true && tmp.expression.equals(this.expression) && tmp.field.equals(this.field) ; 
    }
   
    @Override
    public int hashCode() {
      return 461 + 163 * expression.hashCode() + 673 * field.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getField() {
      return this.field;
    }
  
    @Override
    public boolean hasField() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(field));
    }
            
  }
  public boolean isFieldProject() {
    return false;
  }

  static public class FieldProject extends Expression {
    // Production: sig("FieldProject",[arg("org.rascalmpl.ast.Expression","expression"),arg("java.util.List\<org.rascalmpl.ast.Field\>","fields")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final java.util.List<org.rascalmpl.ast.Field> fields;
  
    public FieldProject(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  java.util.List<org.rascalmpl.ast.Field> fields) {
      super(src, node);
      
      this.expression = expression;
      this.fields = fields;
    }
  
    @Override
    public boolean isFieldProject() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionFieldProject(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof FieldProject)) {
        return false;
      }        
      FieldProject tmp = (FieldProject) o;
      return true && tmp.expression.equals(this.expression) && tmp.fields.equals(this.fields) ; 
    }
   
    @Override
    public int hashCode() {
      return 881 + 19 * expression.hashCode() + 503 * fields.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Field> getFields() {
      return this.fields;
    }
  
    @Override
    public boolean hasFields() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(fields));
    }
            
  }
  public boolean isFieldUpdate() {
    return false;
  }

  static public class FieldUpdate extends Expression {
    // Production: sig("FieldUpdate",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","key"),arg("org.rascalmpl.ast.Expression","replacement")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name key;
    private final org.rascalmpl.ast.Expression replacement;
  
    public FieldUpdate(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name key,  org.rascalmpl.ast.Expression replacement) {
      super(src, node);
      
      this.expression = expression;
      this.key = key;
      this.replacement = replacement;
    }
  
    @Override
    public boolean isFieldUpdate() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionFieldUpdate(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof FieldUpdate)) {
        return false;
      }        
      FieldUpdate tmp = (FieldUpdate) o;
      return true && tmp.expression.equals(this.expression) && tmp.key.equals(this.key) && tmp.replacement.equals(this.replacement) ; 
    }
   
    @Override
    public int hashCode() {
      return 863 + 127 * expression.hashCode() + 919 * key.hashCode() + 613 * replacement.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getKey() {
      return this.key;
    }
  
    @Override
    public boolean hasKey() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getReplacement() {
      return this.replacement;
    }
  
    @Override
    public boolean hasReplacement() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(key), clone(replacement));
    }
            
  }
  public boolean isGetAnnotation() {
    return false;
  }

  static public class GetAnnotation extends Expression {
    // Production: sig("GetAnnotation",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","name")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name name;
  
    public GetAnnotation(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name name) {
      super(src, node);
      
      this.expression = expression;
      this.name = name;
    }
  
    @Override
    public boolean isGetAnnotation() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionGetAnnotation(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof GetAnnotation)) {
        return false;
      }        
      GetAnnotation tmp = (GetAnnotation) o;
      return true && tmp.expression.equals(this.expression) && tmp.name.equals(this.name) ; 
    }
   
    @Override
    public int hashCode() {
      return 691 + 389 * expression.hashCode() + 163 * name.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(name));
    }
            
  }
  public boolean isGreaterThan() {
    return false;
  }

  static public class GreaterThan extends Expression {
    // Production: sig("GreaterThan",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public GreaterThan(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isGreaterThan() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionGreaterThan(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof GreaterThan)) {
        return false;
      }        
      GreaterThan tmp = (GreaterThan) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 263 + 41 * lhs.hashCode() + 89 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isGreaterThanOrEq() {
    return false;
  }

  static public class GreaterThanOrEq extends Expression {
    // Production: sig("GreaterThanOrEq",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public GreaterThanOrEq(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isGreaterThanOrEq() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionGreaterThanOrEq(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof GreaterThanOrEq)) {
        return false;
      }        
      GreaterThanOrEq tmp = (GreaterThanOrEq) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 389 + 757 * lhs.hashCode() + 353 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isHas() {
    return false;
  }

  static public class Has extends Expression {
    // Production: sig("Has",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","name")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name name;
  
    public Has(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name name) {
      super(src, node);
      
      this.expression = expression;
      this.name = name;
    }
  
    @Override
    public boolean isHas() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionHas(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Has)) {
        return false;
      }        
      Has tmp = (Has) o;
      return true && tmp.expression.equals(this.expression) && tmp.name.equals(this.name) ; 
    }
   
    @Override
    public int hashCode() {
      return 103 + 47 * expression.hashCode() + 229 * name.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(name));
    }
            
  }
  public boolean isIfDefinedOtherwise() {
    return false;
  }

  static public class IfDefinedOtherwise extends Expression {
    // Production: sig("IfDefinedOtherwise",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public IfDefinedOtherwise(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isIfDefinedOtherwise() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIfDefinedOtherwise(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof IfDefinedOtherwise)) {
        return false;
      }        
      IfDefinedOtherwise tmp = (IfDefinedOtherwise) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 13 + 443 * lhs.hashCode() + 367 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isIfThenElse() {
    return false;
  }

  static public class IfThenElse extends Expression {
    // Production: sig("IfThenElse",[arg("org.rascalmpl.ast.Expression","condition"),arg("org.rascalmpl.ast.Expression","thenExp"),arg("org.rascalmpl.ast.Expression","elseExp")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression condition;
    private final org.rascalmpl.ast.Expression thenExp;
    private final org.rascalmpl.ast.Expression elseExp;
  
    public IfThenElse(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression condition,  org.rascalmpl.ast.Expression thenExp,  org.rascalmpl.ast.Expression elseExp) {
      super(src, node);
      
      this.condition = condition;
      this.thenExp = thenExp;
      this.elseExp = elseExp;
    }
  
    @Override
    public boolean isIfThenElse() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIfThenElse(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof IfThenElse)) {
        return false;
      }        
      IfThenElse tmp = (IfThenElse) o;
      return true && tmp.condition.equals(this.condition) && tmp.thenExp.equals(this.thenExp) && tmp.elseExp.equals(this.elseExp) ; 
    }
   
    @Override
    public int hashCode() {
      return 971 + 401 * condition.hashCode() + 457 * thenExp.hashCode() + 167 * elseExp.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getCondition() {
      return this.condition;
    }
  
    @Override
    public boolean hasCondition() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getThenExp() {
      return this.thenExp;
    }
  
    @Override
    public boolean hasThenExp() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getElseExp() {
      return this.elseExp;
    }
  
    @Override
    public boolean hasElseExp() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(condition), clone(thenExp), clone(elseExp));
    }
            
  }
  public boolean isImplication() {
    return false;
  }

  static public class Implication extends Expression {
    // Production: sig("Implication",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Implication(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isImplication() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionImplication(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Implication)) {
        return false;
      }        
      Implication tmp = (Implication) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 229 + 809 * lhs.hashCode() + 19 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isIn() {
    return false;
  }

  static public class In extends Expression {
    // Production: sig("In",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public In(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isIn() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIn(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof In)) {
        return false;
      }        
      In tmp = (In) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 421 + 937 * lhs.hashCode() + 773 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isInsertBefore() {
    return false;
  }

  static public class InsertBefore extends Expression {
    // Production: sig("InsertBefore",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public InsertBefore(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isInsertBefore() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionInsertBefore(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof InsertBefore)) {
        return false;
      }        
      InsertBefore tmp = (InsertBefore) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 37 + 71 * lhs.hashCode() + 823 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isIntersection() {
    return false;
  }

  static public class Intersection extends Expression {
    // Production: sig("Intersection",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Intersection(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isIntersection() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIntersection(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Intersection)) {
        return false;
      }        
      Intersection tmp = (Intersection) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 617 + 613 * lhs.hashCode() + 277 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isIs() {
    return false;
  }

  static public class Is extends Expression {
    // Production: sig("Is",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","name")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name name;
  
    public Is(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name name) {
      super(src, node);
      
      this.expression = expression;
      this.name = name;
    }
  
    @Override
    public boolean isIs() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIs(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Is)) {
        return false;
      }        
      Is tmp = (Is) o;
      return true && tmp.expression.equals(this.expression) && tmp.name.equals(this.name) ; 
    }
   
    @Override
    public int hashCode() {
      return 307 + 157 * expression.hashCode() + 311 * name.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(name));
    }
            
  }
  public boolean isIsDefined() {
    return false;
  }

  static public class IsDefined extends Expression {
    // Production: sig("IsDefined",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public IsDefined(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isIsDefined() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIsDefined(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof IsDefined)) {
        return false;
      }        
      IsDefined tmp = (IsDefined) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 997 + 101 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isIt() {
    return false;
  }

  static public class It extends Expression {
    // Production: sig("It",[],breakable=false)
  
    
  
    public It(ISourceLocation src, IConstructor node ) {
      super(src, node);
      
    }
  
    @Override
    public boolean isIt() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionIt(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof It)) {
        return false;
      }        
      It tmp = (It) o;
      return true ; 
    }
   
    @Override
    public int hashCode() {
      return 907 ; 
    } 
  
    	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null );
    }
            
  }
  public boolean isJoin() {
    return false;
  }

  static public class Join extends Expression {
    // Production: sig("Join",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Join(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isJoin() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionJoin(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Join)) {
        return false;
      }        
      Join tmp = (Join) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 313 + 857 * lhs.hashCode() + 251 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isLessThan() {
    return false;
  }

  static public class LessThan extends Expression {
    // Production: sig("LessThan",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public LessThan(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isLessThan() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionLessThan(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof LessThan)) {
        return false;
      }        
      LessThan tmp = (LessThan) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 409 + 571 * lhs.hashCode() + 929 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isLessThanOrEq() {
    return false;
  }

  static public class LessThanOrEq extends Expression {
    // Production: sig("LessThanOrEq",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public LessThanOrEq(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isLessThanOrEq() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionLessThanOrEq(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof LessThanOrEq)) {
        return false;
      }        
      LessThanOrEq tmp = (LessThanOrEq) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 821 + 463 * lhs.hashCode() + 607 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isList() {
    return false;
  }

  static public class List extends Expression {
    // Production: sig("List",[arg("java.util.List\<org.rascalmpl.ast.Expression\>","elements0")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Expression> elements0;
  
    public List(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Expression> elements0) {
      super(src, node);
      
      this.elements0 = elements0;
    }
  
    @Override
    public boolean isList() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionList(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof List)) {
        return false;
      }        
      List tmp = (List) o;
      return true && tmp.elements0.equals(this.elements0) ; 
    }
   
    @Override
    public int hashCode() {
      return 331 + 941 * elements0.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getElements0() {
      return this.elements0;
    }
  
    @Override
    public boolean hasElements0() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(elements0));
    }
            
  }
  public boolean isLiteral() {
    return false;
  }

  static public class Literal extends Expression {
    // Production: sig("Literal",[arg("org.rascalmpl.ast.Literal","literal")],breakable=false)
  
    
    private final org.rascalmpl.ast.Literal literal;
  
    public Literal(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Literal literal) {
      super(src, node);
      
      this.literal = literal;
    }
  
    @Override
    public boolean isLiteral() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionLiteral(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Literal)) {
        return false;
      }        
      Literal tmp = (Literal) o;
      return true && tmp.literal.equals(this.literal) ; 
    }
   
    @Override
    public int hashCode() {
      return 641 + 347 * literal.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Literal getLiteral() {
      return this.literal;
    }
  
    @Override
    public boolean hasLiteral() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(literal));
    }
            
  }
  public boolean isMap() {
    return false;
  }

  static public class Map extends Expression {
    // Production: sig("Map",[arg("java.util.List\<org.rascalmpl.ast.Mapping_Expression\>","mappings")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Mapping_Expression> mappings;
  
    public Map(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Mapping_Expression> mappings) {
      super(src, node);
      
      this.mappings = mappings;
    }
  
    @Override
    public boolean isMap() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionMap(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Map)) {
        return false;
      }        
      Map tmp = (Map) o;
      return true && tmp.mappings.equals(this.mappings) ; 
    }
   
    @Override
    public int hashCode() {
      return 29 + 859 * mappings.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Mapping_Expression> getMappings() {
      return this.mappings;
    }
  
    @Override
    public boolean hasMappings() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(mappings));
    }
            
  }
  public boolean isMatch() {
    return false;
  }

  static public class Match extends Expression {
    // Production: sig("Match",[arg("org.rascalmpl.ast.Expression","pattern"),arg("org.rascalmpl.ast.Expression","expression")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression pattern;
    private final org.rascalmpl.ast.Expression expression;
  
    public Match(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression pattern,  org.rascalmpl.ast.Expression expression) {
      super(src, node);
      
      this.pattern = pattern;
      this.expression = expression;
    }
  
    @Override
    public boolean isMatch() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionMatch(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Match)) {
        return false;
      }        
      Match tmp = (Match) o;
      return true && tmp.pattern.equals(this.pattern) && tmp.expression.equals(this.expression) ; 
    }
   
    @Override
    public int hashCode() {
      return 199 + 887 * pattern.hashCode() + 523 * expression.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(pattern), clone(expression));
    }
            
  }
  public boolean isModulo() {
    return false;
  }

  static public class Modulo extends Expression {
    // Production: sig("Modulo",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Modulo(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isModulo() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionModulo(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Modulo)) {
        return false;
      }        
      Modulo tmp = (Modulo) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 727 + 503 * lhs.hashCode() + 541 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isMultiVariable() {
    return false;
  }

  static public class MultiVariable extends Expression {
    // Production: sig("MultiVariable",[arg("org.rascalmpl.ast.QualifiedName","qualifiedName")],breakable=false)
  
    
    private final org.rascalmpl.ast.QualifiedName qualifiedName;
  
    public MultiVariable(ISourceLocation src, IConstructor node , org.rascalmpl.ast.QualifiedName qualifiedName) {
      super(src, node);
      
      this.qualifiedName = qualifiedName;
    }
  
    @Override
    public boolean isMultiVariable() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionMultiVariable(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof MultiVariable)) {
        return false;
      }        
      MultiVariable tmp = (MultiVariable) o;
      return true && tmp.qualifiedName.equals(this.qualifiedName) ; 
    }
   
    @Override
    public int hashCode() {
      return 277 + 941 * qualifiedName.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.QualifiedName getQualifiedName() {
      return this.qualifiedName;
    }
  
    @Override
    public boolean hasQualifiedName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(qualifiedName));
    }
            
  }
  public boolean isNegation() {
    return false;
  }

  static public class Negation extends Expression {
    // Production: sig("Negation",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public Negation(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isNegation() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNegation(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Negation)) {
        return false;
      }        
      Negation tmp = (Negation) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 67 + 101 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isNegative() {
    return false;
  }

  static public class Negative extends Expression {
    // Production: sig("Negative",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public Negative(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isNegative() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNegative(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Negative)) {
        return false;
      }        
      Negative tmp = (Negative) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 491 + 617 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isNoMatch() {
    return false;
  }

  static public class NoMatch extends Expression {
    // Production: sig("NoMatch",[arg("org.rascalmpl.ast.Expression","pattern"),arg("org.rascalmpl.ast.Expression","expression")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression pattern;
    private final org.rascalmpl.ast.Expression expression;
  
    public NoMatch(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression pattern,  org.rascalmpl.ast.Expression expression) {
      super(src, node);
      
      this.pattern = pattern;
      this.expression = expression;
    }
  
    @Override
    public boolean isNoMatch() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNoMatch(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof NoMatch)) {
        return false;
      }        
      NoMatch tmp = (NoMatch) o;
      return true && tmp.pattern.equals(this.pattern) && tmp.expression.equals(this.expression) ; 
    }
   
    @Override
    public int hashCode() {
      return 337 + 131 * pattern.hashCode() + 181 * expression.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(pattern), clone(expression));
    }
            
  }
  public boolean isNonEmptyBlock() {
    return false;
  }

  static public class NonEmptyBlock extends Expression {
    // Production: sig("NonEmptyBlock",[arg("java.util.List\<org.rascalmpl.ast.Statement\>","statements")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Statement> statements;
  
    public NonEmptyBlock(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Statement> statements) {
      super(src, node);
      
      this.statements = statements;
    }
  
    @Override
    public boolean isNonEmptyBlock() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNonEmptyBlock(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof NonEmptyBlock)) {
        return false;
      }        
      NonEmptyBlock tmp = (NonEmptyBlock) o;
      return true && tmp.statements.equals(this.statements) ; 
    }
   
    @Override
    public int hashCode() {
      return 353 + 113 * statements.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Statement> getStatements() {
      return this.statements;
    }
  
    @Override
    public boolean hasStatements() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(statements));
    }
            
  }
  public boolean isNonEquals() {
    return false;
  }

  static public class NonEquals extends Expression {
    // Production: sig("NonEquals",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public NonEquals(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isNonEquals() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNonEquals(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof NonEquals)) {
        return false;
      }        
      NonEquals tmp = (NonEquals) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 911 + 911 * lhs.hashCode() + 619 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isNotIn() {
    return false;
  }

  static public class NotIn extends Expression {
    // Production: sig("NotIn",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public NotIn(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isNotIn() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionNotIn(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof NotIn)) {
        return false;
      }        
      NotIn tmp = (NotIn) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 31 + 599 * lhs.hashCode() + 787 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isOr() {
    return false;
  }

  static public class Or extends Expression {
    // Production: sig("Or",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Or(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isOr() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionOr(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Or)) {
        return false;
      }        
      Or tmp = (Or) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 691 + 491 * lhs.hashCode() + 31 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isProduct() {
    return false;
  }

  static public class Product extends Expression {
    // Production: sig("Product",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Product(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isProduct() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionProduct(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Product)) {
        return false;
      }        
      Product tmp = (Product) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 107 + 769 * lhs.hashCode() + 769 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isQualifiedName() {
    return false;
  }

  static public class QualifiedName extends Expression {
    // Production: sig("QualifiedName",[arg("org.rascalmpl.ast.QualifiedName","qualifiedName")],breakable=false)
  
    
    private final org.rascalmpl.ast.QualifiedName qualifiedName;
  
    public QualifiedName(ISourceLocation src, IConstructor node , org.rascalmpl.ast.QualifiedName qualifiedName) {
      super(src, node);
      
      this.qualifiedName = qualifiedName;
    }
  
    @Override
    public boolean isQualifiedName() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionQualifiedName(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof QualifiedName)) {
        return false;
      }        
      QualifiedName tmp = (QualifiedName) o;
      return true && tmp.qualifiedName.equals(this.qualifiedName) ; 
    }
   
    @Override
    public int hashCode() {
      return 571 + 937 * qualifiedName.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.QualifiedName getQualifiedName() {
      return this.qualifiedName;
    }
  
    @Override
    public boolean hasQualifiedName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(qualifiedName));
    }
            
  }
  public boolean isRange() {
    return false;
  }

  static public class Range extends Expression {
    // Production: sig("Range",[arg("org.rascalmpl.ast.Expression","first"),arg("org.rascalmpl.ast.Expression","last")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression first;
    private final org.rascalmpl.ast.Expression last;
  
    public Range(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression first,  org.rascalmpl.ast.Expression last) {
      super(src, node);
      
      this.first = first;
      this.last = last;
    }
  
    @Override
    public boolean isRange() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionRange(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Range)) {
        return false;
      }        
      Range tmp = (Range) o;
      return true && tmp.first.equals(this.first) && tmp.last.equals(this.last) ; 
    }
   
    @Override
    public int hashCode() {
      return 919 + 821 * first.hashCode() + 17 * last.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getFirst() {
      return this.first;
    }
  
    @Override
    public boolean hasFirst() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getLast() {
      return this.last;
    }
  
    @Override
    public boolean hasLast() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(first), clone(last));
    }
            
  }
  public boolean isReducer() {
    return false;
  }

  static public class Reducer extends Expression {
    // Production: sig("Reducer",[arg("org.rascalmpl.ast.Expression","init"),arg("org.rascalmpl.ast.Expression","result"),arg("java.util.List\<org.rascalmpl.ast.Expression\>","generators")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression init;
    private final org.rascalmpl.ast.Expression result;
    private final java.util.List<org.rascalmpl.ast.Expression> generators;
  
    public Reducer(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression init,  org.rascalmpl.ast.Expression result,  java.util.List<org.rascalmpl.ast.Expression> generators) {
      super(src, node);
      
      this.init = init;
      this.result = result;
      this.generators = generators;
    }
  
    @Override
    public boolean isReducer() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionReducer(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Reducer)) {
        return false;
      }        
      Reducer tmp = (Reducer) o;
      return true && tmp.init.equals(this.init) && tmp.result.equals(this.result) && tmp.generators.equals(this.generators) ; 
    }
   
    @Override
    public int hashCode() {
      return 89 + 53 * init.hashCode() + 631 * result.hashCode() + 193 * generators.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getInit() {
      return this.init;
    }
  
    @Override
    public boolean hasInit() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getResult() {
      return this.result;
    }
  
    @Override
    public boolean hasResult() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getGenerators() {
      return this.generators;
    }
  
    @Override
    public boolean hasGenerators() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(init), clone(result), clone(generators));
    }
            
  }
  public boolean isReifiedType() {
    return false;
  }

  static public class ReifiedType extends Expression {
    // Production: sig("ReifiedType",[arg("org.rascalmpl.ast.Expression","symbol"),arg("org.rascalmpl.ast.Expression","definitions")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression symbol;
    private final org.rascalmpl.ast.Expression definitions;
  
    public ReifiedType(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression symbol,  org.rascalmpl.ast.Expression definitions) {
      super(src, node);
      
      this.symbol = symbol;
      this.definitions = definitions;
    }
  
    @Override
    public boolean isReifiedType() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionReifiedType(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof ReifiedType)) {
        return false;
      }        
      ReifiedType tmp = (ReifiedType) o;
      return true && tmp.symbol.equals(this.symbol) && tmp.definitions.equals(this.definitions) ; 
    }
   
    @Override
    public int hashCode() {
      return 23 + 47 * symbol.hashCode() + 307 * definitions.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getSymbol() {
      return this.symbol;
    }
  
    @Override
    public boolean hasSymbol() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getDefinitions() {
      return this.definitions;
    }
  
    @Override
    public boolean hasDefinitions() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(symbol), clone(definitions));
    }
            
  }
  public boolean isReifyType() {
    return false;
  }

  static public class ReifyType extends Expression {
    // Production: sig("ReifyType",[arg("org.rascalmpl.ast.Type","type")],breakable=false)
  
    
    private final org.rascalmpl.ast.Type type;
  
    public ReifyType(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Type type) {
      super(src, node);
      
      this.type = type;
    }
  
    @Override
    public boolean isReifyType() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionReifyType(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof ReifyType)) {
        return false;
      }        
      ReifyType tmp = (ReifyType) o;
      return true && tmp.type.equals(this.type) ; 
    }
   
    @Override
    public int hashCode() {
      return 773 + 523 * type.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Type getType() {
      return this.type;
    }
  
    @Override
    public boolean hasType() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(type));
    }
            
  }
  public boolean isRemainder() {
    return false;
  }

  static public class Remainder extends Expression {
    // Production: sig("Remainder",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Remainder(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isRemainder() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionRemainder(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Remainder)) {
        return false;
      }        
      Remainder tmp = (Remainder) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 97 + 149 * lhs.hashCode() + 461 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isSet() {
    return false;
  }

  static public class Set extends Expression {
    // Production: sig("Set",[arg("java.util.List\<org.rascalmpl.ast.Expression\>","elements0")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Expression> elements0;
  
    public Set(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Expression> elements0) {
      super(src, node);
      
      this.elements0 = elements0;
    }
  
    @Override
    public boolean isSet() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSet(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Set)) {
        return false;
      }        
      Set tmp = (Set) o;
      return true && tmp.elements0.equals(this.elements0) ; 
    }
   
    @Override
    public int hashCode() {
      return 659 + 631 * elements0.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getElements0() {
      return this.elements0;
    }
  
    @Override
    public boolean hasElements0() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(elements0));
    }
            
  }
  public boolean isSetAnnotation() {
    return false;
  }

  static public class SetAnnotation extends Expression {
    // Production: sig("SetAnnotation",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.Name","name"),arg("org.rascalmpl.ast.Expression","value")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.Name name;
    private final org.rascalmpl.ast.Expression value;
  
    public SetAnnotation(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.Name name,  org.rascalmpl.ast.Expression value) {
      super(src, node);
      
      this.expression = expression;
      this.name = name;
      this.value = value;
    }
  
    @Override
    public boolean isSetAnnotation() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSetAnnotation(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof SetAnnotation)) {
        return false;
      }        
      SetAnnotation tmp = (SetAnnotation) o;
      return true && tmp.expression.equals(this.expression) && tmp.name.equals(this.name) && tmp.value.equals(this.value) ; 
    }
   
    @Override
    public int hashCode() {
      return 569 + 37 * expression.hashCode() + 797 * name.hashCode() + 389 * value.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getValue() {
      return this.value;
    }
  
    @Override
    public boolean hasValue() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(name), clone(value));
    }
            
  }
  public boolean isSlice() {
    return false;
  }

  static public class Slice extends Expression {
    // Production: sig("Slice",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.OptionalExpression","optFirst"),arg("org.rascalmpl.ast.OptionalExpression","optLast")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.OptionalExpression optFirst;
    private final org.rascalmpl.ast.OptionalExpression optLast;
  
    public Slice(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.OptionalExpression optFirst,  org.rascalmpl.ast.OptionalExpression optLast) {
      super(src, node);
      
      this.expression = expression;
      this.optFirst = optFirst;
      this.optLast = optLast;
    }
  
    @Override
    public boolean isSlice() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSlice(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Slice)) {
        return false;
      }        
      Slice tmp = (Slice) o;
      return true && tmp.expression.equals(this.expression) && tmp.optFirst.equals(this.optFirst) && tmp.optLast.equals(this.optLast) ; 
    }
   
    @Override
    public int hashCode() {
      return 337 + 967 * expression.hashCode() + 83 * optFirst.hashCode() + 967 * optLast.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.OptionalExpression getOptFirst() {
      return this.optFirst;
    }
  
    @Override
    public boolean hasOptFirst() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.OptionalExpression getOptLast() {
      return this.optLast;
    }
  
    @Override
    public boolean hasOptLast() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(optFirst), clone(optLast));
    }
            
  }
  public boolean isSliceStep() {
    return false;
  }

  static public class SliceStep extends Expression {
    // Production: sig("SliceStep",[arg("org.rascalmpl.ast.Expression","expression"),arg("org.rascalmpl.ast.OptionalExpression","optFirst"),arg("org.rascalmpl.ast.Expression","second"),arg("org.rascalmpl.ast.OptionalExpression","optLast")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final org.rascalmpl.ast.OptionalExpression optFirst;
    private final org.rascalmpl.ast.Expression second;
    private final org.rascalmpl.ast.OptionalExpression optLast;
  
    public SliceStep(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  org.rascalmpl.ast.OptionalExpression optFirst,  org.rascalmpl.ast.Expression second,  org.rascalmpl.ast.OptionalExpression optLast) {
      super(src, node);
      
      this.expression = expression;
      this.optFirst = optFirst;
      this.second = second;
      this.optLast = optLast;
    }
  
    @Override
    public boolean isSliceStep() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSliceStep(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof SliceStep)) {
        return false;
      }        
      SliceStep tmp = (SliceStep) o;
      return true && tmp.expression.equals(this.expression) && tmp.optFirst.equals(this.optFirst) && tmp.second.equals(this.second) && tmp.optLast.equals(this.optLast) ; 
    }
   
    @Override
    public int hashCode() {
      return 769 + 487 * expression.hashCode() + 773 * optFirst.hashCode() + 223 * second.hashCode() + 569 * optLast.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.OptionalExpression getOptFirst() {
      return this.optFirst;
    }
  
    @Override
    public boolean hasOptFirst() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getSecond() {
      return this.second;
    }
  
    @Override
    public boolean hasSecond() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.OptionalExpression getOptLast() {
      return this.optLast;
    }
  
    @Override
    public boolean hasOptLast() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(optFirst), clone(second), clone(optLast));
    }
            
  }
  public boolean isSplice() {
    return false;
  }

  static public class Splice extends Expression {
    // Production: sig("Splice",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public Splice(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isSplice() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSplice(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Splice)) {
        return false;
      }        
      Splice tmp = (Splice) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 223 + 271 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isSplicePlus() {
    return false;
  }

  static public class SplicePlus extends Expression {
    // Production: sig("SplicePlus",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public SplicePlus(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isSplicePlus() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSplicePlus(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof SplicePlus)) {
        return false;
      }        
      SplicePlus tmp = (SplicePlus) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 73 + 257 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isStepRange() {
    return false;
  }

  static public class StepRange extends Expression {
    // Production: sig("StepRange",[arg("org.rascalmpl.ast.Expression","first"),arg("org.rascalmpl.ast.Expression","second"),arg("org.rascalmpl.ast.Expression","last")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression first;
    private final org.rascalmpl.ast.Expression second;
    private final org.rascalmpl.ast.Expression last;
  
    public StepRange(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression first,  org.rascalmpl.ast.Expression second,  org.rascalmpl.ast.Expression last) {
      super(src, node);
      
      this.first = first;
      this.second = second;
      this.last = last;
    }
  
    @Override
    public boolean isStepRange() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionStepRange(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof StepRange)) {
        return false;
      }        
      StepRange tmp = (StepRange) o;
      return true && tmp.first.equals(this.first) && tmp.second.equals(this.second) && tmp.last.equals(this.last) ; 
    }
   
    @Override
    public int hashCode() {
      return 911 + 691 * first.hashCode() + 653 * second.hashCode() + 563 * last.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getFirst() {
      return this.first;
    }
  
    @Override
    public boolean hasFirst() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getSecond() {
      return this.second;
    }
  
    @Override
    public boolean hasSecond() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getLast() {
      return this.last;
    }
  
    @Override
    public boolean hasLast() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(first), clone(second), clone(last));
    }
            
  }
  public boolean isSubscript() {
    return false;
  }

  static public class Subscript extends Expression {
    // Production: sig("Subscript",[arg("org.rascalmpl.ast.Expression","expression"),arg("java.util.List\<org.rascalmpl.ast.Expression\>","subscripts")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression expression;
    private final java.util.List<org.rascalmpl.ast.Expression> subscripts;
  
    public Subscript(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression expression,  java.util.List<org.rascalmpl.ast.Expression> subscripts) {
      super(src, node);
      
      this.expression = expression;
      this.subscripts = subscripts;
    }
  
    @Override
    public boolean isSubscript() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSubscript(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Subscript)) {
        return false;
      }        
      Subscript tmp = (Subscript) o;
      return true && tmp.expression.equals(this.expression) && tmp.subscripts.equals(this.subscripts) ; 
    }
   
    @Override
    public int hashCode() {
      return 571 + 887 * expression.hashCode() + 167 * subscripts.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getExpression() {
      return this.expression;
    }
  
    @Override
    public boolean hasExpression() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getSubscripts() {
      return this.subscripts;
    }
  
    @Override
    public boolean hasSubscripts() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(expression), clone(subscripts));
    }
            
  }
  public boolean isSubtraction() {
    return false;
  }

  static public class Subtraction extends Expression {
    // Production: sig("Subtraction",[arg("org.rascalmpl.ast.Expression","lhs"),arg("org.rascalmpl.ast.Expression","rhs")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression lhs;
    private final org.rascalmpl.ast.Expression rhs;
  
    public Subtraction(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression lhs,  org.rascalmpl.ast.Expression rhs) {
      super(src, node);
      
      this.lhs = lhs;
      this.rhs = rhs;
    }
  
    @Override
    public boolean isSubtraction() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionSubtraction(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Subtraction)) {
        return false;
      }        
      Subtraction tmp = (Subtraction) o;
      return true && tmp.lhs.equals(this.lhs) && tmp.rhs.equals(this.rhs) ; 
    }
   
    @Override
    public int hashCode() {
      return 733 + 131 * lhs.hashCode() + 641 * rhs.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getLhs() {
      return this.lhs;
    }
  
    @Override
    public boolean hasLhs() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getRhs() {
      return this.rhs;
    }
  
    @Override
    public boolean hasRhs() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(lhs), clone(rhs));
    }
            
  }
  public boolean isTransitiveClosure() {
    return false;
  }

  static public class TransitiveClosure extends Expression {
    // Production: sig("TransitiveClosure",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public TransitiveClosure(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isTransitiveClosure() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionTransitiveClosure(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof TransitiveClosure)) {
        return false;
      }        
      TransitiveClosure tmp = (TransitiveClosure) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 191 + 23 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isTransitiveReflexiveClosure() {
    return false;
  }

  static public class TransitiveReflexiveClosure extends Expression {
    // Production: sig("TransitiveReflexiveClosure",[arg("org.rascalmpl.ast.Expression","argument")],breakable=false)
  
    
    private final org.rascalmpl.ast.Expression argument;
  
    public TransitiveReflexiveClosure(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Expression argument) {
      super(src, node);
      
      this.argument = argument;
    }
  
    @Override
    public boolean isTransitiveReflexiveClosure() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionTransitiveReflexiveClosure(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof TransitiveReflexiveClosure)) {
        return false;
      }        
      TransitiveReflexiveClosure tmp = (TransitiveReflexiveClosure) o;
      return true && tmp.argument.equals(this.argument) ; 
    }
   
    @Override
    public int hashCode() {
      return 823 + 811 * argument.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Expression getArgument() {
      return this.argument;
    }
  
    @Override
    public boolean hasArgument() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(argument));
    }
            
  }
  public boolean isTuple() {
    return false;
  }

  static public class Tuple extends Expression {
    // Production: sig("Tuple",[arg("java.util.List\<org.rascalmpl.ast.Expression\>","elements")],breakable=false)
  
    
    private final java.util.List<org.rascalmpl.ast.Expression> elements;
  
    public Tuple(ISourceLocation src, IConstructor node , java.util.List<org.rascalmpl.ast.Expression> elements) {
      super(src, node);
      
      this.elements = elements;
    }
  
    @Override
    public boolean isTuple() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionTuple(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Tuple)) {
        return false;
      }        
      Tuple tmp = (Tuple) o;
      return true && tmp.elements.equals(this.elements) ; 
    }
   
    @Override
    public int hashCode() {
      return 773 + 113 * elements.hashCode() ; 
    } 
  
    
    @Override
    public java.util.List<org.rascalmpl.ast.Expression> getElements() {
      return this.elements;
    }
  
    @Override
    public boolean hasElements() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(elements));
    }
            
  }
  public boolean isTypedVariable() {
    return false;
  }

  static public class TypedVariable extends Expression {
    // Production: sig("TypedVariable",[arg("org.rascalmpl.ast.Type","type"),arg("org.rascalmpl.ast.Name","name")],breakable=false)
  
    
    private final org.rascalmpl.ast.Type type;
    private final org.rascalmpl.ast.Name name;
  
    public TypedVariable(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Type type,  org.rascalmpl.ast.Name name) {
      super(src, node);
      
      this.type = type;
      this.name = name;
    }
  
    @Override
    public boolean isTypedVariable() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionTypedVariable(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof TypedVariable)) {
        return false;
      }        
      TypedVariable tmp = (TypedVariable) o;
      return true && tmp.type.equals(this.type) && tmp.name.equals(this.name) ; 
    }
   
    @Override
    public int hashCode() {
      return 701 + 337 * type.hashCode() + 967 * name.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Type getType() {
      return this.type;
    }
  
    @Override
    public boolean hasType() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(type), clone(name));
    }
            
  }
  public boolean isTypedVariableBecomes() {
    return false;
  }

  static public class TypedVariableBecomes extends Expression {
    // Production: sig("TypedVariableBecomes",[arg("org.rascalmpl.ast.Type","type"),arg("org.rascalmpl.ast.Name","name"),arg("org.rascalmpl.ast.Expression","pattern")],breakable=false)
  
    
    private final org.rascalmpl.ast.Type type;
    private final org.rascalmpl.ast.Name name;
    private final org.rascalmpl.ast.Expression pattern;
  
    public TypedVariableBecomes(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Type type,  org.rascalmpl.ast.Name name,  org.rascalmpl.ast.Expression pattern) {
      super(src, node);
      
      this.type = type;
      this.name = name;
      this.pattern = pattern;
    }
  
    @Override
    public boolean isTypedVariableBecomes() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionTypedVariableBecomes(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof TypedVariableBecomes)) {
        return false;
      }        
      TypedVariableBecomes tmp = (TypedVariableBecomes) o;
      return true && tmp.type.equals(this.type) && tmp.name.equals(this.name) && tmp.pattern.equals(this.pattern) ; 
    }
   
    @Override
    public int hashCode() {
      return 761 + 823 * type.hashCode() + 359 * name.hashCode() + 397 * pattern.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Type getType() {
      return this.type;
    }
  
    @Override
    public boolean hasType() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(type), clone(name), clone(pattern));
    }
            
  }
  public boolean isVariableBecomes() {
    return false;
  }

  static public class VariableBecomes extends Expression {
    // Production: sig("VariableBecomes",[arg("org.rascalmpl.ast.Name","name"),arg("org.rascalmpl.ast.Expression","pattern")],breakable=false)
  
    
    private final org.rascalmpl.ast.Name name;
    private final org.rascalmpl.ast.Expression pattern;
  
    public VariableBecomes(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Name name,  org.rascalmpl.ast.Expression pattern) {
      super(src, node);
      
      this.name = name;
      this.pattern = pattern;
    }
  
    @Override
    public boolean isVariableBecomes() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionVariableBecomes(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof VariableBecomes)) {
        return false;
      }        
      VariableBecomes tmp = (VariableBecomes) o;
      return true && tmp.name.equals(this.name) && tmp.pattern.equals(this.pattern) ; 
    }
   
    @Override
    public int hashCode() {
      return 839 + 149 * name.hashCode() + 743 * pattern.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Name getName() {
      return this.name;
    }
  
    @Override
    public boolean hasName() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Expression getPattern() {
      return this.pattern;
    }
  
    @Override
    public boolean hasPattern() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(name), clone(pattern));
    }
            
  }
  public boolean isVisit() {
    return false;
  }

  static public class Visit extends Expression {
    // Production: sig("Visit",[arg("org.rascalmpl.ast.Label","label"),arg("org.rascalmpl.ast.Visit","visit")],breakable=false)
  
    
    private final org.rascalmpl.ast.Label label;
    private final org.rascalmpl.ast.Visit visit;
  
    public Visit(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Label label,  org.rascalmpl.ast.Visit visit) {
      super(src, node);
      
      this.label = label;
      this.visit = visit;
    }
  
    @Override
    public boolean isVisit() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionVisit(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Visit)) {
        return false;
      }        
      Visit tmp = (Visit) o;
      return true && tmp.label.equals(this.label) && tmp.visit.equals(this.visit) ; 
    }
   
    @Override
    public int hashCode() {
      return 151 + 47 * label.hashCode() + 877 * visit.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Label getLabel() {
      return this.label;
    }
  
    @Override
    public boolean hasLabel() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Visit getVisit() {
      return this.visit;
    }
  
    @Override
    public boolean hasVisit() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(label), clone(visit));
    }
            
  }
  public boolean isVoidClosure() {
    return false;
  }

  static public class VoidClosure extends Expression {
    // Production: sig("VoidClosure",[arg("org.rascalmpl.ast.Parameters","parameters"),arg("java.util.List\<org.rascalmpl.ast.Statement\>","statements0")],breakable=false)
  
    
    private final org.rascalmpl.ast.Parameters parameters;
    private final java.util.List<org.rascalmpl.ast.Statement> statements0;
  
    public VoidClosure(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Parameters parameters,  java.util.List<org.rascalmpl.ast.Statement> statements0) {
      super(src, node);
      
      this.parameters = parameters;
      this.statements0 = statements0;
    }
  
    @Override
    public boolean isVoidClosure() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitExpressionVoidClosure(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof VoidClosure)) {
        return false;
      }        
      VoidClosure tmp = (VoidClosure) o;
      return true && tmp.parameters.equals(this.parameters) && tmp.statements0.equals(this.statements0) ; 
    }
   
    @Override
    public int hashCode() {
      return 877 + 733 * parameters.hashCode() + 307 * statements0.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Parameters getParameters() {
      return this.parameters;
    }
  
    @Override
    public boolean hasParameters() {
      return true;
    }
    @Override
    public java.util.List<org.rascalmpl.ast.Statement> getStatements0() {
      return this.statements0;
    }
  
    @Override
    public boolean hasStatements0() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(parameters), clone(statements0));
    }
            
  }
}