// Generated with VGen 2.0.0

package ast.type;

import ast.expression.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	arrayType: type -> dimension:intConstant tipo:type
	type -> 
*/
public class ArrayType extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// arrayType: type -> dimension:intConstant tipo:type
	private IntConstant dimension;
	private Type tipo;

    // ----------------------------------
    // Constructors

	public ArrayType(IntConstant dimension, Type tipo) {
		super();

		if (dimension == null)
			throw new IllegalArgumentException("Parameter 'dimension' can't be null. Pass a non-null value or use 'intConstant?' in the abstract grammar");
		this.dimension = dimension;

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = tipo;

		updatePositions(dimension, tipo);
	}

	public ArrayType(Object dimension, Object tipo) {
		super();

        if (dimension == null)
            throw new IllegalArgumentException("Parameter 'dimension' can't be null. Pass a non-null value or use 'intConstant?' in the abstract grammar");
		this.dimension = (IntConstant) dimension;

        if (tipo == null)
            throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = (Type) tipo;

		updatePositions(dimension, tipo);
	}


    // ----------------------------------
    // arrayType: type -> dimension:intConstant tipo:type

	// Child 'dimension:intConstant' 

	public void setDimension(IntConstant dimension) {
		if (dimension == null)
			throw new IllegalArgumentException("Parameter 'dimension' can't be null. Pass a non-null value or use 'intConstant?' in the abstract grammar");
		this.dimension = dimension;

	}

    public IntConstant getDimension() {
        return dimension;
    }


	// Child 'tipo:type' 

	public void setTipo(Type tipo) {
		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = tipo;

	}

    public Type getTipo() {
        return tipo;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayType{" + " dimension=" + this.getDimension() + " tipo=" + this.getTipo() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
