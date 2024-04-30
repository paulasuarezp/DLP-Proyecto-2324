// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;
import codegeneration.mapl.utils.MaplUtils;


public class Value extends AbstractCodeFunction {

    public Value(MaplCodeSpecification specification) {
        super(specification);
    }


	// class IntConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(IntConstant intConstant, Object param) {

		out("PUSHI " + intConstant.getValue());

		return null;
	}

	// class RealConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(RealConstant realConstant, Object param) {

		out("PUSHF " + realConstant.getValue());

		return null;
	}

	// class CharConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CharConstant charConstant, Object param) {

		String value = charConstant.getValue();
        if (value.equals("'\\n'")) {
            out("PUSHB 10");
        } else {
            int c = value.charAt(1);
            out("PUSHB " + c);
        }

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		address(variable);
		out("LOAD" + MaplUtils.maplSuffix(variable.getType()));

		return null;
	}

	// class CastExpr(Type castType, Expression value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CastExpr castExpr, Object param) {

		// value(castExpr.getValue());
		// address(castExpr.getValue());

		value(castExpr.getValue());
		String castInstruction = MaplUtils.maplSuffix(castExpr.getValue().getType()) + "2" + MaplUtils.maplSuffix(castExpr.getType());
		if(!MaplUtils.castInstructions.contains(castInstruction))
			throw new IllegalStateException("Cast instruction not found: " + castInstruction);
		out(castInstruction);


		return null;
	}

	// class ArithmeticExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

		// value(arithmeticExpr.getOp1());
		// address(arithmeticExpr.getOp1());

		// value(arithmeticExpr.getOp2());
		// address(arithmeticExpr.getOp2());

		value(arithmeticExpr.getOp1());
		value(arithmeticExpr.getOp2());
		String instruction =MaplUtils.maplOperator(arithmeticExpr.getOperator(), arithmeticExpr.getType());
		out(instruction);

		return null;
	}

	// class LogicalExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		// value(logicalExpr.getOp1());
		// address(logicalExpr.getOp1());

		// value(logicalExpr.getOp2());
		// address(logicalExpr.getOp2());

		value(logicalExpr.getOp1());
		value(logicalExpr.getOp2());
		String instruction = MaplUtils.maplOperator(logicalExpr.getOperator());
		out(instruction);

		return null;
	}

	// class ComparationExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

		// value(comparationExpr.getOp1());
		// address(comparationExpr.getOp1());

		// value(comparationExpr.getOp2());
		// address(comparationExpr.getOp2());

		value(comparationExpr.getOp1());
		value(comparationExpr.getOp2());
		String instruction = MaplUtils.maplOperator(comparationExpr.getOperator(), comparationExpr.getOp1().getType());
		out(instruction);

		return null;
	}

	// class MinusExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		// value(minusExpr.getOp());
		// address(minusExpr.getOp());

		value(minusExpr.getOp());
		out("PUSHI -1");
		out("MULI");

		return null;
	}

	// class NotExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(NotExpr notExpr, Object param) {

		// value(notExpr.getOp());
		// address(notExpr.getOp());

		value(notExpr.getOp());
		out("NOT");

		return null;
	}

	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		// value(functionCallExpr.args());
		// address(functionCallExpr.args());

		value(functionCallExpr.args());
		out("CALL " + functionCallExpr.getName());

		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		// value(fieldAccess.getRoot());
		// address(fieldAccess.getRoot());

		address(fieldAccess);
		out("LOAD" + MaplUtils.maplSuffix(fieldAccess.getType()));

		return null;
	}

	// class ArrayAccess(Expression array, Expression index)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// value(arrayAccess.getArray());
		// address(arrayAccess.getArray());

		// value(arrayAccess.getIndex());
		// address(arrayAccess.getIndex());

		address(arrayAccess);
		out("LOAD" + MaplUtils.maplSuffix(arrayAccess.getType()));

		return null;
	}

}
