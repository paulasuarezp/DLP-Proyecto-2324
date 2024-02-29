// Generated with VGen 2.0.0

/**
* Este interfaz es el resultado de la aplicación del patrón Visitor a los nodos del AST.
*/

package visitor;

import ast.*;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;




public interface Visitor {
	public Object visit(Program program, Object param);

	public Object visit(GlobalVariable globalVariable, Object param);

	public Object visit(LocalVariable localVariable, Object param);

	public Object visit(StructDefinition structDefinition, Object param);

	public Object visit(FunctionDefinition functionDefinition, Object param);

	public Object visit(FunctionCallSent functionCallSent, Object param);

	public Object visit(Assignment assignment, Object param);

	public Object visit(Loop loop, Object param);

	public Object visit(IfElse ifElse, Object param);

	public Object visit(Read read, Object param);

	public Object visit(Print print, Object param);

	public Object visit(Println println, Object param);

	public Object visit(Return returnValue, Object param);

	public Object visit(IntConstant intConstant, Object param);

	public Object visit(RealConstant realConstant, Object param);

	public Object visit(CharConstant charConstant, Object param);

	public Object visit(Variable variable, Object param);

	public Object visit(Cast cast, Object param);

	public Object visit(ArithmeticExpr arithmeticExpr, Object param);

	public Object visit(LogicalExpr logicalExpr, Object param);

	public Object visit(ComparationExpr comparationExpr, Object param);

	public Object visit(MinusExpr minusExpr, Object param);

	public Object visit(NotExpr notExpr, Object param);

	public Object visit(FunctionCallExpr functionCallExpr, Object param);

	public Object visit(FieldAccess fieldAccess, Object param);

	public Object visit(ArrayAccess arrayAccess, Object param);

	public Object visit(IntType intType, Object param);

	public Object visit(DoubleType doubleType, Object param);

	public Object visit(CharType charType, Object param);

	public Object visit(VoidType voidType, Object param);

	public Object visit(StructType structType, Object param);

	public Object visit(ArrayType arrayType, Object param);

	public Object visit(FieldDefinition fieldDefinition, Object param);

	public Object visit(VarDefinition varDefinition, Object param);


}
