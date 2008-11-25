package org.meta_environment.rascal.interpreter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.imp.pdb.facts.IBool;
import org.eclipse.imp.pdb.facts.IDouble;
import org.eclipse.imp.pdb.facts.IInteger;
import org.eclipse.imp.pdb.facts.IList;
import org.eclipse.imp.pdb.facts.IListWriter;
import org.eclipse.imp.pdb.facts.IMap;
import org.eclipse.imp.pdb.facts.IMapWriter;
import org.eclipse.imp.pdb.facts.ISet;
import org.eclipse.imp.pdb.facts.ISetWriter;
import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.type.ListType;
import org.eclipse.imp.pdb.facts.type.MapType;
import org.eclipse.imp.pdb.facts.type.SetType;
import org.eclipse.imp.pdb.facts.type.Type;
import org.eclipse.imp.pdb.facts.type.TypeFactory;
import org.meta_environment.rascal.ast.Assignable;
import org.meta_environment.rascal.ast.FunctionBody;
import org.meta_environment.rascal.ast.FunctionDeclaration;
import org.meta_environment.rascal.ast.Generator;
import org.meta_environment.rascal.ast.NullASTVisitor;
import org.meta_environment.rascal.ast.Return;
import org.meta_environment.rascal.ast.Signature;
import org.meta_environment.rascal.ast.Statement;
import org.meta_environment.rascal.ast.ValueProducer;
import org.meta_environment.rascal.ast.Expression.Addition;
import org.meta_environment.rascal.ast.Expression.And;
import org.meta_environment.rascal.ast.Expression.CallOrTree;
import org.meta_environment.rascal.ast.Expression.Comprehension;
import org.meta_environment.rascal.ast.Expression.EmptySetOrBlock;
import org.meta_environment.rascal.ast.Expression.GreaterThan;
import org.meta_environment.rascal.ast.Expression.GreaterThanOrEq;
import org.meta_environment.rascal.ast.Expression.In;
import org.meta_environment.rascal.ast.Expression.Intersection;
import org.meta_environment.rascal.ast.Expression.LessThan;
import org.meta_environment.rascal.ast.Expression.LessThanOrEq;
import org.meta_environment.rascal.ast.Expression.List;
import org.meta_environment.rascal.ast.Expression.Literal;
import org.meta_environment.rascal.ast.Expression.Negation;
import org.meta_environment.rascal.ast.Expression.NonEmptyBlock;
import org.meta_environment.rascal.ast.Expression.NonEmptySet;
import org.meta_environment.rascal.ast.Expression.NotIn;
import org.meta_environment.rascal.ast.Expression.Or;
import org.meta_environment.rascal.ast.Expression.Product;
import org.meta_environment.rascal.ast.Expression.Subscript;
import org.meta_environment.rascal.ast.Expression.Subtraction;
import org.meta_environment.rascal.ast.Expression.Tuple;
import org.meta_environment.rascal.ast.IntegerLiteral.DecimalIntegerLiteral;
import org.meta_environment.rascal.ast.Literal.Boolean;
import org.meta_environment.rascal.ast.Literal.Double;
import org.meta_environment.rascal.ast.Literal.Integer;
import org.meta_environment.rascal.ast.LocalVariableDeclaration.Default;
import org.meta_environment.rascal.ast.Statement.Assert;
import org.meta_environment.rascal.ast.Statement.Assignment;
import org.meta_environment.rascal.ast.Statement.Block;
import org.meta_environment.rascal.ast.Statement.Expression;
import org.meta_environment.rascal.ast.Statement.Fail;
import org.meta_environment.rascal.ast.Statement.For;
import org.meta_environment.rascal.ast.Statement.IfThen;
import org.meta_environment.rascal.ast.Statement.IfThenElse;
import org.meta_environment.rascal.ast.Statement.Insert;
import org.meta_environment.rascal.ast.Statement.VariableDeclaration;
import org.meta_environment.rascal.ast.Statement.While;

class EResult {
	protected Type type;
	protected IValue value;

	public EResult(Type t, IValue v) {
		type = t;
		value = v;
		if (value != null && !value.getType().isSubtypeOf(t)) {
			throw new RascalTypeError("Value " + v + " is not a subtype of "
					+ t);
		}
	}

