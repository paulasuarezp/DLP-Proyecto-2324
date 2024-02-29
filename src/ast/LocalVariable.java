// Generated with VGen 2.0.0

package ast;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	localVariable -> varDefinition:varDefinition
*/
public class LocalVariable extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// localVariable -> varDefinition
	private VarDefinition varDefinition;

    // ----------------------------------
    // Constructors

	public LocalVariable(VarDefinition varDefinition) {
		super();

		if (varDefinition == null)
			throw new IllegalArgumentException("Parameter 'varDefinition' can't be null. Pass a non-null value or use 'varDefinition?' in the abstract grammar");
		this.varDefinition = varDefinition;

		updatePositions(varDefinition);
	}

	public LocalVariable(Object varDefinition) {
		super();

        if (varDefinition == null)
            throw new IllegalArgumentException("Parameter 'varDefinition' can't be null. Pass a non-null value or use 'varDefinition?' in the abstract grammar");
		this.varDefinition = (VarDefinition) varDefinition;

		updatePositions(varDefinition);
	}


    // ----------------------------------
    // localVariable -> varDefinition

	// Child 'varDefinition' 

	public void setVarDefinition(VarDefinition varDefinition) {
		if (varDefinition == null)
			throw new IllegalArgumentException("Parameter 'varDefinition' can't be null. Pass a non-null value or use 'varDefinition?' in the abstract grammar");
		this.varDefinition = varDefinition;

	}

    public VarDefinition getVarDefinition() {
        return varDefinition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LocalVariable{" + " varDefinition=" + this.getVarDefinition() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
