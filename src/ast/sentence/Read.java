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
	read: sentence -> input:expression*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> hasReturn:boolean
	sentence -> owner:functionDefinition
*/
public class Read extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// read: sentence -> input:expression*
	private List<Expression> input;

    // ----------------------------------
    // Constructors

	public Read(List<Expression> input) {
		super();

		if (input == null)
			input = new ArrayList<>();
		this.input = input;

		updatePositions(input);
	}

	public Read(Object input) {
		super();

        this.input = castList(input, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(input);
	}


    // ----------------------------------
    // read: sentence -> input:expression*

	// Child 'input:expression*' 

	public void setInput(List<Expression> input) {
		if (input == null)
			input = new ArrayList<>();
		this.input = input;

	}

    public List<Expression> getInput() {
        return input;
    }

    public Stream<Expression> input() {
        return input.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Read{" + " input=" + this.getInput() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
