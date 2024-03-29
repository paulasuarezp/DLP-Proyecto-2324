/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import java.util.List;

import ast.*;
import main.ErrorManager;
import visitor.DefaultVisitor;

import ast.sentence.*;
import ast.expression.*;
import ast.type.*;


// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------

    // Visit Methods --------------------------------------------------------------

	// Visit Methods --------------------------------------------------------------

	// class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {

		// program.getTypes().forEach(structDefinition -> structDefinition.accept(this, param));
		// program.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// program.getBuilders().forEach(functionBuilder -> functionBuilder.accept(this, param));
		// program.getFeatures().forEach(functionDefinition -> functionDefinition.accept(this, param));
		// program.getRunCall().accept(this, param);
		super.visit(program, param);

		return null;
	}

	// class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {

		List<Expression> args = runCall.getArgs();
		List<VarDefinition> params = runCall.getDefinition().getParams();

		// Predicado -> args.size() == params.size()
		if (predicate(args.size() == params.size(), "La llamada a la función " + runCall.getDefinition().getName() +
			" esperaba " + params.size() + " argumentos y se le han proporcionado " + args.size() + "." , runCall)){
			// Predicado -> checkArgs(args, params)
			if(predicate(checkArgs(args,params), "Los tipos de los parámetros no coinciden con los definidos en la función " + runCall.getDefinition().getName() , runCall))
				// runCall.getArgs().forEach(expression -> expression.accept(this, param));
				super.visit(runCall, param);
		}

		return null;
	}


	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	// phase TypeChecking { boolean hasReturn }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		//Regla -> sentences.forEach(s -> s.owner = functionDefinition)
		for (var sentence : functionDefinition.getSentences()) {
			sentence.setOwner(functionDefinition);
		}

		
		if (functionDefinition.getReturnType().isPresent() && !(functionDefinition.getReturnType().get() instanceof VoidType)) {
			// Predicado -> isPrimitive(returnType)
			predicate(isPrimitive(functionDefinition.getReturnType().get()), "El tipo de retorno de la función " + functionDefinition.getName() + " debe de ser un tipo simple (integer, double o character)", functionDefinition);
		}

		
		super.visit(functionDefinition, param);

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		
		
		functionDefinition.setHasReturn(false);
		// Regla -> sentences.forEach(s -> if (s.hasReturn) functionDefinition.hasReturn = true)
		for (var sentence : functionDefinition.getSentences()) {
			if (sentence.isHasReturn()) {
				functionDefinition.setHasReturn(true);
				break;
			}
		}
		return null;
	}


	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallSent, param);

		List<Expression> args = functionCallSent.getArgs();
		List<VarDefinition> params = functionCallSent.getDefinition().getParams();

		// Predicado -> args.size() == params.size()
		if (predicate(args.size() == params.size(), "La llamada a la función " + functionCallSent.getDefinition().getName() +
			" esperaba " + params.size() + " argumentos y se le han proporcionado " + args.size() + "." , functionCallSent)){
			// Predicado -> checkArgs(args, params)
			if(predicate(checkArgs(args,params), "Los tipos de los parámetros no coinciden con los definidos en la función " + functionCallSent.getDefinition().getName() , functionCallSent))
				// functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
				super.visit(functionCallSent, param);
		}

		// Regla -> functionCallSent.hasReturn = FALSE
		functionCallSent.setHasReturn(false);

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Assignment assignment, Object param) {

		//Predicado -> left.lvalue == TRUE
		predicate(assignment.getLeft().isLvalue(), "La expresión de la izquierda no es modificable", assignment);

		//Predicado -> isPrimitive(left.type)
		predicate(isPrimitive(assignment.getLeft().getType()), "El tipo de la expresión de la izquierda debe de ser un tipo simple (integer, double o character)", assignment);

		//Predicado -> checkSameType(left.type, right.type)
		predicate(checkSameType(assignment.getLeft().getType(), assignment.getRight().getType()), "Los tipos de las expresiones no coinciden", assignment);


		super.visit(assignment, param);

		// Regla -> assignment.hasReturn = FALSE
		assignment.setHasReturn(false);
		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {

		// Predicado -> until.type == INTEGER
		predicate(loop.getUntil().getType() instanceof IntType, "La expresión del until debe de ser de tipo integer", loop);


		// Regla -> from.forEach(a -> a.owner = loop.owner)
		for (var assignment : loop.getFrom()) {
			assignment.setOwner(loop.getOwner());
		}

		// Regla -> body.forEach(s -> s.owner = loop.owner)
		for (var sentence : loop.getBody()) {
			sentence.setOwner(loop.getOwner());
		}

		super.visit(loop, param);

		// Regla -> body.forEach( s-> if (s.hasReturn) loop.hasReturn = TRUE)
		for(var sentence: loop.getBody()){
			if(sentence.isHasReturn()){
				loop.setHasReturn(true);
				break;
			}
		}

		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		// Predicado -> condition.type == INTEGER
		predicate(ifElse.getCondition().getType() instanceof IntType, "La condición del if debe de ser de tipo boolean", ifElse);


		// Regla -> trueBlock.forEach(s -> s.owner = ifElse.owner)
		for (var sentence : ifElse.getTrueBlock()) {
			sentence.setOwner(ifElse.getOwner());
		}

		// Regla -> falseBlock.forEach(s -> s.owner = ifElse.owner)
		for (var sentence : ifElse.getFalseBlock()) {
			sentence.setOwner(ifElse.getOwner());
		}

		super.visit(ifElse, param);

		// Regla -> trueBlock.forEach(s -> if (s.hasReturn) ifElse.hasReturn = TRUE)
		for (var sentence : ifElse.getTrueBlock()) {
			if(sentence.isHasReturn()){
				ifElse.setHasReturn(true);
				break;
			}
		}

		// Regla -> falseBlock.forEach(s -> if (s.hasReturn) ifElse.hasReturn = TRUE)
		for (var sentence : ifElse.getFalseBlock()) {
			if(sentence.isHasReturn()){
				ifElse.setHasReturn(true);
				break;
			}
		}

		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {

		// Regla -> input.all(e -> e.lValue == TRUE)
		boolean checkLValue = read.getInput().stream().allMatch(e -> e.isLvalue());
		predicate(checkLValue, "Alguna de las expresiones de la sentencia Read no es modificable", read);

		//Regla -> input.all(e -> isPrimitive(e.type))
		boolean checkTypes = read.getInput().stream().allMatch(e -> isPrimitive(e.getType()));
		predicate(checkTypes, "Alguna de las expresiones de la sentencia Read no es de tipo simple (integer, double o character)", read);

		// read.getInput().forEach(expression -> expression.accept(this, param));
		super.visit(read, param);

		// Regla -> read.hasReturn = FALSE
		read.setHasReturn(false);
		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {
		//Regla -> input.all(e -> isPrimitive(e.type))
		boolean checkTypes = print.getInput().stream().allMatch(e -> isPrimitive(e.getType()));
		predicate(checkTypes, "Alguna de las expresiones de la sentencia Print no es de tipo simple (integer, double o character)", print);

		super.visit(print, param);

		// Regla -> print.hasReturn = FALSE
		print.setHasReturn(false);
		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {
		
		// Regla -> returnValue.hasReturn = TRUE
		returnValue.setHasReturn(true);

		// Predicado -> owner.returnType == value.type
		if (returnValue.getValue().isPresent() && returnValue.getOwner().getReturnType().isPresent()) {
			if(returnValue.getOwner().getReturnType().get().getClass() == VoidType.class){
				notifyError("La expresión de retorno debe de estar vacía", returnValue.end());
				return null;
			}
			predicate(checkSameType(returnValue.getOwner().getReturnType().get(), returnValue.getValue().get().getType()), "El tipo de retorno de la función no coincide con el tipo de la expresión de retorno", returnValue);
		}

		// returnValue.getValue().ifPresent(value -> value.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class IntConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(IntConstant intConstant, Object param) {

		//Regla -> intConstant.lValue = FALSE
		intConstant.setLvalue(false);
		//Regla -> intConstant.type = IntType
		intConstant.setType(new IntType());
		return null;
	}

	// class RealConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(RealConstant realConstant, Object param) {

		//Regla -> realConstant.lValue = FALSE
		realConstant.setLvalue(false);
		//Regla -> realConstant.type = DoubleType
		realConstant.setType(new DoubleType());
		return null;
	}

	// class CharConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CharConstant charConstant, Object param) {
		//Regla -> charConstant.lValue = FALSE
		charConstant.setLvalue(false);
		//Regla -> charConstant.type = CharType
		charConstant.setType(new CharType());
		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		//Regla -> variable.lValue = TRUE
		variable.setLvalue(true);
		//Regla -> variable.type = definition.type
		variable.setType(variable.getDefinition().getTipo());
		return null;
	}

	// class CastExpr(Type castType, Expression value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CastExpr castExpr, Object param) {

		// Predicado -> checkCastType(castExpr.castType, castExpr.value.type)
		predicate(checkCastType(castExpr.getCastType(), castExpr.getValue().getType()), "Los tipos de cast no son compatibles.", castExpr);

		super.visit(castExpr, param);

		//Regla -> castExpr.lValue = FALSE
		castExpr.setLvalue(false);
		//Regla -> castExpr.type = castType
		castExpr.setType(castExpr.getCastType());
		return null;
	}

	// class ArithmeticExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {
		// Predicado -> isPrimitive(op1.type)
		boolean checkType = arithmeticExpr.getOp1().getType() instanceof IntType || arithmeticExpr.getOp1().getType() instanceof DoubleType;
		predicate(checkType, "El tipo de la expresión de la izquierda debe de ser integer o double.", arithmeticExpr);
		// Predicado -> op1.type == op2.type
		predicate(checkSameType(arithmeticExpr.getOp1().getType(), arithmeticExpr.getOp2().getType()), "Los tipos de las expresiones no coinciden", arithmeticExpr);
		
		super.visit(arithmeticExpr, param);

		//Regla -> arithmeticExpr.lValue = FALSE
		arithmeticExpr.setLvalue(false);
		//Regla -> arithmeticExpr.type = op1.type
		arithmeticExpr.setType(arithmeticExpr.getOp1().getType());
		return null;
	}

	// class LogicalExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		//Predicado -> op1.type == INTEGER
		predicate(logicalExpr.getOp1().getType() instanceof IntType, "El tipo de la expresión de la izquierda debe de ser integer.", logicalExpr);
		//Predicado -> sameType(op1.type, op2.type)
		predicate(checkSameType(logicalExpr.getOp1().getType(), logicalExpr.getOp2().getType()), "Los tipos de la condición deben de ser del mismo tipo.", logicalExpr)

		// logicalExpr.getOp1().accept(this, param);
		// logicalExpr.getOp2().accept(this, param);
		super.visit(logicalExpr, param);

		//Regla -> logicalExpr.lValue = FALSE
		logicalExpr.setLvalue(false);
		//Regla -> logicalExpr.type = op1.type
		logicalExpr.setType(logicalExpr.getOp1().getType());
		return null;
	}

	// class ComparationExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

		// comparationExpr.getOp1().accept(this, param);
		// comparationExpr.getOp2().accept(this, param);
		super.visit(comparationExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// comparationExpr.setLvalue(?);
		// comparationExpr.setType(?);
		return null;
	}

	// class MinusExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		// minusExpr.getOp().accept(this, param);
		super.visit(minusExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// minusExpr.setLvalue(?);
		// minusExpr.setType(?);
		return null;
	}

	// class NotExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(NotExpr notExpr, Object param) {

		// notExpr.getOp().accept(this, param);
		super.visit(notExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// notExpr.setLvalue(?);
		// notExpr.setType(?);
		return null;
	}

	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		// functionCallExpr.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallExpr.setLvalue(?);
		// functionCallExpr.setType(?);
		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		// fieldAccess.getRoot().accept(this, param);
		super.visit(fieldAccess, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// fieldAccess.setLvalue(?);
		// fieldAccess.setType(?);
		return null;
	}

	// class ArrayAccess(Expression array, Expression index)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getArray().accept(this, param);
		// arrayAccess.getIndex().accept(this, param);
		super.visit(arrayAccess, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// arrayAccess.setLvalue(?);
		// arrayAccess.setType(?);
		return null;
	}


    //# ----------------------------------------------------------
    //# Auxiliary methods (optional)

	/**
	 * Comprueba que los tipos de los argumentos de una llamada a función coinciden con los tipos de los parámetros definidos en la función
	 * @param args Lista de argumentos
	 * @param params Lista de parámetros
	 * @return true si los tipos de los argumentos coinciden con los tipos de los parámetros	
	 */
	private boolean checkArgs(List<Expression> args, List<VarDefinition> params) {
		if (args.size() != params.size()) {
			notifyError("El número de argumentos no coincide con el número de parámetros", args.get(0).start());
			return false;
		}

		for (int i = 0; i < args.size(); i++) {
			if (args.get(i).getType().getClass() != params.get(i).getTipo().getClass()) {
				notifyError("El tipo del argumento " + i + " no coincide con el tipo del parámetro " + i, args.get(i).start());
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si un tipo es un tipo simple
	 * @param type Tipo
	 * @return true si el tipo es un tipo simple (int, double, char)
	 */
	private boolean isPrimitive(Type type) {
		return type instanceof IntType || type instanceof DoubleType || type instanceof CharType;
	}


	/**
	 * Comprueba si dos tipos son del mismo tipo
	 * @param type1 Tipo 1
	 * @param type2 Tipo 2
	 * @return true si los tipos son del mismo tipo
	 */
	private boolean checkSameType(Type type1, Type type2) {
		if (type1.getClass() != type2.getClass()) {
			return false;
		}
		return true;
	}


	/**
	 * Comprueba si un tipo se puede castear a otro tipo
	 * Las combinaciones válidas son:
	 * 			- int -> char
	 * 			- int -> double
	 * 			- char -> int
	 * 			- double -> int
	 * 
	 * @param castType Tipo al que se quiere castear
	 * @param valueType Tipo que se quiere castear
	 * @return true si el tipo se puede castear
	 */
	private boolean checkCastType(Type castType, Type valueType) {
		if (castType.getClass() == IntType.class) {
			if (valueType.getClass() == CharType.class || valueType.getClass() == DoubleType.class) {
				return true;
			}
		} else if (castType.getClass() == DoubleType.class) {
			if (valueType.getClass() == IntType.class) {
				return true;
			}
		} else if (castType.getClass() == CharType.class) {
			if (valueType.getClass() == IntType.class) {
				return true;
			}
		}

		return false;
	}


	//# ----------------------------------------------------------
	//# Error notification methods

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    private void notifyError(String msg) {
        errorManager.notify("Type Checking", msg);
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }

}
