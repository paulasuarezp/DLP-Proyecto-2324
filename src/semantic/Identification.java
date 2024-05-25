package semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.*;
import main.ErrorManager;
import visitor.DefaultVisitor;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;


// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    /* Conjunto de las variables declaradas */
    private ContextMap<String, VarDefinition> variables = new ContextMap<String, VarDefinition>();

    /* Conjunto de constructores declarados */
    private List<String> builders = new ArrayList<String>();
    
    /* Conjunto de las funciones definidas */
    private Map<String, FunctionDefinition> functions = new HashMap<String, FunctionDefinition>();

    /* Conjunto de los structs (defTuple) definidos */
    private Map<String, StructDefinition> structs = new HashMap<String, StructDefinition>();

    /* Conjunto de los campos declarados en un struct */
    private Map<String, FieldDefinition> structFields = new HashMap<String, FieldDefinition>();

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

        // Regla -> vars.forEach(v -> v.scope = GLOBAL)
		for (VarDefinition varDefinition : program.getVars()) {
			varDefinition.setScope(Scope.GLOBAL);
		}

		// program.getTypes().forEach(structDefinition -> structDefinition.accept(this, param));
		// program.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// program.getBuilders().forEach(functionBuilder -> functionBuilder.accept(this, param));
        // program.getRunCall().accept(this, param);
		// program.getFeatures().forEach(functionDefinition -> functionDefinition.accept(this, param));
		
		super.visit(program, param);

        // Predicado -> builders == ∅
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("Los siguientes constructores declarados no tienen una feature definida: ");
        if(builders.size() > 0){
            for (String builder : builders) {
                if(builder == builders.get(builders.size()-1))
                    errorMsg.append(builder );
                else
                    errorMsg.append(builder + ", ");
                
            }
        }
        predicate(builders.size()==0, errorMsg.toString(), program.getBuilders().get(0));

		return null;
	}

    
	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	@Override
	public Object visit(Variable variable, Object param) {

        // Predicado -> variables[name] != ∅
        VarDefinition def = variables.getFromAny(variable.getName());
       
        
        if( predicate(def != null, "Variable \'" + variable.getName() + "\' no definida.", variable) ) {
            // Regla -> variable.definition = variables[name]
            variable.setDefinition(def);
        }
            
        

		return null;
	}

    
	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {
        super.visit(varDefinition, param);

		//varDefinition.getTipo().accept(this, param);

        // Predicados y reglas para variables globales
        if(varDefinition.getScope() == Scope.GLOBAL) {
            VarDefinition def = variables.getFromAny(varDefinition.getName());
            // Predicado -> variables[name] == ∅
            if (predicate(def == null, "Variable global \'" + varDefinition.getName() + "\' ya definida.", varDefinition)){
                // Regla -> variables[name] = varDefinition
                variables.put(varDefinition.getName(), varDefinition);
            }
            
        }

        // Predicados y reglas para variables locales
        if(varDefinition.getScope() == Scope.LOCAL) {
            VarDefinition def = variables.getFromTop(varDefinition.getName());
            // Predicado -> variables[name] == ∅
            if(predicate(def == null, "Variable local \'" + varDefinition.getName() + "\' ya definida.", varDefinition)){
                // Regla -> variables[name] = varDefinition
                variables.put(varDefinition.getName(), varDefinition);
            }
            
        }

        // Predicados y reglas para variables parámetros
        if(varDefinition.getScope() == Scope.PARAMETER) {
            VarDefinition def = variables.getFromTop(varDefinition.getName());
            // Predicado -> variables[name] == ∅
            if(predicate(def == null, "Parámetro \'" + varDefinition.getName() + "\' ya definido.", varDefinition)){
                // Regla -> variables[name] = varDefinition
                variables.put(varDefinition.getName(), varDefinition);
            }
            
        }
		

		return null;
	}

	

	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        // Regla -> variables.set()
        variables.set();

        
        FunctionDefinition def = functions.get(functionDefinition.getName());

        // Predicado -> functions[name] == ∅
        if (predicate(def == null, "Función \'" + functionDefinition.getName() + "\' ya definida", functionDefinition)){
            // Regla -> functions[name] = functionDefinition
            functions.put(functionDefinition.getName(), functionDefinition);
        }

        
        if(builders.contains(functionDefinition.getName())) {
            // Regla -> functionDefinition.builder = true
            functionDefinition.setIsBuilder(true);
            // Regla -> builders[name] = ∅
            builders.remove(functionDefinition.getName());
        } else {
            // Regla -> functionDefinition.builder = false
            functionDefinition.setIsBuilder(false);
        }


        // Regla -> params.forEach(p -> p.scope = PARAMETER); visit(params)
		for (VarDefinition varDefinition : functionDefinition.getParams()) {
			varDefinition.setScope(Scope.PARAMETER);
            varDefinition.accept(this, param);
		}

        // Regla -> visit(returnType)
        functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));

        // Regla -> vars.forEach(v -> v.scope = LOCAL); visit(vars)
		for (VarDefinition varDefinition : functionDefinition.getVars()) {
			varDefinition.setScope(Scope.LOCAL);
            varDefinition.accept(this, param);
		}

        // Regla -> visit(sentences)
		functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		
        // Regla -> variables.reset();
        variables.reset();

		return null;
	}

    // class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {

        
        FunctionDefinition def= functions.get(runCall.getName());
        // Predicado -> functions[name] != ∅
        if (predicate(def != null, "Función  \'" + runCall.getName() + "\' no definida.", runCall) &&
            // Predicado -> function.isBuilder
            predicate(def.isIsBuilder(), "La función \'" + runCall.getName() + "\' llamada en 'run' no es un constructor.", runCall)){
                // Regla -> runCall.definition = functions[name]
                runCall.setDefinition(def);
                
                // runCall.getArgs().forEach(expression -> expression.accept(this, param));
                super.visit(runCall, param);
        }


		return null;
	}




	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

        // Predicado -> builders[name] == ∅
        if(predicate(!builders.contains(functionBuilder.getName()), "Constructor \'" + functionBuilder.getName() + "\' ya definido.", functionBuilder)){
            // Regla -> builders.add(name)
            builders.add(functionBuilder.getName());
        }

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

        FunctionDefinition def = functions.get(functionCallSent.getName());

        // Predicado -> functions[name] != ∅
        if(predicate(def != null, "Función \'" + functionCallSent.getName() + "\'' no definida.", functionCallSent)){    
            // Regla -> functionCallSent.definition = functions[name]
            functionCallSent.setDefinition(def);

            // functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
            super.visit(functionCallSent, param);
        }


		return null;
	}


	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

        FunctionDefinition def = functions.get(functionCallExpr.getName());

        // Predicado -> functions[name] != ∅
        if(predicate(def != null, "Función \'" + functionCallExpr.getName() + "\' no definida.", functionCallExpr)){
            
            // Regla -> functionCallExpr.definition = functions[name]
            functionCallExpr.setDefinition(def);

            // functionCallExpr.getArgs().forEach(expression -> expression.accept(this, param));
            super.visit(functionCallExpr, param);

        }


		return null;
	}


    // class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

        StructDefinition def = structs.get(structDefinition.getName().getName());

        // Predicado -> structs[name] == ∅
        if(predicate(def == null, "Struct \'" + structDefinition.getName().getName() + "\' ya definida", structDefinition)){
            structs.put(structDefinition.getName().getName(), structDefinition);
        

            // Regla -> fields.forEach(f -> f.fieldOwner = structDefinition.getName())
            for (FieldDefinition fieldDefinition : structDefinition.getFields()) {
                fieldDefinition.setFieldOwner(structDefinition.getName());
            }
    
            // Regla -> visit(fields)
            super.visit(structDefinition, param);
    
            // Regla -> structFields = ∅
            structFields.clear();
        }
       

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition definition }
	@Override
	public Object visit(StructType structType, Object param) {

        StructDefinition def = structs.get(structType.getName());

        // Predicado -> structs[name] != ∅
        if(predicate(def != null, "Struct \'" + structType.getName() + "\' no definida.", structType)){

            // Regla -> structType.definition = structs[name]
            structType.setDefinition(def);

            super.visit(structType, param);
        }


		return null;
	}

    
	// class FieldDefinition(String name, Type tipo)
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

        fieldDefinition.getTipo().accept(this, param);

       
        FieldDefinition field = structFields.get(fieldDefinition.getName());
        // Predicado -> structFields[name] == ∅
        if(predicate(field == null, "El campo \'" + fieldDefinition.getName() + "\' del Struct ya está definido.", fieldDefinition)){

            // Regla -> structFields[name] = fieldDefinition
            structFields.put(fieldDefinition.getName(), fieldDefinition);
        }
        

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
