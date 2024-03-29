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

		if (predicate(args.size() == params.size(), "La llamada a la función " + runCall.getDefinition().getName() +
			" esperaba " + params.size() + " argumentos y se le han proporcionado " + args.size() + "." , runCall)){
			if(predicate(checkArgs(args,params), "Los tipos de los parámetros no coinciden con los definidos en la función " + runCall.getDefinition().getName() , runCall))
				// runCall.getArgs().forEach(expression -> expression.accept(this, param));
				super.visit(runCall, param);
		}

		return null;
	}

	// class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// structDefinition.getName().accept(this, param);
		// structDefinition.getFields().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	// phase TypeChecking { boolean hasReturn }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		for (var sentence : functionDefinition.getSentences()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// sentence.setOwner(?);
		}

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		super.visit(functionDefinition, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionDefinition.setHasReturn(?);
		return null;
	}

	// class FieldDefinition(String name, Type tipo)
	// phase Identification { StructType fieldOwner }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		// fieldDefinition.getTipo().accept(this, param);
		super.visit(fieldDefinition, param);

		return null;
	}

	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getTipo().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallSent, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallSent.setHasReturn(?);
		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Assignment assignment, Object param) {

		// assignment.getLeft().accept(this, param);
		// assignment.getRight().accept(this, param);
		super.visit(assignment, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// assignment.setHasReturn(?);
		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {

		for (var assignment : loop.getFrom()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// assignment.setOwner(loop.getOwner());
		}

		for (var sentence : loop.getBody()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// sentence.setOwner(loop.getOwner());
		}

		// loop.getFrom().forEach(assignment -> assignment.accept(this, param));
		// loop.getUntil().accept(this, param);
		// loop.getBody().forEach(sentence -> sentence.accept(this, param));
		super.visit(loop, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// loop.setHasReturn(?);
		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		for (var sentence : ifElse.getTrueBlock()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// sentence.setOwner(ifElse.getOwner());
		}

		for (var sentence : ifElse.getFalseBlock()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// sentence.setOwner(ifElse.getOwner());
		}

		// ifElse.getCondition().accept(this, param);
		// ifElse.getTrueBlock().forEach(sentence -> sentence.accept(this, param));
		// ifElse.getFalseBlock().forEach(sentence -> sentence.accept(this, param));
		super.visit(ifElse, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// ifElse.setHasReturn(?);
		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {

		// read.getInput().forEach(expression -> expression.accept(this, param));
		super.visit(read, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// read.setHasReturn(?);
		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {

		// print.getInput().forEach(expression -> expression.accept(this, param));
		super.visit(print, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// print.setHasReturn(?);
		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { boolean hasReturn, FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getValue().ifPresent(value -> value.accept(this, param));
		super.visit(returnValue, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// returnValue.setHasReturn(?);
		return null;
	}

	// class IntConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(IntConstant intConstant, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// intConstant.setLvalue(?);
		// intConstant.setType(?);
		return null;
	}

	// class RealConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(RealConstant realConstant, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// realConstant.setLvalue(?);
		// realConstant.setType(?);
		return null;
	}

	// class CharConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CharConstant charConstant, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// charConstant.setLvalue(?);
		// charConstant.setType(?);
		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// variable.setLvalue(?);
		// variable.setType(?);
		return null;
	}

	// class CastExpr(Type castType, Expression value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CastExpr castExpr, Object param) {

		// castExpr.getCastType().accept(this, param);
		// castExpr.getValue().accept(this, param);
		super.visit(castExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// castExpr.setLvalue(?);
		// castExpr.setType(?);
		return null;
	}

	// class ArithmeticExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

		// arithmeticExpr.getOp1().accept(this, param);
		// arithmeticExpr.getOp2().accept(this, param);
		super.visit(arithmeticExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// arithmeticExpr.setLvalue(?);
		// arithmeticExpr.setType(?);
		return null;
	}

	// class LogicalExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		// logicalExpr.getOp1().accept(this, param);
		// logicalExpr.getOp2().accept(this, param);
		super.visit(logicalExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// logicalExpr.setLvalue(?);
		// logicalExpr.setType(?);
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
	private boolean isSimpleType(Type type) {
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
