// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;
import codegeneration.mapl.utils.MaplUtils;


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

		out("#SOURCE \"" + getSpecification().getSourceFile() + "\"");
		out("'Declaraciones globales");
		metadata(program.types());
		metadata(program.vars());
		metadata(program.builders());
		

		return null;
	}

	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		switch (varDefinition.getScope()) {
			case Scope.GLOBAL:
				out("#GLOBAL " + varDefinition.getName() + " : " + MaplUtils.maplType(varDefinition.getTipo()));
				break;
			case Scope.LOCAL:
				out("#LOCAL " + varDefinition.getName() + " : " + MaplUtils.maplType(varDefinition.getTipo()));
				break;
			case Scope.PARAMETER:
				out("#PARAM " + varDefinition.getName() + " : " + MaplUtils.maplType(varDefinition.getTipo()));
				break;
			default:
				break;
		}


		return null;
	}

	// class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// metadata(structDefinition.fields());

		out("#DEFTUPLE " + structDefinition.getName().getName());
		metadata(structDefinition.fields());

		return null;
	}

	// class FieldDefinition(String name, Type tipo)
	// phase Identification { StructType fieldOwner }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		out("\n'**FIELD " + fieldDefinition.getName() + " : " + MaplUtils.maplType(fieldDefinition.getTipo()));

		return null;
	}

	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		out("\n'**BUILDER " + functionBuilder.getName());

		return null;
	}

}
