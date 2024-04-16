package codegeneration;

import ast.*;
import visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

   // class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {

		for (var varDefinition : program.getVars()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

		// program.getTypes().forEach(structDefinition -> structDefinition.accept(this, param));
		// program.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// program.getBuilders().forEach(functionBuilder -> functionBuilder.accept(this, param));
		// program.getFeatures().forEach(functionDefinition -> functionDefinition.accept(this, param));
		// program.getRunCall().accept(this, param);
		super.visit(program, param);

		return null;
	}


    // class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		for (var fieldDefinition : structDefinition.getFields()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// fieldDefinition.setAddress(?);
		}

		// structDefinition.getName().accept(this, param);
		// structDefinition.getFields().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}


    // class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	// phase TypeChecking { boolean hasReturn }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		for (var varDefinition : functionDefinition.getParams()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

		for (var varDefinition : functionDefinition.getVars()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

}
