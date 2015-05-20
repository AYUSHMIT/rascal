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

public abstract class SyntaxDefinition extends AbstractAST {
  public SyntaxDefinition(ISourceLocation src, IConstructor node) {
    super(src /* we forget node on purpose */);
  }

  
  public boolean hasProduction() {
    return false;
  }

  public org.rascalmpl.ast.Prod getProduction() {
    throw new UnsupportedOperationException();
  }
  public boolean hasStart() {
    return false;
  }

  public org.rascalmpl.ast.Start getStart() {
    throw new UnsupportedOperationException();
  }
  public boolean hasDefined() {
    return false;
  }

  public org.rascalmpl.ast.Sym getDefined() {
    throw new UnsupportedOperationException();
  }
  public boolean hasVis() {
    return false;
  }

  public org.rascalmpl.ast.Visibility getVis() {
    throw new UnsupportedOperationException();
  }

  

  
  public boolean isKeyword() {
    return false;
  }

  static public class Keyword extends SyntaxDefinition {
    // Production: sig("Keyword",[arg("org.rascalmpl.ast.Sym","defined"),arg("org.rascalmpl.ast.Prod","production")],breakable=false)
  
    
    private final org.rascalmpl.ast.Sym defined;
    private final org.rascalmpl.ast.Prod production;
  
    public Keyword(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Sym defined,  org.rascalmpl.ast.Prod production) {
      super(src, node);
      
      this.defined = defined;
      this.production = production;
    }
  
    @Override
    public boolean isKeyword() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitSyntaxDefinitionKeyword(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Keyword)) {
        return false;
      }        
      Keyword tmp = (Keyword) o;
      return true && tmp.defined.equals(this.defined) && tmp.production.equals(this.production) ; 
    }
   
    @Override
    public int hashCode() {
      return 191 + 991 * defined.hashCode() + 23 * production.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Sym getDefined() {
      return this.defined;
    }
  
    @Override
    public boolean hasDefined() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Prod getProduction() {
      return this.production;
    }
  
    @Override
    public boolean hasProduction() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(defined), clone(production));
    }
            
  }
  public boolean isLanguage() {
    return false;
  }

  static public class Language extends SyntaxDefinition {
    // Production: sig("Language",[arg("org.rascalmpl.ast.Start","start"),arg("org.rascalmpl.ast.Sym","defined"),arg("org.rascalmpl.ast.Prod","production")],breakable=false)
  
    
    private final org.rascalmpl.ast.Start start;
    private final org.rascalmpl.ast.Sym defined;
    private final org.rascalmpl.ast.Prod production;
  
    public Language(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Start start,  org.rascalmpl.ast.Sym defined,  org.rascalmpl.ast.Prod production) {
      super(src, node);
      
      this.start = start;
      this.defined = defined;
      this.production = production;
    }
  
    @Override
    public boolean isLanguage() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitSyntaxDefinitionLanguage(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Language)) {
        return false;
      }        
      Language tmp = (Language) o;
      return true && tmp.start.equals(this.start) && tmp.defined.equals(this.defined) && tmp.production.equals(this.production) ; 
    }
   
    @Override
    public int hashCode() {
      return 839 + 661 * start.hashCode() + 173 * defined.hashCode() + 823 * production.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Start getStart() {
      return this.start;
    }
  
    @Override
    public boolean hasStart() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Sym getDefined() {
      return this.defined;
    }
  
    @Override
    public boolean hasDefined() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Prod getProduction() {
      return this.production;
    }
  
    @Override
    public boolean hasProduction() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(start), clone(defined), clone(production));
    }
            
  }
  public boolean isLayout() {
    return false;
  }

  static public class Layout extends SyntaxDefinition {
    // Production: sig("Layout",[arg("org.rascalmpl.ast.Visibility","vis"),arg("org.rascalmpl.ast.Sym","defined"),arg("org.rascalmpl.ast.Prod","production")],breakable=false)
  
    
    private final org.rascalmpl.ast.Visibility vis;
    private final org.rascalmpl.ast.Sym defined;
    private final org.rascalmpl.ast.Prod production;
  
    public Layout(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Visibility vis,  org.rascalmpl.ast.Sym defined,  org.rascalmpl.ast.Prod production) {
      super(src, node);
      
      this.vis = vis;
      this.defined = defined;
      this.production = production;
    }
  
    @Override
    public boolean isLayout() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitSyntaxDefinitionLayout(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Layout)) {
        return false;
      }        
      Layout tmp = (Layout) o;
      return true && tmp.vis.equals(this.vis) && tmp.defined.equals(this.defined) && tmp.production.equals(this.production) ; 
    }
   
    @Override
    public int hashCode() {
      return 829 + 257 * vis.hashCode() + 599 * defined.hashCode() + 659 * production.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Visibility getVis() {
      return this.vis;
    }
  
    @Override
    public boolean hasVis() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Sym getDefined() {
      return this.defined;
    }
  
    @Override
    public boolean hasDefined() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Prod getProduction() {
      return this.production;
    }
  
    @Override
    public boolean hasProduction() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(vis), clone(defined), clone(production));
    }
            
  }
  public boolean isLexical() {
    return false;
  }

  static public class Lexical extends SyntaxDefinition {
    // Production: sig("Lexical",[arg("org.rascalmpl.ast.Sym","defined"),arg("org.rascalmpl.ast.Prod","production")],breakable=false)
  
    
    private final org.rascalmpl.ast.Sym defined;
    private final org.rascalmpl.ast.Prod production;
  
    public Lexical(ISourceLocation src, IConstructor node , org.rascalmpl.ast.Sym defined,  org.rascalmpl.ast.Prod production) {
      super(src, node);
      
      this.defined = defined;
      this.production = production;
    }
  
    @Override
    public boolean isLexical() { 
      return true; 
    }
  
    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
      return visitor.visitSyntaxDefinitionLexical(this);
    }
  
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Lexical)) {
        return false;
      }        
      Lexical tmp = (Lexical) o;
      return true && tmp.defined.equals(this.defined) && tmp.production.equals(this.production) ; 
    }
   
    @Override
    public int hashCode() {
      return 757 + 947 * defined.hashCode() + 797 * production.hashCode() ; 
    } 
  
    
    @Override
    public org.rascalmpl.ast.Sym getDefined() {
      return this.defined;
    }
  
    @Override
    public boolean hasDefined() {
      return true;
    }
    @Override
    public org.rascalmpl.ast.Prod getProduction() {
      return this.production;
    }
  
    @Override
    public boolean hasProduction() {
      return true;
    }	
  
    @Override
    public Object clone()  {
      return newInstance(getClass(), src, (IConstructor) null , clone(defined), clone(production));
    }
            
  }
}