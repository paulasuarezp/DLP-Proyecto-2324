// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	print: sentence -> input:expression*
	sentence -> 
*/
public class Print extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// print: sentence -> input:expression*
	private List<Expression> input;

    // ----------------------------------
    // Constructors

	public Print(List<Expression> input) {
		super();

		if (input == null)
			input = new ArrayList<>();
		this.input = input;

		updatePositions(input);
	}

	public Print(Object input) {
		super();

        this.input = castList(input, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(input);
	}


    // ----------------------------------
    // print: sentence -> input:expression*

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
        return "Print{" + " input=" + this.getInput() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
