// Generated with VGen 2.0.0

package ast;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	varDefinition -> name:string tipo:type
*/
public class VarDefinition extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// varDefinition -> name:string tipo:type
	private String name;
	private Type tipo;

    // ----------------------------------
    // Constructors

	public VarDefinition(String name, Type tipo) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (tipo == null)
			throw new IllegalArgumentException("Parameter 'tipo' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.tipo = tipo;

		updatePositions(name, tipo);
	}

	public VarDefinition(Object name, Object tipo) {
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
    // varDefinition -> name:string tipo:type

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


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VarDefinition{" + " name=" + this.getName() + " tipo=" + this.getTipo() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
