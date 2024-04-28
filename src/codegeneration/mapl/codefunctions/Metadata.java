// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;


public class Metadata extends AbstractCodeFunction {

    public Metadata(MaplCodeSpecification specification) {
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

		out("<instruction>");

		return null;
	}

	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		out("<instruction>");

		return null;
	}

	// class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// metadata(structDefinition.fields());

		out("<instruction>");

		return null;
	}

	// class FieldDefinition(String name, Type tipo)
	// phase Identification { StructType fieldOwner }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		out("<instruction>");

		return null;
	}

	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		out("<instruction>");

		return null;
	}

}
