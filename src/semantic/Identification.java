package semantic;

import ast.*;
import main.ErrorManager;
import visitor.DefaultVisitor;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;


// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {

		for (var varDefinition : program.getVars()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setScope(?);
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

		// structDefinition.getName().accept(this, param);
		// structDefinition.getFields().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { FunctionBuilder builder }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		for (var varDefinition : functionDefinition.getParams()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setScope(?);
		}

		for (var varDefinition : functionDefinition.getVars()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setScope(?);
		}

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		super.visit(functionDefinition, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionDefinition.setBuilder(?);
		return null;
	}

	// class FieldDefinition(String name, Type tipo)
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		// fieldDefinition.getTipo().accept(this, param);
		super.visit(fieldDefinition, param);

		return null;
	}

	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getTipo().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallSent, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallSent.setDefinition(?);
		return null;
	}

	

	
	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	@Override
	public Object visit(Variable variable, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// variable.setDefinition(?);
		return null;
	}


	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		// functionCallExpr.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpr, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallExpr.setDefinition(?);
		return null;
	}


	// class StructType(String name)
	// phase Identification { StructDefinition definition }
	@Override
	public Object visit(StructType structType, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// structType.setDefinition(?);
		return null;
	}


    // # --------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    private void notifyError(String msg) {
        errorManager.notify("Identification", msg);
    }

    private void notifyError(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void notifyError(String msg, AST node) {
        notifyError(msg, node.start());
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }

}
