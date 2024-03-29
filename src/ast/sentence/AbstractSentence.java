// Generated with VGen 2.0.0

package ast.sentence;

import ast.*;
import org.antlr.v4.runtime.Token;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> hasReturn:boolean
	sentence -> owner:functionDefinition
*/
public abstract class AbstractSentence extends AbstractAST implements Sentence {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private boolean hasReturn;
	private FunctionDefinition owner;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'hasReturn:boolean' 

	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;

	}

    public boolean isHasReturn() {
        return hasReturn;
    }


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
