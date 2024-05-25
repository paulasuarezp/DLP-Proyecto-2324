// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	complexAssignment: sentence -> left:expression right:expression*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> owner:functionDefinition
*/
public class ComplexAssignment extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// complexAssignment: sentence -> left:expression right:expression*
	private Expression left;
	private List<Expression> right;

    // ----------------------------------
    // Constructors

	public ComplexAssignment(Expression left, List<Expression> right) {
		super();

		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

		if (right == null)
			right = new ArrayList<>();
		this.right = right;

		updatePositions(left, right);
	}

	public ComplexAssignment(Object left, Object right) {
		super();

        if (left == null)
            throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = (Expression) left;

        this.right = castList(right, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(left, right);
	}


    // ----------------------------------
    // complexAssignment: sentence -> left:expression right:expression*

	// Child 'left:expression' 

	public void setLeft(Expression left) {
		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

	}

    public Expression getLeft() {
        return left;
    }


	// Child 'right:expression*' 

	public void setRight(List<Expression> right) {
		if (right == null)
			right = new ArrayList<>();
		this.right = right;

	}

    public List<Expression> getRight() {
        return right;
    }

    public Stream<Expression> right() {
        return right.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ComplexAssignment{" + " left=" + this.getLeft() + " right=" + this.getRight() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