	public String toString() {
		return "EResult(" + type + ", " + value + ")";
	}
}

class FailureException extends RuntimeException {
	private static final long serialVersionUID = 2774285953244945424L;
	private String fLabel;
	private FailureException() { };
	
	private static class InstanceHolder {
		public static FailureException sInstance = new FailureException();
	}
	
	public static synchronized FailureException getInstance(String label) {
		return InstanceHolder.sInstance.setLabel(label);
	}
	
	public static synchronized FailureException getInstance() {
		return InstanceHolder.sInstance.setLabel(null);
	}
	
	private synchronized FailureException setLabel(String label) {
		fLabel = label;
		return this;
	}
	
	public String getLabel() {
		return fLabel;
	}
	
	public boolean hasLabel() {
		return fLabel != null;
	}
}

/**
 * Warning: this is not a thread safe implementation. The idea however is
 * to not create a stack trace every time a Return exception is needed.
 * @author jurgenv
 *
 */
class ReturnException extends RuntimeException {
	private static final long serialVersionUID = -6601026099925601817L;
    private EResult fValue;
	
    private ReturnException() { };
	
	private static class InstanceHolder {
		public static ReturnException sInstance = new ReturnException();
	}
	
	public static synchronized ReturnException getInstance(EResult value) {
		return InstanceHolder.sInstance.setValue(value);
	}
	
	private synchronized ReturnException setValue(EResult value) {
		fValue = value;
		return this;
	}
	
	public EResult getValue() {
		return fValue;
	}
}

/**
 * Warning: this is not a thread safe implementation. The idea however is
 * to not create a stack trace every time a Return exception is needed.
 * @author jurgenv
 *
 */
class InsertException extends RuntimeException {
	private static final long serialVersionUID = -6601026099925601817L;
    private EResult fValue;
	
    private InsertException() { };
	
	private static class InstanceHolder {
		public static InsertException sInstance = new InsertException();
	}
	
	public static synchronized InsertException getInstance(EResult value) {
		return InstanceHolder.sInstance.setValue(value);
	}
	
	private synchronized InsertException setValue(EResult value) {
		fValue = value;
		return this;
	}
	
	public EResult getValue() {
		return fValue;
	}
}

public class Evaluator extends NullASTVisitor<EResult> {
	private IValueFactory vf;
	private final TypeFactory tf;
	private final TypeEvaluator te = new TypeEvaluator();
	private final Map<String, EResult> variableEnvironment = new HashMap<String, EResult>();
	private final Map<String, org.meta_environment.rascal.ast.FunctionDeclaration> functionEnvironment = 
		                       new HashMap<String, org.meta_environment.rascal.ast.FunctionDeclaration>();
	
	private final EResult voidResult;

	public Evaluator(IValueFactory f) {
		this.vf = f;
		tf = TypeFactory.getInstance();
		voidResult = result(vf.bool(false));
	}

	private EResult result(Type t, IValue v) {
		return new EResult(t, v);
	}

	private EResult result(IValue v) {
		return new EResult(v != null ? v.getType() : null, v);
	}
	
	private EResult result() {
		return new EResult(null, null);
	}
	
	private EResult notImplemented(String s){
		throw new RascalTypeError(s + " not yet implemented");
	}

	public IValue eval(Statement S) {
		EResult r = S.accept(this);
        if(r != null){
        	return r.value;
        } else {
        	return voidResult.value;
        }
	}
	
	// Variable Declarations -----------------------------------------------

	@Override
	public EResult visitLocalVariableDeclarationDefault(Default x) {
		return x.getDeclarator().accept(this);
	}

	@Override
	public EResult visitDeclaratorDefault(
			org.meta_environment.rascal.ast.Declarator.Default x) {
		Type declaredType = x.getType().accept(te);
		EResult r = voidResult;

		for (org.meta_environment.rascal.ast.Variable var : x.getVariables()) {
			String name = var.getName().toString();
			if (var.isUnInitialized()) {  // variable declaration without initialization
				r = result(declaredType, null);
				storeVariable(name, r);
			} else {                     // variable declaration with initialization
				EResult v = var.getInitial().accept(this);
				if(v.type.isSubtypeOf(declaredType)){
					r = result(declaredType, v.value);
					storeVariable(name, r);
				} else {
					throw new RascalTypeError("variable " + name + ", declared type " + declaredType + " incompatible with initial type " + v.type);
				}
			}
		}
		return r;
	}
	
