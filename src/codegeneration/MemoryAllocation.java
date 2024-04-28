package codegeneration;

import java.lang.reflect.Field;

import ast.*;
import codegeneration.mapl.utils.MaplUtils;
import visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

   // class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {
        int currentAddress = 0;

		for (var varDefinition : program.getVars()) {
			if(varDefinition.getScope() == Scope.GLOBAL) {
                varDefinition.setAddress(currentAddress);
                currentAddress += MaplUtils.maplTypeSize(varDefinition.getTipo());
            }
            varDefinition.accept(this, param);
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

        int currentAddress = 0;

		for (FieldDefinition fieldDefinition : structDefinition.getFields()) {
            fieldDefinition.setAddress(currentAddress);
            currentAddress += MaplUtils.maplTypeSize(fieldDefinition.getTipo());
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

        int currentAddressForLocals = 0;
        int currentAddressForParameters = 4;

		for (int i = functionDefinition.getParams().size() - 1; i >= 0; i--) {
            functionDefinition.getParams().get(i).setAddress(currentAddressForParameters);
            currentAddressForParameters += MaplUtils.maplTypeSize(functionDefinition.getParams().get(i).getTipo());
		}

		for (VarDefinition varDefinition : functionDefinition.getVars()) {
            currentAddressForLocals -= MaplUtils.maplTypeSize(varDefinition.getTipo());
            varDefinition.setAddress(currentAddressForLocals);
		}

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

}
