// Generated with VGen 2.0.0

package ast;

import ast.expression.*;
import ast.sentence.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	switchCase -> value:expression body:sentence*
*/
public class SwitchCase extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// switchCase -> value:expression body:sentence*
	private Expression value;
	private List<Sentence> body;

    // ----------------------------------
    // Constructors

	public SwitchCase(Expression value, List<Sentence> body) {
		super();

		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

		if (body == null)
			body = new ArrayList<>();
		this.body = body;

		updatePositions(value, body);
	}

	public SwitchCase(Object value, Object body) {
		super();

        if (value == null)
            throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = (Expression) value;

        this.body = castList(body, unwrapIfContext.andThen(Sentence.class::cast));
		updatePositions(value, body);
	}


    // ----------------------------------
    // switchCase -> value:expression body:sentence*

	// Child 'value:expression' 

	public void setValue(Expression value) {
		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

	}

    public Expression getValue() {
        return value;
    }


	// Child 'body:sentence*' 

	public void setBody(List<Sentence> body) {
		if (body == null)
			body = new ArrayList<>();
		this.body = body;

	}

    public List<Sentence> getBody() {
        return body;
    }

    public Stream<Sentence> body() {
        return body.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "SwitchCase{" + " value=" + this.getValue() + " body=" + this.getBody() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
