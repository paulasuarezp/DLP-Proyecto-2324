// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.sentence.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {

		// value(runCall.args());
		// address(runCall.args());

		out("<instruction>");

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// value(functionCallSent.args());
		// address(functionCallSent.args());

		out("<instruction>");

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Assignment assignment, Object param) {

		// value(assignment.getLeft());
		// address(assignment.getLeft());

		// value(assignment.getRight());
		// address(assignment.getRight());

		out("<instruction>");

		return null;
	}

	// class ComplexAssignment(Expression left, List<Expression> right)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(ComplexAssignment complexAssignment, Object param) {

		// value(complexAssignment.getLeft());
		// address(complexAssignment.getLeft());

		// value(complexAssignment.right());
		// address(complexAssignment.right());

		out("<instruction>");

		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {

		// execute(loop.from());

		// value(loop.getUntil());
		// address(loop.getUntil());

		// execute(loop.body());

		out("<instruction>");

		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		// value(ifElse.getCondition());
		// address(ifElse.getCondition());

		// execute(ifElse.trueBlock());

		// execute(ifElse.falseBlock());

		out("<instruction>");

		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {

		// value(read.input());
		// address(read.input());

		out("<instruction>");

		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {

		// value(print.input());
		// address(print.input());

		out("<instruction>");

		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {

		// value(returnValue.getValue());
		// address(returnValue.getValue());

		out("<instruction>");

		return null;
	}

}
