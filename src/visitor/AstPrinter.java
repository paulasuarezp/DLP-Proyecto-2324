// Generated with VGen 2.0.0

/**
 * AstPrinter. Utilidad que ayuda a validar un arbol AST:
 * - Muestra la estructura del árbol en HTML.
 * - Destaca los hijos/propiedades a null.
 * - Muestra a qué texto apuntan las posiciones de cada nodo (linea/columna)
 *   ayudando a decidir cual de ellas usar en los errores y generación de código.
 *
 * Esta clase se genera con VGen. El uso de esta clase es opcional (puede eliminarse del proyecto).
 *
 */

package visitor;

import ast.*;
import ast.sentence.*;
import ast.expression.*;
import ast.type.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class AstPrinter implements Visitor {

    // Css classes
    private static final String OMITTED_SOURCE_TEXT_CLASS = "omittedSourceText";
    private static final String POS_CLASS = "vgen-pos";
    private static final String DOTS_CLASS = "vgen-dots";
    private static final String VALUE_CLASS = "vgen-value";
    private static final String BODY_CLASS = "vgen-body";
    private static final String CHILD_NAME_CLASS = "vgen-child-name";
    private static final String TABS_CLASS = "vgen-tabs";
    private static final String TYPE_CLASS = "vgen-type";
    private static final String NON_NODE_SOURCE_TEXT_CLASS = "vgen-nonNodeSourceText";
    private static final String NODE_SOURCE_TEXT_CLASS = "vgen-nodeSourceText";
    private static final String SOURCE_TEXT_CLASS = "vgen-sourceText";
    private static final String NULL_CLASS = "vgen-null";

    /**
    * toHtml. Muestra la estructura del AST indicando qué hay en las posiciones
    * (línea y columna) de cada nodo.
    *
    * @param sourceFile El fichero del cual se ha obtenido el AST.
    * @param root       El AST creado a partir de sourceFile.
    * @param filename   Nombre del fichero HMTL a crear con la traza del AST.
    */

    public static void toHtml(String sourceFile, AST root, String filename) {
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(filename.endsWith(".html") ? filename : filename + ".html"))) {

            writer.println(HEADER);

            if (root != null) {
                AstPrinter printer = new AstPrinter(writer, loadLines(sourceFile));
                printer.printNodes(root);
            } else
                writer.println("root == null");

            writer.println(FOOTER);

            System.err.println(ls + "AstPrinter: Fichero '" + filename + ".html' generado.");

        } catch (IOException e) {
            System.err.println(ls + "AstPrinter: No se ha podido crear el fichero " + filename);
            e.printStackTrace();
        }
    }

    private void printNodes(AST root) {
        writer.println("<div class=\"" + BODY_CLASS + "\">");

        writeDiv(span(CHILD_NAME_CLASS, root.getClass().getSimpleName()) + " = ");
        root.accept(this, Integer.valueOf(0));

        writer.println("</div>");

    }

    public static void toHtml(AST raiz, String filename) {
        toHtml(null, raiz, filename);
    }

    private AstPrinter(PrintWriter writer, List<String> sourceLines) {
        this(writer, sourceLines, 3);
    }

    private AstPrinter(PrintWriter writer, List<String> sourceLines, int tabSize) {
        this.writer = writer;
        this.sourceLines = sourceLines;
        this.tabSize = tabSize;

        tabulator = "&nbsp;".repeat(tabSize - 1);
    }

    //$ -------------------------------------------------------------------------------------
    // Aquí empiezan los 'visit' de los nodos


	@Override
	public Object visit(Program program, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", program.getName());
        printListOfNodesChild(indent + 1, "types", "List<StructDefinition>", program.getTypes());
        printListOfNodesChild(indent + 1, "vars", "List<VarDefinition>", program.getVars());
        printListOfNodesChild(indent + 1, "builders", "List<FunctionBuilder>", program.getBuilders());
        printListOfNodesChild(indent + 1, "features", "List<FunctionDefinition>", program.getFeatures());
        printNodeChild(indent + 1, "runCall", "RunCall", program.getRunCall());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, program, "name", "types", "vars", "builders", "features", "runCall");
		return null;
	}

	@Override
	public Object visit(RunCall runCall, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", runCall.getName());
        printListOfNodesChild(indent + 1, "args", "List<Expression>", runCall.getArgs());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definition", "FunctionDefinition", runCall.getDefinition());
		printUnknownFields(indent + 1, runCall, "name", "args", "definition");
		return null;
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "name", "StructType", structDefinition.getName());
        printListOfNodesChild(indent + 1, "fields", "List<FieldDefinition>", structDefinition.getFields());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, structDefinition, "name", "fields");
		return null;
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", functionDefinition.getName());
        printListOfNodesChild(indent + 1, "params", "List<VarDefinition>", functionDefinition.getParams());
        printNodeChild(indent + 1, "returnType", "Optional<Type>", functionDefinition.getReturnType().orElse(null));
        printListOfNodesChild(indent + 1, "vars", "List<VarDefinition>", functionDefinition.getVars());
        printListOfNodesChild(indent + 1, "sentences", "List<Sentence>", functionDefinition.getSentences());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "isBuilder", "boolean", functionDefinition.isIsBuilder());
        printToString(indent + 1, "vgen-attribute-phase-1", "hasReturn", "boolean", functionDefinition.isHasReturn());
		printUnknownFields(indent + 1, functionDefinition, "name", "params", "returnType", "vars", "sentences", "isBuilder", "hasReturn");
		return null;
	}

	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", fieldDefinition.getName());
        printNodeChild(indent + 1, "tipo", "Type", fieldDefinition.getTipo());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "fieldOwner", "StructType", fieldDefinition.getFieldOwner());
        printToString(indent + 1, "vgen-attribute-phase-2", "address", "int", fieldDefinition.getAddress());
		printUnknownFields(indent + 1, fieldDefinition, "name", "tipo", "fieldOwner", "address");
		return null;
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", varDefinition.getName());
        printNodeChild(indent + 1, "tipo", "Type", varDefinition.getTipo());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "scope", "Scope", varDefinition.getScope());
        printToString(indent + 1, "vgen-attribute-phase-2", "address", "int", varDefinition.getAddress());
		printUnknownFields(indent + 1, varDefinition, "name", "tipo", "scope", "address");
		return null;
	}

	@Override
	public Object visit(FunctionBuilder functionBuilder, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", functionBuilder.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, functionBuilder, "name");
		return null;
	}

	@Override
	public Object visit(FunctionCallSent functionCallSent, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", functionCallSent.getName());
        printListOfNodesChild(indent + 1, "args", "List<Expression>", functionCallSent.getArgs());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definition", "FunctionDefinition", functionCallSent.getDefinition());
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", functionCallSent.getOwner());
		printUnknownFields(indent + 1, functionCallSent, "name", "args", "owner", "definition");
		return null;
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "left", "Expression", assignment.getLeft());
        printNodeChild(indent + 1, "right", "Expression", assignment.getRight());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", assignment.getOwner());
		printUnknownFields(indent + 1, assignment, "left", "right", "owner");
		return null;
	}

	@Override
	public Object visit(Loop loop, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "from", "List<Assignment>", loop.getFrom());
        printNodeChild(indent + 1, "until", "Expression", loop.getUntil());
        printListOfNodesChild(indent + 1, "body", "List<Sentence>", loop.getBody());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", loop.getOwner());
		printUnknownFields(indent + 1, loop, "from", "until", "body", "owner");
		return null;
	}

	@Override
	public Object visit(IfElse ifElse, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "condition", "Expression", ifElse.getCondition());
        printListOfNodesChild(indent + 1, "trueBlock", "List<Sentence>", ifElse.getTrueBlock());
        printListOfNodesChild(indent + 1, "falseBlock", "List<Sentence>", ifElse.getFalseBlock());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", ifElse.getOwner());
		printUnknownFields(indent + 1, ifElse, "condition", "trueBlock", "falseBlock", "owner");
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printListOfNodesChild(indent + 1, "input", "List<Expression>", read.getInput());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", read.getOwner());
		printUnknownFields(indent + 1, read, "input", "owner");
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "op", "String", print.getOp());
        printListOfNodesChild(indent + 1, "input", "List<Expression>", print.getInput());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", print.getOwner());
		printUnknownFields(indent + 1, print, "op", "input", "owner");
		return null;
	}

	@Override
	public Object visit(Return returnValue, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "value", "Optional<Expression>", returnValue.getValue().orElse(null));

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "owner", "FunctionDefinition", returnValue.getOwner());
		printUnknownFields(indent + 1, returnValue, "value", "owner");
		return null;
	}

	@Override
	public Object visit(IntConstant intConstant, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "value", "String", intConstant.getValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", intConstant.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", intConstant.getType());
		printUnknownFields(indent + 1, intConstant, "value", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(RealConstant realConstant, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "value", "String", realConstant.getValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", realConstant.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", realConstant.getType());
		printUnknownFields(indent + 1, realConstant, "value", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(CharConstant charConstant, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "value", "String", charConstant.getValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", charConstant.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", charConstant.getType());
		printUnknownFields(indent + 1, charConstant, "value", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", variable.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definition", "VarDefinition", variable.getDefinition());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", variable.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", variable.getType());
		printUnknownFields(indent + 1, variable, "name", "lvalue", "type", "definition");
		return null;
	}

	@Override
	public Object visit(CastExpr castExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "castType", "Type", castExpr.getCastType());
        printNodeChild(indent + 1, "value", "Expression", castExpr.getValue());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", castExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", castExpr.getType());
		printUnknownFields(indent + 1, castExpr, "castType", "value", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(ArithmeticExpr arithmeticExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "op1", "Expression", arithmeticExpr.getOp1());
        printNonNodeChild(indent + 1, "operator", "String", arithmeticExpr.getOperator());
        printNodeChild(indent + 1, "op2", "Expression", arithmeticExpr.getOp2());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", arithmeticExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", arithmeticExpr.getType());
		printUnknownFields(indent + 1, arithmeticExpr, "op1", "operator", "op2", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(LogicalExpr logicalExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "op1", "Expression", logicalExpr.getOp1());
        printNonNodeChild(indent + 1, "operator", "String", logicalExpr.getOperator());
        printNodeChild(indent + 1, "op2", "Expression", logicalExpr.getOp2());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", logicalExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", logicalExpr.getType());
		printUnknownFields(indent + 1, logicalExpr, "op1", "operator", "op2", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(ComparationExpr comparationExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "op1", "Expression", comparationExpr.getOp1());
        printNonNodeChild(indent + 1, "operator", "String", comparationExpr.getOperator());
        printNodeChild(indent + 1, "op2", "Expression", comparationExpr.getOp2());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", comparationExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", comparationExpr.getType());
		printUnknownFields(indent + 1, comparationExpr, "op1", "operator", "op2", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(MinusExpr minusExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "op", "Expression", minusExpr.getOp());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", minusExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", minusExpr.getType());
		printUnknownFields(indent + 1, minusExpr, "op", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(NotExpr notExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "op", "Expression", notExpr.getOp());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", notExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", notExpr.getType());
		printUnknownFields(indent + 1, notExpr, "op", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(FunctionCallExpr functionCallExpr, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", functionCallExpr.getName());
        printListOfNodesChild(indent + 1, "args", "List<Expression>", functionCallExpr.getArgs());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definition", "FunctionDefinition", functionCallExpr.getDefinition());
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", functionCallExpr.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", functionCallExpr.getType());
		printUnknownFields(indent + 1, functionCallExpr, "name", "args", "lvalue", "type", "definition");
		return null;
	}

	@Override
	public Object visit(FieldAccess fieldAccess, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "root", "Expression", fieldAccess.getRoot());
        printNonNodeChild(indent + 1, "field", "String", fieldAccess.getField());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", fieldAccess.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", fieldAccess.getType());
		printUnknownFields(indent + 1, fieldAccess, "root", "field", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "array", "Expression", arrayAccess.getArray());
        printNodeChild(indent + 1, "index", "Expression", arrayAccess.getIndex());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-1", "lvalue", "boolean", arrayAccess.isLvalue());
        printToString(indent + 1, "vgen-attribute-phase-1", "type", "Type", arrayAccess.getType());
		printUnknownFields(indent + 1, arrayAccess, "array", "index", "lvalue", "type");
		return null;
	}

	@Override
	public Object visit(IntType intType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, intType, "");
		return null;
	}

	@Override
	public Object visit(DoubleType doubleType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, doubleType, "");
		return null;
	}

	@Override
	public Object visit(CharType charType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, charType, "");
		return null;
	}

	@Override
	public Object visit(VoidType voidType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, voidType, "");
		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNonNodeChild(indent + 1, "name", "String", structType.getName());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
        printToString(indent + 1, "vgen-attribute-phase-0", "definition", "StructDefinition", structType.getDefinition());
		printUnknownFields(indent + 1, structType, "name", "definition");
		return null;
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

		int indent = ((Integer)param);

		// Imprimir los hijos (y recorrer si son nodos del AST)
        printNodeChild(indent + 1, "dimension", "IntConstant", arrayType.getDimension());
        printNodeChild(indent + 1, "tipo", "Type", arrayType.getTipo());

		// Imprimir el 'toString()' de los atributos (pero no recorrer)
		printUnknownFields(indent + 1, arrayType, "dimension", "tipo");
		return null;
	}



    //$ -------------------------------------------------------------------------------------
    // Métodos invocados desde los métodos visit para imprimir los hijos

    /**
     * Método para imprimir aquel Child que sea un nodo del AST. Después de imprimirlo recorre sus hijos.
     */
    private void printNodeChild(int indent, String name, String type, AST node) {

        if (node == null) {
            writeDivWithTabs(indent,
                    span(CHILD_NAME_CLASS, name) + " = " + valueSpan(null) + "  " + span(TYPE_CLASS, type));
            return;
        }

        String text = name + " " + node.getClass().getSimpleName() + " ="; // Usado sólo para calcular tamaño sin tag 'span'
        String sourceText = getAlignedSourceText(indent, text.length(), node);

        writeDivWithTabs(indent, span(CHILD_NAME_CLASS, name) + " " + span(TYPE_CLASS, node.getClass().getSimpleName())
                + " =" + sourceText);

        node.accept(this, indent);
    }

    /**
     * Método para imprimir aquel Child que sea una lista de nodos del AST (pe, 'sentence*').
     * Imprime y recorre cada nodo de la lista.
     */
    private void printListOfNodesChild(int indent, String name, String type, List<? extends AST> nodes) {
        writeDivWithTabs(indent, span(CHILD_NAME_CLASS, name) + escapedSpan(TYPE_CLASS, " " + type) + " =");

        if (nodes != null)
            for (int i = 0; i < nodes.size(); i++) {
                AST node = nodes.get(i);

                String text = i + ": " + node.getClass().getSimpleName() + " ="; // Usado sólo para calcular tamaño sin tag 'span'
                String sourceText = getAlignedSourceText(indent + 1, text.length(), node);

                writeDivWithTabs(indent + 1, span(CHILD_NAME_CLASS, i + "") + ": "
                        + span(TYPE_CLASS, node.getClass().getSimpleName()) + " =" + sourceText);

                node.accept(this, indent + 1);
            }
        else
            writer.print(" " + valueSpan(null));
    }

    /**
     * Método para imprimir todo Child que no sea visitable, es decir, todo hijo que no sea un
     * nodo o lista de nodos.
     * Se limita a imprimir el 'toString()' de dicho hijo.
     */
    private void printNonNodeChild(int indent, String name, String type, Object value) {
        printToString(indent, CHILD_NAME_CLASS, name, type, value);
    }

    /**
     * Dado un nodo, busca e imprime todo aquel miembro que no se haya declarado en la Gramática Abstracta.
     * La razón por la que no se hace todo con Introspección es porque se quiere respetar el orden de
     * los hijos declarados en la Gramática Abstracta y, por ello, éstos se imprimen antes en el
     * 'visit'.
     * El parámetro knownFields son los miembros ya imprimidos del nodo y que no deben repetirse.
     */
    private void printUnknownFields(int indent, AST node, String... knownFields) {

        List<String> knownNames = new ArrayList<>(Arrays.asList(knownFields));
        knownNames.addAll(List.of("start", "end"));

        // Extraer todos las variables de instancia de la clase (propios o derivados)
        List<java.lang.reflect.Field> allFields = new ArrayList<>();
        Class<?> currentClass = node.getClass();
        while (currentClass != null && currentClass != Object.class) {
            java.util.Collections.addAll(allFields, currentClass.getDeclaredFields());
            currentClass = currentClass.getSuperclass();
        }

        // Imprimir el 'toString' de aquellas que no se hayan impreso ya y no sean static
        for (java.lang.reflect.Field field : allFields) {
            if ((!knownNames.contains(field.getName()))
                    && (!java.lang.reflect.Modifier.isStatic(field.getModifiers()))) {
                field.setAccessible(true);
                Object value;
                try {
                    value = field.get(node);
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    value = "!!Error accesing value by introspection";
                }
                printToString(indent, "unknown-field", field.getName(), field.getType().getSimpleName(), value);
            }
        }
    }

    //$ -------------------------------------------------------------------------------------
    // Métodos auxiliares usados por los métodos anteriores

    // Imprime el 'toString()' del value que se le pase
    private void printToString(int indent, String cssClass, String name, String type, Object value) {

        if (type.equals("String"))
            type = "string"; // Queda mejor en minúsculas

        String typeText = escapedSpan(TYPE_CLASS, "  " + type);

        // No imprimir el tipo del miembro si es un AST y su valor es del mismo tipo (es decir, el
        // valor no es un tipo derivado y, por tanto, son iguales). Dicho tipo ya aparecerá en el
        // toString() del nodo.
        if (value instanceof AST && type.equals(value.getClass().getSimpleName()))
            typeText = "";

        writeDivWithTabs(indent, span(cssClass, name) + " = " + valueSpan(value) + typeText);
    }

    private void writeDiv(String text) {
        writer.println("<div>" + text + "</div>");
    }

    private void writeDivWithTabs(int indent, String text) {
        writeDiv(getTabuladores(indent) + text);
    }

    private String getTabuladores(int count) {
        var cadena = new StringBuilder();
        for (int i = 0; i < count; i++)
            cadena.append((i % 2 == 0 ? '|' : '.') + tabulator);
        return span(TABS_CLASS, cadena.toString());
    }

    private static String span(String cssClass, String text) {
        return "<span class=\"" + cssClass + "\">" + text + "</span>";
    }

    private static String escapedSpan(String cssClass, String text) {
        return span(cssClass, text.replace("<", "&lt;").replace(">", "&gt;"));
    }

    private static String valueSpan(Object value) {
        final int MAX_LENGTH = 46;

        if (value == null)
            return span(NULL_CLASS, "null");

        String text = value.toString();
        if (text.length() > MAX_LENGTH)
            text = text.substring(0, MAX_LENGTH) + "...";
        if (value instanceof String)
            text = '"' + text + '"';
        return escapedSpan(VALUE_CLASS, text);
    }

    // -----------------------------------------------------------------
    // Métodos para mostrar las Posiciones

    private String getAlignedSourceText(int indent, int textLength, AST node) {

        final int width = 75;

        int neededSpaces = width - (indent * tabSize) - textLength;
        var spaces = new StringBuilder();
        for (int i = 0; i < neededSpaces / 2; i++)
            spaces.append(" .");
        if (neededSpaces % 2 == 1)
            spaces.append(" ");

        return span(DOTS_CLASS, spaces.toString()) + getSourceText(node);
    }

    private String getSourceText(AST node) {

        String text = "[" + node.start() + " " + node.end() + "]";

        final int PADDING_LENGTH = 14;
        String paddedText = (text.length() < PADDING_LENGTH)
                ? text + "&nbsp;".repeat(PADDING_LENGTH - text.length())
                : text;

        text = span(POS_CLASS, paddedText);
        text = text.replace("null", "<span class=\"" + NULL_CLASS + "\">null</span>");
        String sourceText = findSourceText(node);
        if (sourceText != null)
            text = text + sourceText;
        return text;
    }


    private boolean isValidPosition(Position position) {
        return position != null && position.getLine() > 0 && position.getColumn() > 0;
    }

    private String findSourceText(AST node) {
        if (sourceLines.isEmpty())
            return null;

        Position start = node.start();
        Position end = node.end();

        var validPositions = isValidPosition(start) && isValidPosition(end) && start.lessThan(end);
        if (!validPositions)
            return null;

        // Single line source text
        if (start.getLine() == end.getLine()) {
            String line = sourceLines.get(start.getLine() - 1);

            var firstCharPosition = start.getColumn() - 1;
            var nextCharPosition = end.getColumn() - 1;

            var beforeText = line.substring(0, firstCharPosition);
            var text = line.substring(firstCharPosition, nextCharPosition);
            var afterText = line.substring(nextCharPosition);

            return span(SOURCE_TEXT_CLASS,
                    escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, beforeText.stripLeading())
                            + escapedSpan(NODE_SOURCE_TEXT_CLASS, text)
                            + escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, afterText.stripTrailing()));
        }

        // Multiline source text
        String firstLine = sourceLines.get(start.getLine() - 1);
        var firstCharPosition = start.getColumn() - 1;
        var beforeText = firstLine.substring(0, firstCharPosition);
        var firstLineText = firstLine.substring(firstCharPosition);

        String lastLine = sourceLines.get(end.getLine() - 1);
        var nextCharPosition = end.getColumn() - 1;
        var lastLineText = lastLine.substring(0, nextCharPosition);
        var afterText = lastLine.substring(nextCharPosition);

        return span(SOURCE_TEXT_CLASS,
                escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, beforeText.stripLeading())
                        + escapedSpan(NODE_SOURCE_TEXT_CLASS, firstLineText.stripTrailing())
                        + span(OMITTED_SOURCE_TEXT_CLASS, " &bull;&bull;&bull; ")
                        + escapedSpan(NODE_SOURCE_TEXT_CLASS, lastLineText.stripLeading())
                        + escapedSpan(NON_NODE_SOURCE_TEXT_CLASS, afterText.stripTrailing()));
    }

    private static List<String> loadLines(String sourceFile) {
        if (sourceFile == null)
            return java.util.Collections.emptyList();

        var lines = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = br.readLine()) != null)
                lines.add(line);

        } catch (FileNotFoundException e) {
            System.out.println("Warning. No se pudo encontrar el fichero fuente '" + sourceFile
                    + "'. No se mostrará información de posición.");
        } catch (IOException e) {
            System.out.println("Warning. Error al leer del fichero fuente '" + sourceFile
                    + "'. No se mostrará información de posición.");
        }
        return lines;
    }

    //$ -------------------------------------------------------------------------------------
    // Texto literal

    private static final String HEADER = """
            <html>
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>AstPrinter</title>
                <style type="text/css">
                    .vgen-body {
                        font-family: monospace;
                        color: #404040;
                    }
                    .vgen-div {
                        white-space: pre;
                    }
                    .vgen-tabs {
                        color: #96c0d9;
                    }
                    .vgen-child-name {
                        color: #2A5873;
                    }
                    .vgen-attribute-phase-0 {
                        color: #04ab04ff;
                    }
                    .vgen-attribute-phase-1 {
                        color: #ab0479ff;
                    }
                    .vgen-attribute-phase-2 {
                        color: #abab04ff;
                    }
                    .vgen-unknown-field {
                        color: grey;
                    }
                    .vgen-type {
                        color: #A7CADF;
                    }
                    .vgen-value {
                        color: #D6630E;
                    }
                    .vgen-dots {
                        color: #7BB0CF;
                    }
                    .vgen-pos {
                        color: #7BB0CF;
                    }
                    .vgen-nonNodeSourceText {
                    }
                    .vgen-nodeSourceText {
                        background-color: #d7f9d6;
                        border-radius: 4px;
                        padding-left: 3px;
                        padding-right: 3px;
                    }
                    .vgen-omittedSourceText {
                        color: #a6f2a4ff;
                    }
                    .vgen-null {
                        color: white;
                        background-color: #c7655b;
                        border-radius: 7px;
                        padding-left: 4px;
                        padding-right: 4px;
                    }
                </style>
            </head>
            <body>
            """;

    private static final String FOOTER = """

            </body>
            </html>
            """;

    //$ -----------------------------------------------------------------
    // Variables de instancia

    private List<String> sourceLines;
    private static String ls = System.getProperty("line.separator");
    private PrintWriter writer;

    private String tabulator;
    private int tabSize;


}
