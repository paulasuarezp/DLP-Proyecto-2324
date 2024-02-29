// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	cast: expression -> castType:type value:expression
	expression -> 
*/
public class Cast extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// cast: expression -> castType:type value:expression
	private Type castType;
	private Expression value;

    // ----------------------------------
    // Constructors

	public Cast(Type castType, Expression value) {
		super();

		if (castType == null)
			throw new IllegalArgumentException("Parameter 'castType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.castType = castType;

		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

		updatePositions(castType, value);
	}

	public Cast(Object castType, Object value) {
		super();

        if (castType == null)
            throw new IllegalArgumentException("Parameter 'castType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.castType = (Type) castType;

        if (value == null)
            throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = (Expression) value;

		updatePositions(castType, value);
	}


    // ----------------------------------
    // cast: expression -> castType:type value:expression

	// Child 'castType:type' 

	public void setCastType(Type castType) {
		if (castType == null)
			throw new IllegalArgumentException("Parameter 'castType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.castType = castType;

	}

    public Type getCastType() {
        return castType;
    }


	// Child 'value:expression' 

	public void setValue(Expression value) {
		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

	}

    public Expression getValue() {
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
        return "Cast{" + " castType=" + this.getCastType() + " value=" + this.getValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
