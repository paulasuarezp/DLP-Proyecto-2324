// Generated with VGen 2.0.0

package ast;

import ast.type.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structDefinition -> name:structType fields:fieldDefinition*
*/
public class StructDefinition extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// structDefinition -> name:structType fields:fieldDefinition*
	private StructType name;
	private List<FieldDefinition> fields;

    // ----------------------------------
    // Constructors

	public StructDefinition(StructType name, List<FieldDefinition> fields) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'structType?' in the abstract grammar");
		this.name = name;

		if (fields == null)
			fields = new ArrayList<>();
		this.fields = fields;

		updatePositions(name, fields);
	}

	public StructDefinition(Object name, Object fields) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'structType?' in the abstract grammar");
		this.name = (StructType) name;

        this.fields = castList(fields, unwrapIfContext.andThen(FieldDefinition.class::cast));
		updatePositions(name, fields);
	}


    // ----------------------------------
    // structDefinition -> name:structType fields:fieldDefinition*

	// Child 'name:structType' 

	public void setName(StructType name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'structType?' in the abstract grammar");
		this.name = name;

	}

    public StructType getName() {
        return name;
    }


	// Child 'fields:fieldDefinition*' 

	public void setFields(List<FieldDefinition> fields) {
		if (fields == null)
			fields = new ArrayList<>();
		this.fields = fields;

	}

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public Stream<FieldDefinition> fields() {
        return fields.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructDefinition{" + " name=" + this.getName() + " fields=" + this.getFields() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
