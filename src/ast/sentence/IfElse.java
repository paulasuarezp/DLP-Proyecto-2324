// Generated with VGen 2.0.0

package ast.sentence;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	ifElse: sentence -> condition:expression trueBlock:sentence* falseBlock:sentence*
	sentence -> 
*/
public class IfElse extends AbstractSentence  {

    // ----------------------------------
    // Instance Variables

	// ifElse: sentence -> condition:expression trueBlock:sentence* falseBlock:sentence*
	private Expression condition;
	private List<Sentence> trueBlock;
	private List<Sentence> falseBlock;

    // ----------------------------------
    // Constructors

	public IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock) {
		super();

		if (condition == null)
			throw new IllegalArgumentException("Parameter 'condition' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condition = condition;

		if (trueBlock == null)
			trueBlock = new ArrayList<>();
		this.trueBlock = trueBlock;

		if (falseBlock == null)
			falseBlock = new ArrayList<>();
		this.falseBlock = falseBlock;

		updatePositions(condition, trueBlock, falseBlock);
	}

	public IfElse(Object condition, Object trueBlock, Object falseBlock) {
		super();

        if (condition == null)
            throw new IllegalArgumentException("Parameter 'condition' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condition = (Expression) condition;

        this.trueBlock = castList(trueBlock, unwrapIfContext.andThen(Sentence.class::cast));
        this.falseBlock = castList(falseBlock, unwrapIfContext.andThen(Sentence.class::cast));
		updatePositions(condition, trueBlock, falseBlock);
	}


    // ----------------------------------
    // ifElse: sentence -> condition:expression trueBlock:sentence* falseBlock:sentence*

	// Child 'condition:expression' 

	public void setCondition(Expression condition) {
		if (condition == null)
			throw new IllegalArgumentException("Parameter 'condition' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condition = condition;

	}

    public Expression getCondition() {
        return condition;
    }


	// Child 'trueBlock:sentence*' 

	public void setTrueBlock(List<Sentence> trueBlock) {
		if (trueBlock == null)
			trueBlock = new ArrayList<>();
		this.trueBlock = trueBlock;

	}

    public List<Sentence> getTrueBlock() {
        return trueBlock;
    }

    public Stream<Sentence> trueBlock() {
        return trueBlock.stream();
    }


	// Child 'falseBlock:sentence*' 

	public void setFalseBlock(List<Sentence> falseBlock) {
		if (falseBlock == null)
			falseBlock = new ArrayList<>();
		this.falseBlock = falseBlock;

	}

    public List<Sentence> getFalseBlock() {
        return falseBlock;
    }

    public Stream<Sentence> falseBlock() {
        return falseBlock.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "IfElse{" + " condition=" + this.getCondition() + " trueBlock=" + this.getTrueBlock() + " falseBlock=" + this.getFalseBlock() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