	@Override
	
	public EResult visitExpressionCallOrTree(CallOrTree x) {
		 org.meta_environment.rascal.ast.FunctionDeclaration functionDeclaration = functionEnvironment.get(x.getName().toString());
		 
		 if (functionDeclaration == null) {
			 throw new RascalTypeError("Call to undefined function:" + x.getName());
		 }
		 
		 try {
		   // TODO: finish this by binding formal to actual parameters
		   x.accept(this);
		 }
		 catch (ReturnException e) {
			 return e.getValue();
		 }
		 
		 throw new RascalTypeError("Function " + x.getName() + " does not have a return statement.");
	}

	
	
   // Statements ---------------------------------------------------------
	
	@Override
	public EResult visitStatementAssert(Assert x) {
		String msg = x.getMessage().toString();
		EResult r = x.getExpression().accept(this);
		if(r.type.equals(tf.boolType())){
			if(r.value.equals(vf.bool(false))){
				System.err.println("Assertion failed: " + msg + "\n");
			}
		} else {
			throw new RascalTypeError("expression in assertion should be bool instead of " + r.type);
		}
		return r;	
	}
	
	@Override
	public EResult visitStatementVariableDeclaration(VariableDeclaration x) {
		return x.getDeclaration().accept(this);
	}
	
	@Override
	public EResult visitStatementExpression(Expression x) {
		return x.getExpression().accept(this);
	}
	
	private EResult assignVariable(String name, EResult right){
		EResult previous = getVariable(name);
		if (previous != null) {
			if (right.type.isSubtypeOf(previous.type)) {
				right.type = previous.type;
			} else {
				throw new RascalTypeError("Variable " + name
						+ " has type " + previous.type
						+ "; cannot assign value of type " + right.type);
			}
		}
		storeVariable(name, right);
		return right;
	}

	private void storeVariable(String name, EResult value) {
		variableEnvironment.put(name, value);
		System.err.println("put(" + name + ", " + value + ")");
	}
	
	private int getValidIndex(EResult subs){
		if(!subs.type.isSubtypeOf(tf.integerType())){
			throw new RascalTypeError("subscript should have type int instead of " + subs.type);
		}
		return ((IInteger) subs.value).getValue();
	}
	
	private Type checkValidListSubscription(EResult previous, EResult subs, int index){
		if (previous != null) {
			if(previous.type.isListType()){
				Type elementType = ((ListType) previous.type).getElementType();
				if((index < 0) || index >= ((IList) previous.value).length()){
					throw new RascalTypeError("subscript " + index + " out of bounds");
				}
				return elementType;
			} else {
				notImplemented("index in assignment");
			}
		} else {
			throw new RascalTypeError("subscription for unnitialized variable ");
		}
		return null;
	}
	
	private Type checkValidListSubscription(String name, EResult subs, int index){
		EResult previous = getVariable(name);
		return checkValidListSubscription(previous, subs, index);
	}
	
	private EResult assignSubscriptedVariable(
			String name, EResult subs, EResult right) {
		
		int index = getValidIndex(subs);
		EResult previous = getVariable(name);
		
		if (previous != null) {
			if(previous.type.isListType()){
				Type elementType = checkValidListSubscription(name, subs, index);
				if (right.type.isSubtypeOf(elementType)) {
					right.type = elementType;
				} else {
					throw new RascalTypeError("subscripted variable " + name
							+ " has element type " + elementType
							+ "; cannot assign value of type " + right.type);
				}
				IValue newValue = ((IList) previous.value).put(index, right.value);
				EResult nw = result(elementType, newValue);
				storeVariable(name, nw);
				return nw;
			} else {
				notImplemented("index in assignment");
			}
	} else {
			throw new RascalTypeError("cannot assign to unnitialized subscripted variable " + name);
		}
		return null;
	}

	private EResult getVariable(String name) {
		return variableEnvironment.get(name);
	}
	
	private EResult assign(Assignable a, EResult right){

		if (a.isVariable()) {
			return assignVariable(a.getQualifiedName().toString(), right);		
		}
		else if(a.isSubscript()){
			EResult subs = a.getSubscript().accept(this);
			return assignSubscriptedVariable(a.getReceiver().getQualifiedName().toString(), subs, right);
		}
		return voidResult;
	}
	
