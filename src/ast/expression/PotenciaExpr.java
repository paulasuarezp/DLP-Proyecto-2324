// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	potenciaExpr: expression -> base:expression exponente:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> type:type
*/
public class PotenciaExpr extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// potenciaExpr: expression -> base:expression exponente:expression
	private Expression base;
	private Expression exponente;

    // ----------------------------------
    // Constructors

	public PotenciaExpr(Expression base, Expression exponente) {
		super();

		if (base == null)
			throw new IllegalArgumentException("Parameter 'base' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.base = base;

		if (exponente == null)
			throw new IllegalArgumentException("Parameter 'exponente' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.exponente = exponente;

		updatePositions(base, exponente);
	}

	public PotenciaExpr(Object base, Object exponente) {
		super();

        if (base == null)
            throw new IllegalArgumentException("Parameter 'base' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.base = (Expression) base;

        if (exponente == null)
            throw new IllegalArgumentException("Parameter 'exponente' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.exponente = (Expression) exponente;

		updatePositions(base, exponente);
	}


    // ----------------------------------
    // potenciaExpr: expression -> base:expression exponente:expression

	// Child 'base:expression' 

	public void setBase(Expression base) {
		if (base == null)
			throw new IllegalArgumentException("Parameter 'base' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.base = base;

	}

    public Expression getBase() {
        return base;
    }


	// Child 'exponente:expression' 

	public void setExponente(Expression exponente) {
		if (exponente == null)
			throw new IllegalArgumentException("Parameter 'exponente' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.exponente = exponente;

	}

    public Expression getExponente() {
        return exponente;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "PotenciaExpr{" + " base=" + this.getBase() + " exponente=" + this.getExponente() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
