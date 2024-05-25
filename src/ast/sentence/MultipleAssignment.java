// Generated with VGen 2.0.0

package ast.sentence;

import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	multipleAssignment: sentence -> assignments:assignment*
	sentence -> 
	
	PHASE TypeChecking
	sentence -> owner:functionDefinition
*/
public class MultipleAssignment extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// multipleAssignment: sentence -> assignments:assignment*
	private List<Assignment> assignments;

    // ----------------------------------
    // Constructors

	public MultipleAssignment(List<Assignment> assignments) {
		super();

		if (assignments == null)
			assignments = new ArrayList<>();
		this.assignments = assignments;

		updatePositions(assignments);
	}

	public MultipleAssignment(Object assignments) {
		super();

        this.assignments = castList(assignments, unwrapIfContext.andThen(Assignment.class::cast));
		updatePositions(assignments);
	}


    // ----------------------------------
    // multipleAssignment: sentence -> assignments:assignment*

	// Child 'assignments:assignment*' 

	public void setAssignments(List<Assignment> assignments) {
		if (assignments == null)
			assignments = new ArrayList<>();
		this.assignments = assignments;

	}

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public Stream<Assignment> assignments() {
        return assignments.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "MultipleAssignment{" + " assignments=" + this.getAssignments() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
