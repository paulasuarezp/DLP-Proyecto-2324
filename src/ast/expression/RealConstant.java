// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	realConstant: expression -> value:string
	expression -> 
*/
public class RealConstant extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// realConstant: expression -> value:string
	private String value;

    // ----------------------------------
    // Constructors

	public RealConstant(String value) {
		super();

		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.value = value;

		updatePositions(value);
	}

	public RealConstant(Object value) {
		super();

        if (value == null)
            throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.value = (value instanceof Token) ? ((Token) value).getText() : (String) value;

		updatePositions(value);
	}


    // ----------------------------------
    // realConstant: expression -> value:string

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
        return "RealConstant{" + " value=" + this.getValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
