// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	loop: sentence -> from:assignment* until:expression body:sentence*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> hasReturn:boolean
*/
public class Loop extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// loop: sentence -> from:assignment* until:expression body:sentence*
	private List<Assignment> from;
	private Expression until;
	private List<Sentence> body;

    // ----------------------------------
    // Constructors

	public Loop(List<Assignment> from, Expression until, List<Sentence> body) {
		super();

		if (from == null)
			from = new ArrayList<>();
		this.from = from;

		if (until == null)
			throw new IllegalArgumentException("Parameter 'until' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.until = until;

		if (body == null)
			body = new ArrayList<>();
		this.body = body;

		updatePositions(from, until, body);
	}

	public Loop(Object from, Object until, Object body) {
		super();

        this.from = castList(from, unwrapIfContext.andThen(Assignment.class::cast));
        if (until == null)
            throw new IllegalArgumentException("Parameter 'until' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.until = (Expression) until;

        this.body = castList(body, unwrapIfContext.andThen(Sentence.class::cast));
		updatePositions(from, until, body);
	}


    // ----------------------------------
    // loop: sentence -> from:assignment* until:expression body:sentence*

	// Child 'from:assignment*' 

	public void setFrom(List<Assignment> from) {
		if (from == null)
			from = new ArrayList<>();
		this.from = from;

	}

    public List<Assignment> getFrom() {
        return from;
    }

    public Stream<Assignment> from() {
        return from.stream();
    }


	// Child 'until:expression' 

	public void setUntil(Expression until) {
		if (until == null)
			throw new IllegalArgumentException("Parameter 'until' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.until = until;

	}

    public Expression getUntil() {
        return until;
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
        return "Loop{" + " from=" + this.getFrom() + " until=" + this.getUntil() + " body=" + this.getBody() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
