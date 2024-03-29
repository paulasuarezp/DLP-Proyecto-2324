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
	print: sentence -> op:string input:expression*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> hasReturn:boolean
	sentence -> owner:functionDefinition
*/
public class Print extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// print: sentence -> op:string input:expression*
	private String op;
	private List<Expression> input;

    // ----------------------------------
    // Constructors

	public Print(String op, List<Expression> input) {
		super();

		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = op;

		if (input == null)
			input = new ArrayList<>();
		this.input = input;

		updatePositions(op, input);
	}

	public Print(Object op, Object input) {
		super();

        if (op == null)
            throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = (op instanceof Token) ? ((Token) op).getText() : (String) op;

        this.input = castList(input, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(op, input);
	}


    // ----------------------------------
    // print: sentence -> op:string input:expression*

	// Child 'op:string' 

	public void setOp(String op) {
		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = op;

	}

    public String getOp() {
        return op;
    }


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
        return "Print{" + " op=" + this.getOp() + " input=" + this.getInput() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
