// Generated with VGen 2.0.0

package ast;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	program -> name:string types:structDefinition* vars:varDefinition* builders:functionBuilder* features:functionDefinition* runCall:runCall
*/
public class Program extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// program -> name:string types:structDefinition* vars:varDefinition* builders:functionBuilder* features:functionDefinition* runCall:runCall
	private String name;
	private List<StructDefinition> types;
	private List<VarDefinition> vars;
	private List<FunctionBuilder> builders;
	private List<FunctionDefinition> features;
	private RunCall runCall;

    // ----------------------------------
    // Constructors

	public Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (types == null)
			types = new ArrayList<>();
		this.types = types;

		if (vars == null)
			vars = new ArrayList<>();
		this.vars = vars;

		if (builders == null)
			builders = new ArrayList<>();
		this.builders = builders;

		if (features == null)
			features = new ArrayList<>();
		this.features = features;

		if (runCall == null)
			throw new IllegalArgumentException("Parameter 'runCall' can't be null. Pass a non-null value or use 'runCall?' in the abstract grammar");
		this.runCall = runCall;

		updatePositions(name, types, vars, builders, features, runCall);
	}

	public Program(Object name, Object types, Object vars, Object builders, Object features, Object runCall) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.types = castList(types, unwrapIfContext.andThen(StructDefinition.class::cast));
        this.vars = castList(vars, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.builders = castList(builders, unwrapIfContext.andThen(FunctionBuilder.class::cast));
        this.features = castList(features, unwrapIfContext.andThen(FunctionDefinition.class::cast));
        if (runCall == null)
            throw new IllegalArgumentException("Parameter 'runCall' can't be null. Pass a non-null value or use 'runCall?' in the abstract grammar");
		this.runCall = (RunCall) runCall;

		updatePositions(name, types, vars, builders, features, runCall);
	}


    // ----------------------------------
    // program -> name:string types:structDefinition* vars:varDefinition* builders:functionBuilder* features:functionDefinition* runCall:runCall

	// Child 'name:string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'types:structDefinition*' 

	public void setTypes(List<StructDefinition> types) {
		if (types == null)
			types = new ArrayList<>();
		this.types = types;

	}

    public List<StructDefinition> getTypes() {
        return types;
    }

    public Stream<StructDefinition> types() {
        return types.stream();
    }


	// Child 'vars:varDefinition*' 

	public void setVars(List<VarDefinition> vars) {
		if (vars == null)
			vars = new ArrayList<>();
		this.vars = vars;

	}

    public List<VarDefinition> getVars() {
        return vars;
    }

    public Stream<VarDefinition> vars() {
        return vars.stream();
    }


	// Child 'builders:functionBuilder*' 

	public void setBuilders(List<FunctionBuilder> builders) {
		if (builders == null)
			builders = new ArrayList<>();
		this.builders = builders;

	}

    public List<FunctionBuilder> getBuilders() {
        return builders;
    }

    public Stream<FunctionBuilder> builders() {
        return builders.stream();
    }


	// Child 'features:functionDefinition*' 

	public void setFeatures(List<FunctionDefinition> features) {
		if (features == null)
			features = new ArrayList<>();
		this.features = features;

	}

    public List<FunctionDefinition> getFeatures() {
        return features;
    }

    public Stream<FunctionDefinition> features() {
        return features.stream();
    }


	// Child 'runCall:runCall' 

	public void setRunCall(RunCall runCall) {
		if (runCall == null)
			throw new IllegalArgumentException("Parameter 'runCall' can't be null. Pass a non-null value or use 'runCall?' in the abstract grammar");
		this.runCall = runCall;

	}

    public RunCall getRunCall() {
        return runCall;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Program{" + " name=" + this.getName() + " types=" + this.getTypes() + " vars=" + this.getVars() + " builders=" + this.getBuilders() + " features=" + this.getFeatures() + " runCall=" + this.getRunCall() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
