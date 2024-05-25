// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	switch: sentence -> value:expression cases:switchCase* defaultCase:sentence*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> owner:functionDefinition
*/
public class Switch extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// switch: sentence -> value:expression cases:switchCase* defaultCase:sentence*
	private Expression value;
	private List<SwitchCase> cases;
	private List<Sentence> defaultCase;

    // ----------------------------------
    // Constructors

	public Switch(Expression value, List<SwitchCase> cases, List<Sentence> defaultCase) {
		super();

		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

		if (cases == null)
			cases = new ArrayList<>();
		this.cases = cases;

		if (defaultCase == null)
			defaultCase = new ArrayList<>();
		this.defaultCase = defaultCase;

		updatePositions(value, cases, defaultCase);
	}

	public Switch(Object value, Object cases, Object defaultCase) {
		super();

        if (value == null)
            throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = (Expression) value;

        this.cases = castList(cases, unwrapIfContext.andThen(SwitchCase.class::cast));
        this.defaultCase = castList(defaultCase, unwrapIfContext.andThen(Sentence.class::cast));
		updatePositions(value, cases, defaultCase);
	}


    // ----------------------------------
    // switch: sentence -> value:expression cases:switchCase* defaultCase:sentence*

	// Child 'value:expression' 

	public void setValue(Expression value) {
		if (value == null)
			throw new IllegalArgumentException("Parameter 'value' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.value = value;

	}

    public Expression getValue() {
        return value;
    }


	// Child 'cases:switchCase*' 

	public void setCases(List<SwitchCase> cases) {
		if (cases == null)
			cases = new ArrayList<>();
		this.cases = cases;

	}

    public List<SwitchCase> getCases() {
        return cases;
    }

    public Stream<SwitchCase> cases() {
        return cases.stream();
    }


	// Child 'defaultCase:sentence*' 

	public void setDefaultCase(List<Sentence> defaultCase) {
		if (defaultCase == null)
			defaultCase = new ArrayList<>();
		this.defaultCase = defaultCase;

	}

    public List<Sentence> getDefaultCase() {
        return defaultCase;
    }

    public Stream<Sentence> defaultCase() {
        return defaultCase.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Switch{" + " value=" + this.getValue() + " cases=" + this.getCases() + " defaultCase=" + this.getDefaultCase() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
