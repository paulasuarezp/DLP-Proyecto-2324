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

	// class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {
		super.visit(runCall, param);

		List<Expression> args = runCall.getArgs();
		List<VarDefinition> params = runCall.getDefinition().getParams();

		// Predicado -> args.size() == params.size()
		if (predicate(args.size() == params.size(), "La llamada a la función " + runCall.getDefinition().getName() +
			" esperaba " + params.size() + " argumentos y se le han proporcionado " + args.size() + "." , runCall)){
			// Predicado -> checkArgs(args, params)
			predicate(checkArgs(args,params), "Los tipos de los parámetros no coinciden con los definidos en la función " + runCall.getDefinition().getName() , runCall);		
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

		// Inicializar valor
		functionDefinition.setHasReturn(false);
				
		super.visit(functionDefinition, param);
				
		return null;
	}


	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {
		super.visit(functionCallSent, param);

		List<Expression> args = functionCallSent.getArgs();
		List<VarDefinition> params = functionCallSent.getDefinition().getParams();

		// Predicado -> args.size() == params.size()
		if (predicate(args.size() == params.size(), "La llamada a la función " + functionCallSent.getDefinition().getName() +
			" esperaba " + params.size() + " argumentos y se le han proporcionado " + args.size() + "." , functionCallSent)){
			// Predicado -> checkArgs(args, params)
			predicate(checkArgs(args,params), "Los tipos de los parámetros no coinciden con los definidos en la función " + functionCallSent.getDefinition().getName() , functionCallSent);
		
		}

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Assignment assignment, Object param) {
		
		super.visit(assignment, param);

		//Predicado -> left.lvalue == TRUE
		predicate(assignment.getLeft().isLvalue(), "La expresión de la izquierda no es modificable", assignment);

		//Predicado -> isPrimitive(left.type)
		predicate(isPrimitive(assignment.getLeft().getType()), "El tipo de la expresión de la izquierda debe de ser un tipo simple (integer, double o character)", assignment);

		//Predicado -> checkSameType(left.type, right.type)
		predicate(checkSameType(assignment.getLeft().getType(), assignment.getRight().getType()), "Los tipos de las expresiones no coinciden", assignment);

		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {
		

		// Regla -> from.forEach(a -> a.owner = loop.owner)
		for (var assignment : loop.getFrom()) {
			assignment.setOwner(loop.getOwner());
		}

		// Regla -> body.forEach(s -> s.owner = loop.owner)
		for (var sentence : loop.getBody()) {
			sentence.setOwner(loop.getOwner());
		}


		super.visit(loop, param);

		// Predicado -> until.type == INTEGER
		predicate(loop.getUntil().getType() instanceof IntType, "La expresión del until debe de ser de tipo integer", loop);


		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		// Regla -> trueBlock.forEach(s -> s.owner = ifElse.owner)
		for (var sentence : ifElse.getTrueBlock()) {
			sentence.setOwner(ifElse.getOwner());
		}

		// Regla -> falseBlock.forEach(s -> s.owner = ifElse.owner)
		for (var sentence : ifElse.getFalseBlock()) {
			sentence.setOwner(ifElse.getOwner());
		}


		super.visit(ifElse, param);

		// Predicado -> condition.type == INTEGER
		predicate(ifElse.getCondition().getType() instanceof IntType, "La condición del if debe de ser de tipo boolean", ifElse);


		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {
		super.visit(read, param);

		// Regla -> input.all(e -> e.lValue == TRUE)
		boolean checkLValue = read.getInput().stream().allMatch(e -> e.isLvalue());
		predicate(checkLValue, "Alguna de las expresiones de la sentencia Read no es modificable", read);

		//Regla -> input.all(e -> isPrimitive(e.type))
		boolean checkTypes = read.getInput().stream().allMatch(e -> isPrimitive(e.getType()));
		predicate(checkTypes, "Alguna de las expresiones de la sentencia Read no es de tipo simple (integer, double o character)", read);

		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {
		super.visit(print, param);

		//Regla -> input.all(e -> isPrimitive(e.type))
		boolean checkTypes = print.getInput().stream().allMatch(e -> isPrimitive(e.getType()));
		predicate(checkTypes, "Alguna de las expresiones de la sentencia Print no es de tipo simple (integer, double o character)", print);
		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {
		
		// Regla -> returnValue.owner.hasReturn = TRUE
		returnValue.getOwner().setHasReturn(true);

		
		// returnValue.getValue().ifPresent(value -> value.accept(this, param));
		super.visit(returnValue, param);

		// Predicado -> owner.returnType == value.type
		if (returnValue.getValue().isPresent() && returnValue.getOwner().getReturnType().isPresent()) {
			if(returnValue.getOwner().getReturnType().get().getClass() == VoidType.class){
				notifyError("La expresión de retorno debe de estar vacía", returnValue.end());
				return null;
			}
			predicate(checkSameType(returnValue.getOwner().getReturnType().get(), returnValue.getValue().get().getType()), "El tipo de retorno de la función no coincide con el tipo de la expresión de retorno", returnValue);
		}


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
		super.visit(castExpr, param);

		// Predicado -> checkCastType(castExpr.castType, castExpr.value.type)
		predicate(checkCastType(castExpr.getCastType(), castExpr.getValue().getType()), "Los tipos de cast no son compatibles.", castExpr);

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
		super.visit(arithmeticExpr, param);

		// Predicado -> isPrimitive(op1.type)
		boolean checkType = arithmeticExpr.getOp1().getType() instanceof IntType || arithmeticExpr.getOp1().getType() instanceof DoubleType;
		predicate(checkType, "El tipo de la expresión de la izquierda debe de ser integer o double.", arithmeticExpr);
		// Predicado -> op1.type == op2.type
		predicate(checkSameType(arithmeticExpr.getOp1().getType(), arithmeticExpr.getOp2().getType()), "Los tipos de las expresiones no coinciden", arithmeticExpr);
		
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
		super.visit(logicalExpr, param);

		//Predicado -> op1.type == INTEGER
		predicate(logicalExpr.getOp1().getType() instanceof IntType, "El tipo de la expresión de la izquierda debe de ser integer.", logicalExpr);
		//Predicado -> sameType(op1.type, op2.type)
		predicate(checkSameType(logicalExpr.getOp1().getType(), logicalExpr.getOp2().getType()), "Los tipos de la condición deben de ser del mismo tipo.", logicalExpr);

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
		super.visit(comparationExpr, param);

		//Predicado -> op1.type == INTEGER || op1.type == DOUBLE
		boolean checkType = comparationExpr.getOp1().getType() instanceof IntType || comparationExpr.getOp1().getType() instanceof DoubleType;
		predicate(checkType, "El tipo de la expresión de la izquierda debe de ser integer o double.", comparationExpr);
		//Predicado -> sameType(op1.type, op2.type)
		predicate(checkSameType(comparationExpr.getOp1().getType(), comparationExpr.getOp2().getType()), "Los tipos de las expresiones no coinciden", comparationExpr);
		
		//Regla -> comparationExpr.lValue = FALSE
		comparationExpr.setLvalue(false);
		//Regla -> comparationExpr.type = INTEGER
		comparationExpr.setType(new IntType());
		return null;
	}

	// class MinusExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(MinusExpr minusExpr, Object param) {
		super.visit(minusExpr, param);
		//Predicado -> op.type == INTEGER || op.type == DOUBLE
		boolean checkType = minusExpr.getOp().getType() instanceof IntType || minusExpr.getOp().getType() instanceof DoubleType;
		predicate(checkType, "El tipo de la expresión debe de ser integer o double.", minusExpr);

		//Regla -> minusExpr.lValue = FALSE
		minusExpr.setLvalue(false);
		//Regla -> minusExpr.type = op.type
		minusExpr.setType(minusExpr.getOp().getType());
		return null;
	}

	// class NotExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(NotExpr notExpr, Object param) {
		super.visit(notExpr, param);
		//Predicado -> op.type == INTEGER
		predicate(notExpr.getOp().getType() instanceof IntType, "El operador 'not' sólo puede aplicarse a expresiones de tipo INTEGER", notExpr);
		// notExpr.getOp().accept(this, param);
		
		//Regla -> notExpr.lValue = FALSE
		notExpr.setLvalue(false);
		//Regla -> notExpr.type = INTEGER
		notExpr.setType(new IntType());
		return null;
	}

	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {
		super.visit(functionCallExpr, param);

		// Predicado -> functionCallExpr.definition.tipo!=VoidType
		boolean isVoid = functionCallExpr.getDefinition().getReturnType().isPresent() && functionCallExpr.getDefinition().getReturnType().get() instanceof VoidType;
		if(predicate(!isVoid || functionCallExpr.getDefinition().isHasReturn() , "La función " + functionCallExpr.getName() + " no tiene tipo de retorno, no se puede usar como una expresión.", functionCallExpr)
		//Predicado -> functionCallExpr.args.size() == definition.params.size()
		&& predicate(functionCallExpr.getArgs().size() == functionCallExpr.getDefinition().getParams().size(), "El número de argumentos no coincide con el número de parámetros", functionCallExpr)
			//Predicado -> checkArgs(args, definition.params)
			&& predicate(checkArgs(functionCallExpr.getArgs(), functionCallExpr.getDefinition().getParams()), "Los tipos de los argumentos no coinciden con los definidos en la función " + functionCallExpr.getName(), functionCallExpr)){
				
				//Regla -> functionCallExpr.lValue = FALSE
				functionCallExpr.setLvalue(false);
				//Regla -> functionCallExpr.type = definition.returnType
				functionCallExpr.setType(functionCallExpr.getDefinition().getReturnType().orElse(new VoidType()));
					
		}

		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {
		super.visit(fieldAccess, param);

		//Predicado -> root.type == StructType

		if(predicate(fieldAccess.getRoot().getType().getClass() == StructType.class, "El tipo de la expresión debe de ser un StructType", fieldAccess)){

			//Predicado -> field es un campo de root.type
			StructType structType =  (StructType) fieldAccess.getRoot().getType();
			boolean checkField = structType.getDefinition().getFields().stream().anyMatch(f -> f.getName().equals(fieldAccess.getField()));
			if(predicate(checkField, "No hay ningún campo en la deftuple " + structType.getName() + " con el nombre " + fieldAccess.getField(), fieldAccess)){
			
				//Regla -> fieldAccess.lValue = TRUE
				fieldAccess.setLvalue(true);

				//Regla -> fieldAccess.type = field.type
				FieldDefinition field = structType.getDefinition().getFields().stream().filter(f -> f.getName().equals(fieldAccess.getField())).findFirst().orElse(null);
				fieldAccess.setType(field.getTipo());
			}
		}
		return null;
	}

	// class ArrayAccess(Expression array, Expression index)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		super.visit(arrayAccess, param);

		//Predicado -> array.type == ArrayType
		if(predicate(arrayAccess.getArray().getType() instanceof ArrayType, "El tipo de la expresión debe de ser un ArrayType", arrayAccess) &&

		//Predicado -> index.type == IntType
		predicate(arrayAccess.getIndex().getType() instanceof IntType, "El tipo de la expresión debe de ser integer", arrayAccess)){

		//Regla -> arrayAccess.lValue = TRUE
		arrayAccess.setLvalue(true);
		//Regla -> arrayAccess.type = array.type.type
		arrayAccess.setType(((ArrayType) arrayAccess.getArray().getType()).getTipo());
		}

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
			//notifyError("El número de argumentos no coincide con el número de parámetros", args.get(0).start());
			return false;
		}

		for (int i = 0; i < args.size(); i++) {
			return checkSameType(args.get(i).getType(), params.get(i).getTipo());
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
		if(type1 == null || type2 == null){
			return false;
		}
		return type1.getClass() == type2.getClass();
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
