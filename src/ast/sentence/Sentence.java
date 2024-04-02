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
public interface Sentence extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'owner:functionDefinition' 

	public void setOwner(FunctionDefinition owner);
	public FunctionDefinition getOwner();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
