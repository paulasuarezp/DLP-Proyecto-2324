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
		generatePotencia();
		generate(program.features());

		
		return null;
	}

	private void generatePotencia(){
		out("#FUNC potenciaAux");
		out("#ret int");
		out("potenciaAux:");
		out("#param b : int");
		out("#param e : int");
		out("#local total : int");
		out("#local aux : int");
		out("ENTER 4");

		out("'from");

		out("PUSH BP");
		out("PUSH -4");
		out("ADDI");
		out("PUSHI 1");
		out("STOREI");

		out("PUSH BP");
		out("PUSH -2");
		out("ADDI");
		out("PUSH BP");
		out("PUSH 6");
		out("ADDI");
		out("LOADI");
		out("STOREI");
		out("untilcond_0001:");
		out("PUSH BP");
		out("PUSH -4");
		out("ADDI");
		out("LOADI");
		out("PUSH BP");
		out("PUSH 4");
		out("ADDI");
		out("LOADI");
		out("GEI");
		out("JNZ untilend_0001");
		out("'loop body");

		out("PUSH BP");
		out("PUSH -2");
		out("ADDI");
		out("PUSH BP");
		out("PUSH -2");
		out("ADDI");
		out("LOADI");
		out("PUSH BP");
		out("PUSH 6");
		out("ADDI");
		out("LOADI");
		out("MULI");
		out("STOREI");

		out("PUSH BP");
		out("PUSH -4");
		out("ADDI");
		out("PUSH BP");
		out("PUSH -4");
		out("ADDI");
		out("LOADI");
		out("PUSHI 1");
		out("ADDI");
		out("STOREI");
		out("JMP untilcond_0001");
		out("untilend_0001:");

		out("PUSH BP");
		out("PUSH -2");
		out("ADDI");
		out("LOADI");
		out("RET 2, 4, 4");
	}
	private Object potencia() {
		out("\n#FUNC potencia__Aux");
		out("#ret int" );
		out("potencia__Aux:");
		out("#param b : int");
		out("#param e : int");
		out("#local total : int");
		out("#local aux : int");


		int labelCount = 0;

		int bytesLocalVars = 4;
		out("ENTER " + bytesLocalVars);


		out("'from");
		out("PUSH BP");
		out("PUSH -4");
		out("ADD");
		out("PUSHI 1");
		out("STOREI");
		out("label____untilcond_" + labelCount + ":");
		out("PUSH BP");
		out("PUSH -4");
		out("ADD");
		out("LOADI");
		out("PUSH BP");
		out("PUSH 4");
		out("ADD");
		out("LOADI");
		out("GEI");
		out("JNZ label___end_" + labelCount);
		out("'loop");
		out("PUSH BP");
		out("PUSH -2");
		out("ADD");
		out("PUSH BP");
		out("PUSH 6");
		out("ADD");
		out("LOADI");
		out("MULI");
		out("STOREI");

		out("PUSH BP");
		out("PUSH -4");
		out("ADD");
		out("PUSH BP");
		out("PUSH -4");
		out("ADD");
		out("LOADI");
		out("PUSH 1");
		out("ADD");
		out("STOREI");
		out("JMP label____untilcond_" + labelCount);
		out("label___end_" + labelCount + ":");
		out("PUSH BP");
		out("PUSH -2");
		out("ADD");
		out("LOADI");
		out("RET 2, 4, 4");
		

		return null;
	}


}
