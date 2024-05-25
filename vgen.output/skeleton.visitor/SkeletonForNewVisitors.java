// Generated with VGen 2.0.0


/*

Este fichero es un esqueleto para facilitar la creación de una clase visitor. Para
usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos
   los hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y
   se pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

*/

// TODO: write package name
// package ...;

import visitor.DefaultVisitor;
import ast.*;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;


public class SkeletonForNewVisitors extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(String name, List<StructDefinition> types, List<VarDefinition> vars, List<FunctionBuilder> builders, List<FunctionDefinition> features, RunCall runCall)
	@Override
	public Object visit(Program program, Object param) {

		// program.getTypes().forEach(structDefinition -> structDefinition.accept(this, param));
		// program.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// program.getBuilders().forEach(functionBuilder -> functionBuilder.accept(this, param));
		// program.getFeatures().forEach(functionDefinition -> functionDefinition.accept(this, param));
		// program.getRunCall().accept(this, param);
		super.visit(program, param);

		return null;
	}

	// class RunCall(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	@Override
	public Object visit(RunCall runCall, Object param) {

		// runCall.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(runCall, param);

		return null;
	}

	// class StructDefinition(StructType name, List<FieldDefinition> fields)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// structDefinition.getName().accept(this, param);
		// structDefinition.getFields().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> params, Optional<Type> returnType, List<VarDefinition> vars, List<Sentence> sentences)
	// phase Identification { boolean isBuilder }
	// phase TypeChecking { boolean hasReturn }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		// functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		// functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

	// class FieldDefinition(String name, Type tipo)
	// phase Identification { StructType fieldOwner }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		// fieldDefinition.getTipo().accept(this, param);
		super.visit(fieldDefinition, param);

		return null;
	}

	// class VarDefinition(String name, Type tipo)
	// phase Identification { Scope scope }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getTipo().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class FunctionBuilder(String name)
	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		return null;
	}

	// class FunctionCallSent(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		// functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallSent, param);

		return null;
	}

	// class Assignment(Expression left, Expression right)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Assignment assignment, Object param) {

		// assignment.getLeft().accept(this, param);
		// assignment.getRight().accept(this, param);
		super.visit(assignment, param);

		return null;
	}

	// class ComplexAssignment(Expression left, List<Expression> right)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(ComplexAssignment complexAssignment, Object param) {

		// complexAssignment.getLeft().accept(this, param);
		// complexAssignment.getRight().forEach(expression -> expression.accept(this, param));
		super.visit(complexAssignment, param);

		return null;
	}

	// class Loop(List<Assignment> from, Expression until, List<Sentence> body)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Loop loop, Object param) {

		// loop.getFrom().forEach(assignment -> assignment.accept(this, param));
		// loop.getUntil().accept(this, param);
		// loop.getBody().forEach(sentence -> sentence.accept(this, param));
		super.visit(loop, param);

		return null;
	}

	// class IfElse(Expression condition, List<Sentence> trueBlock, List<Sentence> falseBlock)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(IfElse ifElse, Object param) {

		// ifElse.getCondition().accept(this, param);
		// ifElse.getTrueBlock().forEach(sentence -> sentence.accept(this, param));
		// ifElse.getFalseBlock().forEach(sentence -> sentence.accept(this, param));
		super.visit(ifElse, param);

		return null;
	}

	// class Read(List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Read read, Object param) {

		// read.getInput().forEach(expression -> expression.accept(this, param));
		super.visit(read, param);

		return null;
	}

	// class Print(String op, List<Expression> input)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Print print, Object param) {

		// print.getInput().forEach(expression -> expression.accept(this, param));
		super.visit(print, param);

		return null;
	}

	// class Return(Optional<Expression> value)
	// phase TypeChecking { FunctionDefinition owner }
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getValue().ifPresent(value -> value.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class IntConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(IntConstant intConstant, Object param) {

		return null;
	}

	// class RealConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(RealConstant realConstant, Object param) {

		return null;
	}

	// class CharConstant(String value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CharConstant charConstant, Object param) {

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	// class CastExpr(Type castType, Expression value)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(CastExpr castExpr, Object param) {

		// castExpr.getCastType().accept(this, param);
		// castExpr.getValue().accept(this, param);
		super.visit(castExpr, param);

		return null;
	}

	// class ArithmeticExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

		// arithmeticExpr.getOp1().accept(this, param);
		// arithmeticExpr.getOp2().accept(this, param);
		super.visit(arithmeticExpr, param);

		return null;
	}

	// class LogicalExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		// logicalExpr.getOp1().accept(this, param);
		// logicalExpr.getOp2().accept(this, param);
		super.visit(logicalExpr, param);

		return null;
	}

	// class ComparationExpr(Expression op1, String operator, Expression op2)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

		// comparationExpr.getOp1().accept(this, param);
		// comparationExpr.getOp2().accept(this, param);
		super.visit(comparationExpr, param);

		return null;
	}

	// class MinusExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		// minusExpr.getOp().accept(this, param);
		super.visit(minusExpr, param);

		return null;
	}

	// class NotExpr(Expression op)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(NotExpr notExpr, Object param) {

		// notExpr.getOp().accept(this, param);
		super.visit(notExpr, param);

		return null;
	}

	// class FunctionCallExpr(String name, List<Expression> args)
	// phase Identification { FunctionDefinition definition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		// functionCallExpr.getArgs().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpr, param);

		return null;
	}

	// class FieldAccess(Expression root, String field)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		// fieldAccess.getRoot().accept(this, param);
		super.visit(fieldAccess, param);

		return null;
	}

	// class ArrayAccess(Expression array, Expression index)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getArray().accept(this, param);
		// arrayAccess.getIndex().accept(this, param);
		super.visit(arrayAccess, param);

		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	// class DoubleType()
	@Override
	public Object visit(DoubleType doubleType, Object param) {

		return null;
	}

	// class CharType()
	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	// class VoidType()
	@Override
	public Object visit(VoidType voidType, Object param) {

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition definition }
	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

	// class ArrayType(IntConstant dimension, Type tipo)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		// arrayType.getDimension().accept(this, param);
		// arrayType.getTipo().accept(this, param);
		super.visit(arrayType, param);

		return null;
	}

}
