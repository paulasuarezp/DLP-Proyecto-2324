// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.type.VoidType;
import codegeneration.mapl.*;
import codegeneration.mapl.utils.MaplUtils;


public class Generate extends AbstractCodeFunction {

    public Generate(MaplCodeSpecification specification) {
        super(specification);
    }


	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	// phase TypeChecking { boolean hasReturn }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		// metadata(functionDefinition.params());

		// metadata(functionDefinition.vars());

		// execute(functionDefinition.sentences());

		out("#FUNC " + functionDefinition.getName());
		out("#ret " + MaplUtils.maplType(functionDefinition.getReturnType().orElse(new VoidType())));
		out(functionDefinition.getName() + ":");

		metadata(functionDefinition.params());
		metadata(functionDefinition.vars());

		int bytesLocalVars = MaplUtils.getVarsSize(functionDefinition.getVars());
		if(bytesLocalVars != 0)
			out("ENTER " + bytesLocalVars);

		int bytesParams = MaplUtils.getVarsSize(functionDefinition.getParams());
		int bytesReturn = functionDefinition.getReturnType().isPresent() ? MaplUtils.maplTypeSize(functionDefinition.getReturnType().get()) : 0;
		
		execute(functionDefinition.sentences());

		
		if(bytesReturn == 0)
			out("RET " + bytesReturn + ", " + bytesLocalVars + ", " + bytesParams);
		
		return null;
	}

}