	@Override
	public EResult visitExpressionSubscript(Subscript x) {
		EResult subs = x.getSubscript().accept(this);
		org.meta_environment.rascal.ast.Expression expr = x.getExpression();
		int index = getValidIndex(subs);
		if(expr.isQualifiedName()){
			String name = expr.getQualifiedName().toString();
			checkValidListSubscription(name, subs, index);
			return result(((IList)getVariable(name).value).get(index));
		} else if(expr.isSubscript()){
			EResult r = expr.accept(this);
			checkValidListSubscription(r, subs, index);
			return result(((IList) r.value).get(index));
		}
		return null;
	}

	@Override
	public EResult visitStatementFail(Fail x) {
		if (x.getFail().isWithLabel()) {
			throw FailureException.getInstance(x.getFail().getLabel().toString());
		}
		else {
		  throw FailureException.getInstance();
		}
	}
	
	@Override
	public EResult visitStatementReturn(
			org.meta_environment.rascal.ast.Statement.Return x) {
		org.meta_environment.rascal.ast.Return r = x.getRet();
		
		if (r.isWithExpression()) {
		  throw ReturnException.getInstance(x.getRet().getExpression().accept(this));
		}
		else {
			throw ReturnException.getInstance(result());
		}
	}
	
	@Override
	public EResult visitStatementInsert(Insert x) {
		throw InsertException.getInstance(x.getExpression().accept(this));
	}
	
	@Override
	public EResult visitStatementAssignment(Assignment x) {
		Assignable a = x.getAssignable();
		org.meta_environment.rascal.ast.Assignment op = x.getOperator();
		EResult right = x.getExpression().accept(this);

		if (op.isDefault()) {
			return assign(a, right);
		}
		return voidResult;
	}
	
	@Override
	public EResult visitStatementBlock(Block x) {
		EResult r = voidResult;
		for(Statement stat : x.getStatements()){
			r = stat.accept(this);
		}
		return r;
	}
    // Function declarations -----------------------------------------
	
	class FunctionDeclaration {
		Signature signature;
		FunctionBody body;
		
		FunctionDeclaration(Signature s, FunctionBody b){
			signature = s;
			body = b;
		}
	}
	
	@Override
	public EResult visitFunctionDeclarationDefault(
			org.meta_environment.rascal.ast.FunctionDeclaration.Default x) {
		Signature sig = x.getSignature();
		String name = sig.getName().toString();
		// TODO: check overloading, double declarations, etc.
		functionEnvironment.put(name,(org.meta_environment.rascal.ast.FunctionDeclaration)x);
		return voidResult;
	}
	
	@Override
	public EResult visitStatementIfThenElse(IfThenElse x) {
		for (org.meta_environment.rascal.ast.Expression expr : x
				.getConditions()) {
			EResult cval = expr.accept(this);
			if (cval.type.isBoolType()) {
				if (cval.value.equals(vf.bool(false))) {
					return x.getElseStatement().accept(this);
				}
			} else {
				throw new RascalTypeError("Condition " + expr + " has type "
						+ cval.type + " but should be bool");
			}
		}
		return x.getThenStatement().accept(this);
	}

	@Override
	public EResult visitStatementIfThen(IfThen x) {
		for (org.meta_environment.rascal.ast.Expression expr : x
				.getConditions()) {
			EResult cval = expr.accept(this);
			if (cval.type.isBoolType()) {
				if (cval.value.equals(vf.bool(false))) {
					return voidResult;
				}
			} else {
				throw new RascalTypeError("Condition " + expr + " has type "
						+ cval.type + " but should be bool");
			}
		}
		return x.getThenStatement().accept(this);
	}

	@Override
	public EResult visitStatementWhile(While x) {
		org.meta_environment.rascal.ast.Expression expr = x.getCondition();
		do {
			EResult cval = expr.accept(this);

			if (cval.type.isBoolType()) {
				if (cval.value.equals(vf.bool(false))) {
					return voidResult;
				} else {
					x.getBody().accept(this);
				}
			} else {
				throw new RascalTypeError("Condition " + expr + " has type "
						+ cval.type + " but should be bool");
			}
		} while (true);
	}
	
