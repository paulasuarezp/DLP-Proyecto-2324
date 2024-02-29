// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	logicalExpr: expression -> op1:expression operator:string op2:expression
	expression -> 
*/
public class LogicalExpr extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// logicalExpr: expression -> op1:expression operator:string op2:expression
	private Expression op1;
	private String operator;
	private Expression op2;

    // ----------------------------------
    // Constructors

	public LogicalExpr(Expression op1, String operator, Expression op2) {
		super();

		if (op1 == null)
			throw new IllegalArgumentException("Parameter 'op1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op1 = op1;

		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

		if (op2 == null)
			throw new IllegalArgumentException("Parameter 'op2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op2 = op2;

		updatePositions(op1, operator, op2);
	}

	public LogicalExpr(Object op1, Object operator, Object op2) {
		super();

        if (op1 == null)
            throw new IllegalArgumentException("Parameter 'op1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op1 = (Expression) op1;

        if (operator == null)
            throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = (operator instanceof Token) ? ((Token) operator).getText() : (String) operator;

        if (op2 == null)
            throw new IllegalArgumentException("Parameter 'op2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op2 = (Expression) op2;

		updatePositions(op1, operator, op2);
	}


    // ----------------------------------
    // logicalExpr: expression -> op1:expression operator:string op2:expression

	// Child 'op1:expression' 

	public void setOp1(Expression op1) {
		if (op1 == null)
			throw new IllegalArgumentException("Parameter 'op1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op1 = op1;

	}

    public Expression getOp1() {
        return op1;
    }


	// Child 'operator:string' 

	public void setOperator(String operator) {
		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

	}

    public String getOperator() {
        return operator;
    }


	// Child 'op2:expression' 

	public void setOp2(Expression op2) {
		if (op2 == null)
			throw new IllegalArgumentException("Parameter 'op2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.op2 = op2;

	}

    public Expression getOp2() {
        return op2;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LogicalExpr{" + " op1=" + this.getOp1() + " operator=" + this.getOperator() + " op2=" + this.getOp2() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
