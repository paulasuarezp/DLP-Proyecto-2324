// Generated with VGen 2.0.0

package ast;

import ast.type.*;
import ast.sentence.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionDefinition -> name:string params:varDefinition* returnType:type? vars:varDefinition* sentences:sentence*
	
	PHASE Identification
	functionDefinition -> isBuilder:boolean
*/
public class FunctionDefinition extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// functionDefinition -> name:string params:varDefinition* returnType:type? vars:varDefinition* sentences:sentence*
	private String name;
	private List<VarDefinition> params;
	private Optional<Type> returnType;
	private List<VarDefinition> vars;
	private List<Sentence> sentences;

    // PHASE Identification
	private boolean isBuilder;

    // ----------------------------------
    // Constructors

	public FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (params == null)
			params = new ArrayList<>();
		this.params = params;

		if (returnType == null)
			returnType = Optional.empty();
		this.returnType = returnType;

		if (vars == null)
			vars = new ArrayList<>();
		this.vars = vars;

		if (sentences == null)
			sentences = new ArrayList<>();
		this.sentences = sentences;

		updatePositions(name, params, returnType, vars, sentences);
	}

	public FunctionDefinition(Object name, Object params, Object returnType, Object vars, Object sentences) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.params = castList(params, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.returnType = castOptional(returnType, Type.class);
        this.vars = castList(vars, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.sentences = castList(sentences, unwrapIfContext.andThen(Sentence.class::cast));
		updatePositions(name, params, returnType, vars, sentences);
	}


    // ----------------------------------
    // functionDefinition -> name:string params:varDefinition* returnType:type? vars:varDefinition* sentences:sentence*

	// Child 'name:string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'params:varDefinition*' 

	public void setParams(List<VarDefinition> params) {
		if (params == null)
			params = new ArrayList<>();
		this.params = params;

	}

    public List<VarDefinition> getParams() {
        return params;
    }

    public Stream<VarDefinition> params() {
        return params.stream();
    }


	// Child 'returnType:type?' 

	public void setReturnType(Optional<Type> returnType) {
		if (returnType == null)
			returnType = Optional.empty();
		this.returnType = returnType;

	}

    public Optional<Type> getReturnType() {
        return returnType;
    }


	// Child 'vars:varDefinition*' 

	public void setVars(List<VarDefinition> vars) {
		if (vars == null)
			vars = new ArrayList<>();
		this.vars = vars;

	}

    public List<VarDefinition> getVars() {
        return vars;
    }

    public Stream<VarDefinition> vars() {
        return vars.stream();
    }


	// Child 'sentences:sentence*' 

	public void setSentences(List<Sentence> sentences) {
		if (sentences == null)
			sentences = new ArrayList<>();
		this.sentences = sentences;

	}

    public List<Sentence> getSentences() {
        return sentences;
    }

    public Stream<Sentence> sentences() {
        return sentences.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'isBuilder:boolean' 

	public void setIsBuilder(boolean isBuilder) {
		this.isBuilder = isBuilder;

	}

    public boolean isIsBuilder() {
        return isBuilder;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" + " name=" + this.getName() + " params=" + this.getParams() + " returnType=" + this.getReturnType() + " vars=" + this.getVars() + " sentences=" + this.getSentences() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