	//@Override
	public EResult visitStatementDoWhile(While x) {
		org.meta_environment.rascal.ast.Expression expr = x.getCondition();
		do {
			x.getBody().accept(this);
			EResult cval = expr.accept(this);
			if (cval.type.isBoolType()) {
				if (cval.value.equals(vf.bool(false))) {
					return voidResult;
				}
			} else {
				throw new RascalTypeError("Condition " + expr + " has type "
						+ cval.type + " but should be bool");
			}
		} while (true);
	}
	
	// Expressions -----------------------------------------------------------

	@Override
	public EResult visitExpressionLiteral(Literal x) {
		return x.getLiteral().accept(this);
	}

	@Override
	public EResult visitLiteralInteger(Integer x) {
		return x.getIntegerLiteral().accept(this);
	}

	@Override
	public EResult visitLiteralDouble(Double x) {
		String str = x.getDoubleLiteral().toString();
		return result(vf.dubble(java.lang.Double.parseDouble(str)));
	}

	@Override
	public EResult visitLiteralBoolean(Boolean x) {
		String str = x.getBooleanLiteral().toString();
		return result(vf.bool(str.equals("true")));
	}

	@Override
	public EResult visitLiteralString(
			org.meta_environment.rascal.ast.Literal.String x) {
		String str = x.getStringLiteral().toString();
		return result(vf.string(deescape(str)));
	}

	private String deescape(String str) {
		// TODO implement this
		return str;
	}

	@Override
	public EResult visitIntegerLiteralDecimalIntegerLiteral(
			DecimalIntegerLiteral x) {
		String str = x.getDecimal().toString();
		return result(vf.integer(java.lang.Integer.parseInt(str)));
	}
	
	@Override
	public EResult visitExpressionQualifiedName(
			org.meta_environment.rascal.ast.Expression.QualifiedName x) {
		EResult result = getVariable(x.getQualifiedName().toString());
		if (result != null && result.value != null) {
			return result;
		} else {
			throw new RascalTypeError("Uninitialized variable: " + x);
		}
	}
	
	
	@Override
	public EResult visitExpressionList(List x) {
		java.util.List<org.meta_environment.rascal.ast.Expression> elements = x
				.getElements();
		java.util.List<IValue> results = new LinkedList<IValue>();
		Type elementType = evaluateElements(elements, results);

		ListType resultType = tf.listType(elementType);
		IListWriter w = resultType.writer(vf);
		w.appendAll(results);
		return result(resultType, w.done());
	}

	@Override
	public EResult visitExpressionNonEmptySet(NonEmptySet x) {
		java.util.List<org.meta_environment.rascal.ast.Expression> elements = x
				.getElements();
		java.util.List<IValue> results = new LinkedList<IValue>();
		Type elementType = evaluateElements(elements, results);

		SetType resultType = tf.setType(elementType);
		ISetWriter w = resultType.writer(vf);
		w.insertAll(results);
		return result(resultType, w.done());
	}

	private Type evaluateElements(
			java.util.List<org.meta_environment.rascal.ast.Expression> elements,
			java.util.List<IValue> results) {
		Type elementType = tf.voidType();

		for (org.meta_environment.rascal.ast.Expression expr : elements) {
			EResult resultElem = expr.accept(this);
			elementType = elementType.lub(resultElem.type);
			results.add(results.size(), resultElem.value);
		}
		return elementType;
	}

	@Override
	public EResult visitExpressionEmptySetOrBlock(EmptySetOrBlock x) {
		return result(vf.set(tf.voidType()));
	}
	
	@Override
	public EResult visitExpressionMap(
			org.meta_environment.rascal.ast.Expression.Map x) {

		java.util.List<org.meta_environment.rascal.ast.Mapping> mappings = x
				.getMappings();
		Map<IValue,IValue> result = new HashMap<IValue,IValue>();
		Type keyType = tf.voidType();
		Type valueType = tf.voidType();

		for (org.meta_environment.rascal.ast.Mapping mapping : mappings) {
			EResult keyResult = mapping.getFrom().accept(this);
			EResult valueResult = mapping.getTo().accept(this);
			
			keyType = keyType.lub(keyResult.type);
			valueType = valueType.lub(valueResult.type);
			
			result.put(keyResult.value, valueResult.value);
		}
		
		MapType type = tf.mapType(keyType, valueType);
		IMapWriter w = type.writer(vf);
		w.putAll(result);
		
		return result(type, w.done());
	}

	
	@Override
	public EResult visitExpressionNonEmptyBlock(NonEmptyBlock x) {
		EResult r = voidResult;
		for(Statement stat : x.getStatements()){
			r = stat.accept(this);
		}
		return r;
	}

