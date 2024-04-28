// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {

		// metadata(program.types());

		// metadata(program.vars());

		// metadata(program.builders());

		// generate(program.features());

		// execute(program.getRunCall());

		metadata(program);
		execute(program.getRunCall());
		out("HALT");
		generate(program.features());

		return null;
	}

}
