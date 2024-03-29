// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	minusExpr: expression -> op:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> type:type
*/
public class MinusExpr extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// minusExpr: expression -> op:expression
	private Expression op;

    // ----------------------------------
    // Constructors

	public MinusExpr(Expression op) {
		super();

		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op = op;

		updatePositions(op);
	}

	public MinusExpr(Object op) {
		super();

        if (op == null)
            throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op = (Expression) op;

		updatePositions(op);
	}


    // ----------------------------------
    // minusExpr: expression -> op:expression

	// Child 'op:expression' 

	public void setOp(Expression op) {
		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op = op;

	}

    public Expression getOp() {
        return op;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "MinusExpr{" + " op=" + this.getOp() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
