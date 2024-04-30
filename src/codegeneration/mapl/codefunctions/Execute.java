// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import java.util.Map;

import ast.*;
import ast.expression.Expression;
import ast.sentence.*;
import ast.type.VoidType;
import codegeneration.mapl.*;
import codegeneration.mapl.utils.MaplUtils;


public class Execute extends AbstractCodeFunction {

	private int untilLabelCount = 0;
	private int ifLabelCount = 0;

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {

		// value(runCall.args());
		// address(runCall.args());

		//out("\n#LINE " + runCall.end().getLine());
		value(runCall.args());
		out("CALL " + runCall.getName());
		if(runCall.getDefinition().getReturnType().isPresent() && !(runCall.getDefinition().getReturnType().get() instanceof VoidType))
			out("POP" + MaplUtils.maplSuffix(runCall.getDefinition().getReturnType().get()));

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// value(functionCallSent.args());
		// address(functionCallSent.args());

		out("\n#LINE " + functionCallSent.end().getLine());
		value(functionCallSent.args());
		out("CALL " + functionCallSent.getName());
		if(functionCallSent.getDefinition().getReturnType().isPresent() && !(functionCallSent.getDefinition().getReturnType().get() instanceof VoidType))
			out("POP" + MaplUtils.maplSuffix(functionCallSent.getDefinition().getReturnType().get()));

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

		out("\n#line " + assignment.end().getLine());
		address(assignment.getLeft());
		value(assignment.getRight());
		out("STORE" + MaplUtils.maplSuffix(assignment.getLeft().getType()));

		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {


		untilLabelCount++;

		out("\n#line " + loop.start().getLine());
		out("'from");
		execute(loop.from());
		out(MaplUtils.formatLabel("untilcond_", untilLabelCount) + ":");
		value(loop.getUntil());
		out("JNZ " + MaplUtils.formatLabel("untilend_", untilLabelCount));
		out("'loop body");
		execute(loop.body());
		out("JMP " + MaplUtils.formatLabel("untilcond_", untilLabelCount));
		out(MaplUtils.formatLabel("untilend_", untilLabelCount) + ":");

		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		ifLabelCount++;
		out("\n#line " + ifElse.start().getLine()); 
		out("'if");
		value(ifElse.getCondition());                
		out("JZ " + MaplUtils.formatLabel("else_", ifLabelCount));  
		out("'else");              
		execute(ifElse.trueBlock());                 
		out("JMP " + MaplUtils.formatLabel("endif_", ifLabelCount));              
		out(MaplUtils.formatLabel("else_", ifLabelCount) + ":");             
		execute(ifElse.falseBlock());  
		out("'end");              
		out(MaplUtils.formatLabel("endif_", ifLabelCount) + ":");            


		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {

		// value(read.input());
		// address(read.input());

		out("\n#LINE " + read.end().getLine());
		value(read.input());
		out("IN" + MaplUtils.maplSuffix(read.getInput().get(0).getType()));

		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {

		// value(print.input());
		// address(print.input());

		out("\n#LINE " + print.end().getLine());
		for(Expression e : print.getInput()) {
			value(e);
			out("OUT" + MaplUtils.maplSuffix(e.getType()));
		}

		switch (print.getOp()) {
			case "println":
				out("PUSHB 10");
				out("OUTB");
				break;
			default:
				break;
		}
		

		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {

		// value(returnValue.getValue());
		// address(returnValue.getValue());

		out("\n#LINE " + returnValue.end().getLine() );
		value(returnValue.getValue());
		int bytesLocalVars = MaplUtils.getVarsSize(returnValue.getOwner().getVars());
		int bytesParams = MaplUtils.getVarsSize(returnValue.getOwner().getParams());
		int bytesReturn = returnValue.getOwner().getReturnType().isPresent() ? MaplUtils.maplTypeSize(returnValue.getOwner().getReturnType().get()) : 0;
		out("RET " + bytesReturn + ", " + bytesLocalVars + ", " + bytesParams);

		return null;
	}

}
