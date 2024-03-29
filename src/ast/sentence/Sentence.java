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
public interface Sentence extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'hasReturn:boolean' 

	public void setHasReturn(boolean hasReturn);
	public boolean isHasReturn();

	// Attribute 'owner:functionDefinition' 

	public void setOwner(FunctionDefinition owner);
	public FunctionDefinition getOwner();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
