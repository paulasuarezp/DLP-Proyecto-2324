// Generated with VGen 2.0.0

package ast.sentence;

import ast.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> owner:functionDefinition
*/
public abstract class AbstractSentence extends AbstractAST implements Sentence {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private FunctionDefinition owner;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'owner:functionDefinition' 

	public void setOwner(FunctionDefinition owner) {
		if (owner == null)
			throw new IllegalArgumentException("Parameter 'owner' can't be null. Pass a non-null value or use 'functionDefinition?' in the abstract grammar");
		this.owner = owner;

	}

    public FunctionDefinition getOwner() {
        return owner;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
