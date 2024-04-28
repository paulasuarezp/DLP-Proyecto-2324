// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;


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

		out("<instruction>");

		return null;
	}

}
