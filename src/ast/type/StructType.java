// Generated with VGen 2.0.0

package ast.type;

import ast.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structType: type -> name:string
	type -> 
	
	PHASE Identification
	structType -> definition:structDefinition
*/
public class StructType extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// structType: type -> name:string
	private String name;

    // PHASE Identification
	private StructDefinition definition;

    // ----------------------------------
    // Constructors

	public StructType(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public StructType(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // structType: type -> name:string

	// Child 'name:string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'definition:structDefinition' 

	public void setDefinition(StructDefinition definition) {
		if (definition == null)
			throw new IllegalArgumentException("Parameter 'definition' can't be null. Pass a non-null value or use 'structDefinition?' in the abstract grammar");
		this.definition = definition;

	}

    public StructDefinition getDefinition() {
        return definition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructType{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
