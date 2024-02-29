// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import java.util.Optional;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	return: sentence -> value:expression?
	sentence -> 
*/
public class Return extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// return: sentence -> value:expression?
	private Optional<Expression> value;

    // ----------------------------------
    // Constructors

	public Return(Optional<Expression> value) {
		super();

		if (value == null)
			value = Optional.empty();
		this.value = value;

		updatePositions(value);
	}

	public Return(Object value) {
		super();

        this.value = castOptional(value, Expression.class);
		updatePositions(value);
	}


    // ----------------------------------
    // return: sentence -> value:expression?

	// Child 'value:expression?' 

	public void setValue(Optional<Expression> value) {
		if (value == null)
			value = Optional.empty();
		this.value = value;

	}

    public Optional<Expression> getValue() {
        return value;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Return{" + " value=" + this.getValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