	@Override
	public EResult visitExpressionTuple(Tuple x) {
		java.util.List<org.meta_environment.rascal.ast.Expression> elements = x
				.getElements();

		IValue[] values = new IValue[elements.size()];
		Type[] types = new Type[elements.size()];

		for (int i = 0; i < elements.size(); i++) {
			EResult resultElem = elements.get(i).accept(this);
			types[i] = resultElem.type;
			values[i] = resultElem.value;
		}

		return result(tf.tupleType(types), vf.tuple(values));
	}
	
	
	
	
	
    @Override
	public EResult visitExpressionAddition(Addition x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);

		if (left.type.isIntegerType() && right.type.isIntegerType()) {
			return result(((IInteger) left.value).add((IInteger) right.value));
		} else if (left.type.isDoubleType() && right.type.isDoubleType()) {
			return result(((IDouble) left.value).add((IDouble) right.value));
		} else if (left.type.isStringType() && right.type.isStringType()) {
			return result(vf.string(((IString) left.value).getValue()
					+ ((IString) right.value).getValue()));
		} else if (left.type.isListType() && right.type.isListType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((IList) left.value)
					.concat((IList) right.value));
		} else if (left.type.isSetType() && right.type.isSetType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((ISet) left.value)
					.union((ISet) right.value));
		} else if (left.type.isMapType() && right.type.isMapType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((IMap) left.value)              //TODO: is this the right operation?
					.join((IMap) right.value));
		} else if (left.type.isRelationType() && right.type.isRelationType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((ISet) left.value)
					.union((ISet) right.value));
		} else {
			throw new RascalTypeError("Operands of + have illegal types: "
					+ left.type + ", " + right.type);
		}
	}
    
	public EResult visitExpressionSubtraction(Subtraction x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);

		if (left.type.isIntegerType() && right.type.isIntegerType()) {
			return result(((IInteger) left.value).subtract((IInteger) right.value));
		} else if (left.type.isDoubleType() && right.type.isDoubleType()) {
			return result(((IDouble) left.value).subtract((IDouble) right.value));
		} else if (left.type.isListType() && right.type.isListType()) {
			notImplemented("- on list");
		} else if (left.type.isSetType() && right.type.isSetType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((ISet) left.value)
					.subtract((ISet) right.value));
		} else if (left.type.isMapType() && right.type.isMapType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((IMap) left.value)
					.remove((IMap) right.value));
		} else if (left.type.isRelationType() && right.type.isRelationType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((ISet) left.value)
					.subtract((ISet) right.value));
		} else {
			throw new RascalTypeError("Operands of - have illegal types: "
					+ left.type + ", " + right.type);
		}
		return voidResult;
	}
	
	@Override
	public EResult visitExpressionProduct(Product x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);

		if (left.type.isIntegerType() && right.type.isIntegerType()) {
			return result(((IInteger) left.value).multiply((IInteger) right.value));
		} else if (left.type.isDoubleType() && right.type.isDoubleType()) {
			return result(((IDouble) left.value).multiply((IDouble) right.value));
		} else {
			throw new RascalTypeError("Operands of * have illegal types: "
					+ left.type + ", " + right.type);
		}
	}
	
	@Override
	public EResult visitExpressionIntersection(Intersection x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);

		if (left.type.isSetType() && right.type.isSetType()) {
		Type resultType = left.type.lub(right.type);
		return result(resultType, ((ISet) left.value)
				.intersect((ISet) right.value));
		} else if (left.type.isMapType() && right.type.isMapType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((IMap) left.value)
					.common((IMap) right.value));

		} else if (left.type.isRelationType() && right.type.isRelationType()) {
			Type resultType = left.type.lub(right.type);
			return result(resultType, ((ISet) left.value)
				.intersect((ISet) right.value));
		} else {
			throw new RascalTypeError("Operands of & have illegal types: "
					+ left.type + ", " + right.type);
		}
	}

	@Override
	public EResult visitExpressionOr(Or x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		if (left.type.isBoolType() && right.type.isBoolType()) {
			return result(((IBool) left.value).or((IBool) right.value));
		} else {
			throw new RascalTypeError(
					"Operands of || should be boolean instead of: " + left.type
							+ ", " + right.type);
		}
	}

	@Override
	public EResult visitExpressionAnd(And x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		if (left.type.isBoolType() && right.type.isBoolType()) {
			return result(((IBool) left.value).and((IBool) right.value));
		} else {
			throw new RascalTypeError(
					"Operands of && should be boolean instead of: " + left.type
							+ ", " + right.type);
		}
	}

	@Override
	public EResult visitExpressionNegation(Negation x) {
		EResult arg = x.getArgument().accept(this);
		if (arg.type.isBoolType()) {
			return result(((IBool) arg.value).not());
		} else {
			throw new RascalTypeError(
					"Operand of ! should be boolean instead of: " + arg.type);
		}
	}
	
	private boolean equals(EResult left, EResult right){
		if (left.type.isSubtypeOf(right.type)
				|| right.type.isSubtypeOf(left.type)) {
			return left.value.equals(right.value);
		} else {
			throw new RascalTypeError(
					"Operands of == should have equal types instead of: "
							+ left.type + ", " + right.type);
		}
	}

	@Override
	public EResult visitExpressionEquals(
			org.meta_environment.rascal.ast.Expression.Equals x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(equals(left, right)));
	}

	@Override
	public EResult visitExpressionNonEquals(
			org.meta_environment.rascal.ast.Expression.NonEquals x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(!equals(left, right)));
	}
	
	private int compare(EResult left, EResult right){
		if (left.type.isIntegerType() && right.type.isIntegerType()) {
			return ((IInteger) left.value).compare((IInteger) right.value);
		} else if (left.type.isDoubleType() && right.type.isDoubleType()) {
			return ((IDouble) left.value).compare((IDouble) right.value);
		} else if (left.type.isStringType() && right.type.isStringType()) {
			return ((IString) left.value).compare((IString) right.value);
		} else if (left.type.isListType() && right.type.isListType()) {
			notImplemented("< on list");
		} else if (left.type.isSetType() && right.type.isSetType()) {
			((ISet) left.value).isSubSet((ISet) right.value);
		} else if (left.type.isMapType() && right.type.isMapType()) {
			((IMap) left.value).isSubMap((IMap) right.value);
		} else if (left.type.isRelationType() && right.type.isRelationType()) {
			((ISet) left.value).isSubSet((ISet) right.value);
		} else {
			throw new RascalTypeError("Operands of comparison have different types: "
					+ left.type + ", " + right.type);
		}
		return 0;
	}
	
	@Override
	public EResult visitExpressionLessThan(LessThan x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(compare(left, right) < 0));
	}
	
	@Override
	public EResult visitExpressionLessThanOrEq(LessThanOrEq x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(compare(left, right) <= 0));
	}
	@Override
	public EResult visitExpressionGreaterThan(GreaterThan x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(compare(left, right) > 0));
	}
	
	@Override
	public EResult visitExpressionGreaterThanOrEq(GreaterThanOrEq x) {
		EResult left = x.getLhs().accept(this);
		EResult right = x.getRhs().accept(this);
		
		return result(vf.bool(compare(left, right) >= 0));
	}
	
	private boolean in(org.meta_environment.rascal.ast.Expression expression, org.meta_environment.rascal.ast.Expression expression2){
		EResult left = expression.accept(this);
		EResult right = expression2.accept(this);
		
		if(right.type.isListType()){
			notImplemented("in on list");
		} else if(right.type.isSetType() && left.type.isSubtypeOf(((ISet) right.type).getElementType())){
			return ((ISet) right.value).contains(left.value);
			
		} else if(right.type.isMapType() && left.type.isSubtypeOf(((IMap) right.type).getValueType())){
			return ((IMap) right.value).containsValue(left.value);
		} else if(right.type.isRelationType() && left.type.isSubtypeOf(((ISet) right.type).getElementType())){
			return ((ISet) right.value).contains(left.value);
		} else {
			throw new RascalTypeError("Operands of in have wrong types: "
					+ left.type + ", " + right.type);
		}
		return false;
	}
	
	@Override
	public EResult visitExpressionIn(In x) {
		return result(vf.bool(in(x.getLhs(), x.getRhs())));

	}
	
	@Override
	public EResult visitExpressionNotIn(NotIn x) {
		return result(vf.bool(!in(x.getLhs(), x.getRhs())));

	}
	
	// Comprehensions ----------------------------------------------------
	
	@Override
	public EResult visitExpressionComprehension(Comprehension x) {
		return x.getComprehension().accept(this);
	}

	//TODO: parameterize with an indicator for list/set/map generators;
	
	private class GeneratorEvaluator {
		private boolean isValueProducer;
		private boolean firstTime = true;
		private org.meta_environment.rascal.ast.Expression expr;
		private org.meta_environment.rascal.ast.Expression pat;
		private org.meta_environment.rascal.ast.Expression patexpr;
		private Evaluator evaluator;
		private IList listvalue;
		private int current = 0;

		GeneratorEvaluator(Generator g, Evaluator ev){
			evaluator = ev;
			if(g.isProducer()){
				isValueProducer = true;
				ValueProducer vp = g.getProducer();
				pat = vp.getPattern();
				patexpr = vp.getExpression();
				EResult r = patexpr.accept(ev);
				if(r.type.isListType()){
					listvalue = (IList) r.value;
				} else {
					throw new RascalTypeError("expression in generator should be of type list");
				}
			} else {
				isValueProducer = false;
				expr = g.getExpression();
			}
		}
		
		public boolean match(org.meta_environment.rascal.ast.Expression p, IValue v){
			if(p.isQualifiedName()){
				evaluator.assignVariable(p.getQualifiedName().toString(), result(v));
				return true;
			}
			throw new RascalTypeError("unimplemented pattern in match");
		}

		public boolean getNext(){
			if(isValueProducer){
				 while(current < listvalue.length()) {
					if(match(pat, listvalue.get(current))){
						current++;
						return true;
					}
					current++;
				}
				return false;
			} else {
				if(firstTime){
					/* Evaluate expression only once */
					firstTime = false;
					EResult v = expr.accept(evaluator);
					if(v.type.isBoolType()){
						return v.value.equals(vf.bool(true));
					} else {
						throw new RascalTypeError("Expression as generator should have type bool");
					}
				} else {
					return false;
				}
			}
		}
	}
	
	@Override
	public EResult visitComprehensionList(
			org.meta_environment.rascal.ast.Comprehension.List x) {
		org.meta_environment.rascal.ast.Expression resultExpr = x.getResult();
		java.util.List<Generator> generators = x.getGenerators();
		int size = generators.size();
		GeneratorEvaluator[] gens = new GeneratorEvaluator[size];
		IList res = null;
		Type elementType = tf.valueType();
		
		int i = 0;
		gens[0] = new GeneratorEvaluator(generators.get(0), this);
		while(i >= 0 && i < size){		
			if(gens[i].getNext()){
				if(i == size - 1){
					EResult r = resultExpr.accept(this);
					if(res == null){
						res = vf.list(r.value);
						elementType = r.type;
					} else {
						if(r.type.isSubtypeOf(elementType)){
							res = res.append(r.value);
						} else {
							throw new RascalTypeError("Cannot add value of type " + r.type + " to comprehension with element type " + elementType);
						}
					}
				} else {
					i++;
					gens[i] = new GeneratorEvaluator(generators.get(i), this);
				}
			} else {
				i--;
			}
		}
		return result((res == null) ? vf.list() : res);
	}
	
	
	
	@Override
	public EResult visitStatementFor(For x) {
		Statement body = x.getBody();
		java.util.List<Generator> generators = x.getGenerators();
		int size = generators.size();
		GeneratorEvaluator[] gens = new GeneratorEvaluator[size];
		EResult result = voidResult;
		
		int i = 0;
		gens[0] = new GeneratorEvaluator(generators.get(0), this);
		while(i >= 0 && i < size){		
			if(gens[i].getNext()){
				if(i == size - 1){
					result = body.accept(this);
				} else {
					i++;
					gens[i] = new GeneratorEvaluator(generators.get(i), this);
				}
			} else {
				i--;
			}
		}
		return result;
	}
}
