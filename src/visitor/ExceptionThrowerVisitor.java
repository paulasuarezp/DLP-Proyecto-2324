// Generated with VGen 2.0.0

/**
* Visitor del que derivar cuando se quiera que todo visit no redefinido lance
* una excepción si es invocado.
*
*/

package visitor;

import ast.*;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


public class ExceptionThrowerVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Program)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(RunCall runCall, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(RunCall)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(StructDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FieldDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(VarDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionBuilder)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionCallSent)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Assignment)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Loop loop, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Loop)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(IfElse ifElse, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(IfElse)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Read read, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Read)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Print print, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Print)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Return returnValue, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Return)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(IntConstant intConstant, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(IntConstant)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(RealConstant realConstant, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(RealConstant)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(CharConstant charConstant, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(CharConstant)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Variable variable, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Variable)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(CastExpr castExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(CastExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArithmeticExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(LogicalExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ComparationExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(MinusExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(NotExpr notExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(NotExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionCallExpr)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FieldAccess)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArrayAccess)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(IntType intType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(IntType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(DoubleType doubleType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(DoubleType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(CharType charType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(CharType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(VoidType voidType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(VoidType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(StructType structType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(StructType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArrayType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(BooleanType booleanType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(BooleanType)' has been invoked but it has not been implemented.");
	}

    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
