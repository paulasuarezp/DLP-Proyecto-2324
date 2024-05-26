// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	booleanConstant: expression -> value:string
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> type:type
*/
public class BooleanConstant extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// booleanConstant: expression -> value:string
	private String value;

    // ----------------------------------
    // Constructors

	public BooleanConstant(String value) {
		super();

		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.value = value;

		updatePositions(value);
	}

	public BooleanConstant(Object value) {
		super();

        if (value == null)
            throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.value = (value instanceof Token) ? ((Token) value).getText() : (String) value;

		updatePositions(value);
	}


    // ----------------------------------
    // booleanConstant: expression -> value:string

	// Child 'value:string' 

	public void setValue(String value) {
		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.value = value;

	}

    public String getValue() {
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
        return "BooleanConstant{" + " value=" + this.getValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
