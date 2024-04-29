// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.Scope;
import ast.expression.*;
import codegeneration.mapl.*;
import codegeneration.mapl.utils.MaplUtils;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		if(variable.getDefinition().getScope() == Scope.GLOBAL)
			out("PUSHA " + variable.getDefinition().getAddress());
		else{
			out("PUSHBP");
			out("PUSHA " + variable.getDefinition().getAddress());
			out("ADDI");
		}

		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		// value(fieldAccess.getRoot());
		// address(fieldAccess.getRoot());

		address(fieldAccess.getRoot());
		out("PUSHI " + fieldAccess.getRoot().getType());
		out("ADDI");

		return null;
	}

	// class ArrayAccess(Expression array, Expression index)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// value(arrayAccess.getArray());
		// address(arrayAccess.getArray());

		// value(arrayAccess.getIndex());
		// address(arrayAccess.getIndex());

		address(arrayAccess.getArray());
		value(arrayAccess.getIndex());
		out("PUSHI " + MaplUtils.maplTypeSize(arrayAccess.getType()));
		out("MULI");
		out("ADDI");

		return null;
	}

}
