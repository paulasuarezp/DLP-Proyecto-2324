// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package visitor;

import ast.*;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getTypes().forEach(structDefinition -> structDefinition.accept(this, param));
		program.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		program.getBuilders().forEach(functionBuilder -> functionBuilder.accept(this, param));
		program.getFeatures().forEach(functionDefinition -> functionDefinition.accept(this, param));
		program.getRunCall().accept(this, param);
		return null;
	}

	@Override
	public Object visit(RunCall runCall, Object param) {

		runCall.getArgs().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		structDefinition.getName().accept(this, param);
		structDefinition.getFields().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		functionDefinition.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getReturnType().ifPresent(returnType -> returnType.accept(this, param));
		functionDefinition.getVars().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getSentences().forEach(sentence -> sentence.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		fieldDefinition.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		varDefinition.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		return null;
	}

	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		functionCallSent.getArgs().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

		assignment.getLeft().accept(this, param);
		assignment.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Loop loop, Object param) {

		loop.getFrom().forEach(assignment -> assignment.accept(this, param));
		loop.getUntil().accept(this, param);
		loop.getBody().forEach(sentence -> sentence.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IfElse ifElse, Object param) {

		ifElse.getCondition().accept(this, param);
		ifElse.getTrueBlock().forEach(sentence -> sentence.accept(this, param));
		ifElse.getFalseBlock().forEach(sentence -> sentence.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {

		read.getInput().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {

		print.getInput().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Return returnValue, Object param) {

		returnValue.getValue().ifPresent(value -> value.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IntConstant intConstant, Object param) {

		return null;
	}

	@Override
	public Object visit(RealConstant realConstant, Object param) {

		return null;
	}

	@Override
	public Object visit(CharConstant charConstant, Object param) {

		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	@Override
	public Object visit(CastExpr castExpr, Object param) {

		castExpr.getCastType().accept(this, param);
		castExpr.getValue().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

		arithmeticExpr.getOp1().accept(this, param);
		arithmeticExpr.getOp2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		logicalExpr.getOp1().accept(this, param);
		logicalExpr.getOp2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

		comparationExpr.getOp1().accept(this, param);
		comparationExpr.getOp2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		minusExpr.getOp().accept(this, param);
		return null;
	}

	@Override
	public Object visit(NotExpr notExpr, Object param) {

		notExpr.getOp().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		functionCallExpr.getArgs().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		fieldAccess.getRoot().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		arrayAccess.getArray().accept(this, param);
		arrayAccess.getIndex().accept(this, param);
		return null;
	}

	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	@Override
	public Object visit(DoubleType doubleType, Object param) {

		return null;
	}

	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	@Override
	public Object visit(VoidType voidType, Object param) {

		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

		arrayType.getDimension().accept(this, param);
		arrayType.getTipo().accept(this, param);
		return null;
	}

	@Override
	public Object visit(BooleanType booleanType, Object param) {

		return null;
	}


}
