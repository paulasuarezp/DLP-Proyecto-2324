// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	fieldAccess: expression -> root:expression field:string
	expression -> 
*/
public class FieldAccess extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// fieldAccess: expression -> root:expression field:string
	private Expression root;
	private String field;

    // ----------------------------------
    // Constructors

	public FieldAccess(Expression root, String field) {
		super();

		if (root == null)
			throw new IllegalArgumentException("Parameter 'root' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.root = root;

		if (field == null)
			throw new IllegalArgumentException("Parameter 'field' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.field = field;

		updatePositions(root, field);
	}

	public FieldAccess(Object root, Object field) {
		super();

        if (root == null)
            throw new IllegalArgumentException("Parameter 'root' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.root = (Expression) root;

        if (field == null)
            throw new IllegalArgumentException("Parameter 'field' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.field = (field instanceof Token) ? ((Token) field).getText() : (String) field;

		updatePositions(root, field);
	}


    // ----------------------------------
    // fieldAccess: expression -> root:expression field:string

	// Child 'root:expression' 

	public void setRoot(Expression root) {
		if (root == null)
			throw new IllegalArgumentException("Parameter 'root' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.root = root;

	}

    public Expression getRoot() {
        return root;
    }


	// Child 'field:string' 

	public void setField(String field) {
		if (field == null)
			throw new IllegalArgumentException("Parameter 'field' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.field = field;

	}

    public String getField() {
        return field;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FieldAccess{" + " root=" + this.getRoot() + " field=" + this.getField() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
