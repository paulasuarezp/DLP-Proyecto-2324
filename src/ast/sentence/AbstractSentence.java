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
*/
public abstract class AbstractSentence extends AbstractAST implements Sentence {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private boolean hasReturn;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'hasReturn:boolean' 

	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;

	}

    public boolean isHasReturn() {
        return hasReturn;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
