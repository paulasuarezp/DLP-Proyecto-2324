// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionCallSent: sentence -> name:string args:expression*
	sentence -> 
	
	PHASE Identification
	functionCallSent -> definition:functionDefinition
	
	PHASE TypeChecking
	sentence -> hasReturn:boolean
	sentence -> owner:functionDefinition
*/
public class FunctionCallSent extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// functionCallSent: sentence -> name:string args:expression*
	private String name;
	private List<Expression> args;

    // PHASE Identification
	private FunctionDefinition definition;

    // ----------------------------------
    // Constructors

	public FunctionCallSent(String name, List<Expression> args) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (args == null)
			args = new ArrayList<>();
		this.args = args;

		updatePositions(name, args);
	}

	public FunctionCallSent(Object name, Object args) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.args = castList(args, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(name, args);
	}


    // ----------------------------------
    // functionCallSent: sentence -> name:string args:expression*

	// Child 'name:string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'args:expression*' 

	public void setArgs(List<Expression> args) {
		if (args == null)
			args = new ArrayList<>();
		this.args = args;

	}

    public List<Expression> getArgs() {
        return args;
    }

    public Stream<Expression> args() {
        return args.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'definition:functionDefinition' 

	public void setDefinition(FunctionDefinition definition) {
		if (definition == null)
			throw new IllegalArgumentException("Parameter 'definition' can't be null. Pass a non-null value or use 'functionDefinition?' in the abstract grammar");
		this.definition = definition;

	}

    public FunctionDefinition getDefinition() {
        return definition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionCallSent{" + " name=" + this.getName() + " args=" + this.getArgs() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
