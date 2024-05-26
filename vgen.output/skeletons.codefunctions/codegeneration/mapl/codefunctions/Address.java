// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }


	// class IntConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(IntConstant intConstant, Object param) {

		out("<instruction>");

		return null;
	}

	// class RealConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(RealConstant realConstant, Object param) {

		out("<instruction>");

		return null;
	}

	// class CharConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CharConstant charConstant, Object param) {

		out("<instruction>");

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		out("<instruction>");

		return null;
	}

	// class CastExpr(Type castType, Expression value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CastExpr castExpr, Object param) {

		// value(castExpr.getValue());
		// address(castExpr.getValue());

		out("<instruction>");

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

		out("<instruction>");

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

		out("<instruction>");

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

		out("<instruction>");

		return null;
	}

	// class MinusExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		// value(minusExpr.getOp());
		// address(minusExpr.getOp());

		out("<instruction>");

		return null;
	}

	// class NotExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(NotExpr notExpr, Object param) {

		// value(notExpr.getOp());
		// address(notExpr.getOp());

		out("<instruction>");

		return null;
	}

	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		// value(functionCallExpr.args());
		// address(functionCallExpr.args());

		out("<instruction>");

		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		// value(fieldAccess.getRoot());
		// address(fieldAccess.getRoot());

		out("<instruction>");

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

		out("<instruction>");

		return null;
	}

	// class PotenciaExpr(Expression base, Expression exponente)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(PotenciaExpr potenciaExpr, Object param) {

		// value(potenciaExpr.getBase());
		// address(potenciaExpr.getBase());

		// value(potenciaExpr.getExponente());
		// address(potenciaExpr.getExponente());

		out("<instruction>");

		return null;
	}

}
