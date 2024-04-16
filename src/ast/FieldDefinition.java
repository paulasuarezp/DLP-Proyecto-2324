// Generated with VGen 2.0.0

package ast;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	fieldDefinition -> name:string tipo:type
	
	PHASE Identification
	fieldDefinition -> fieldOwner:structType
	
	PHASE MemoryAllocation
	fieldDefinition -> address:int
*/
public class FieldDefinition extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// fieldDefinition -> name:string tipo:type
	private String name;
	private Type tipo;

    // PHASE Identification
	private StructType fieldOwner;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public FieldDefinition(String name, Type tipo) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = tipo;

		updatePositions(name, tipo);
	}

	public FieldDefinition(Object name, Object tipo) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        if (tipo == null)
            throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = (Type) tipo;

		updatePositions(name, tipo);
	}


    // ----------------------------------
    // fieldDefinition -> name:string tipo:type

	// Child 'name:string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
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



    // --------------------------------
    // PHASE Identification

	// Attribute 'fieldOwner:structType' 

	public void setFieldOwner(StructType fieldOwner) {
		if (fieldOwner == null)
			throw new IllegalArgumentException("Parameter 'fieldOwner' can't be null. Pass a non-null value or use 'structType?' in the abstract grammar");
		this.fieldOwner = fieldOwner;

	}

    public StructType getFieldOwner() {
        return fieldOwner;
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FieldDefinition{" + " name=" + this.getName() + " tipo=" + this.getTipo() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
