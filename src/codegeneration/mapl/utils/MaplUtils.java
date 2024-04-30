package codegeneration.mapl.utils;

import ast.type.Type;
import ast.type.VoidType;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ast.FieldDefinition;
import ast.VarDefinition;
import ast.type.ArrayType;
import ast.type.CharType; 
import ast.type.DoubleType;
import ast.type.IntType;
import ast.type.StructType;

public class MaplUtils {

    public static final Set<String> castInstructions = new HashSet<String>(Set.of("I2F", "F2I", "I2B", "B2I"));
    public static final Map<String, String> MAP_TRANSLATION;

    static {
        MAP_TRANSLATION = Map.ofEntries(
            Map.entry("+", "ADD"), 
            Map.entry("-", "SUB"), 
            Map.entry("*", "MUL"), 
            Map.entry("/", "DIV"),
            Map.entry("mod", "MOD"),
            Map.entry("=", "EQ"),
            Map.entry("<>", "NE"),
            Map.entry("<", "LT"),
            Map.entry("<=", "LE"),
            Map.entry(">", "GT"),
            Map.entry(">=", "GE"),
            Map.entry("and", "AND"),
            Map.entry("or", "OR"),
            Map.entry("not", "NOT")
        );
    }

    /**
     * Devuelve el sufijo de una operación para un tipo concreto
     * 
     * @param type es el tipo del que se desea saber el sufijo
     * @return retorna una cadena con el sufijo correspondeinte al tipo
     */
    public static String maplSuffix(Type t) {
        return switch (t) {
            case IntType i -> "I";
            case DoubleType f -> "F";
            case CharType c -> "B";
            default -> throw new IllegalArgumentException("Unrecognized type");
        };
    }


    /**
     * Devuelve el tamaño en bytes de un tipo
     * @param t tipo
     * @return tamaño en bytes
     */
    public static int maplTypeSize(Type t) {
        return switch (t) {
            case IntType i -> 2;
            case DoubleType f -> 4;
            case CharType c -> 1;
            case StructType s -> getStructSize(s);
            case ArrayType a -> Integer.valueOf(a.getDimension().getValue()) * maplTypeSize(a.getTipo());
            case VoidType v -> 0;
            default -> throw new IllegalArgumentException("Unrecognized type");
        };
    }


    /**
     * Devuelve el tamaño de una estructura
     * @param t tipo de la estructura
     * @return tamaño de la estructura
     */
    private static int getStructSize(StructType t) {
        int size = 0;
        List<FieldDefinition> fields = t.getDefinition().getFields();
        for (FieldDefinition f : fields) {
            size += maplTypeSize(f.getTipo());
        }
        return size;
    }
    
    /**
     * Devuelve el tipo equivalente para la máquina MAPL
     * 
     * @param t es el tipo de entrada
     * @return retorna una String con el nombre de dicho tipo para la máquian MAPL
     */
    public static String maplType(Type type) {
        return switch (type) {
            case IntType i -> "int";
            case DoubleType f -> "float";
            case CharType c -> "char";
            case StructType s -> s.getName();
            case ArrayType a -> a.getDimension().getValue() + " * " + maplType(a.getTipo());
            case VoidType v -> "void";
            default -> throw new IllegalArgumentException("Unrecognized type");
        };
    }

    /**
     * Convierte un operador del código fuente en el equivalente para la máquina
     * MAPL
     * 
     * @param sourceOperator es una cadena con el operador de código fuente
     * @param type           es el tipo de la operación que se realiza
     * @return retorna una cadena con el operador adaptado al tipo esperado
     */
    public static String maplOperator(String sourceOperator, Type type) {
        return (MAP_TRANSLATION.get(sourceOperator) + maplSuffix(type));
    }

    /**
     * Convierte un operador del código fuente en el equivalente para la máquina
     * MAPL
     * 
     * @param sourceOperator es una cadena con el operador de código fuente
     * @param type           es el tipo de la operación que se realiza
     * @return retorna una cadena con el operador adaptado al tipo esperado
     */
    public static String maplOperator(String sourceOperator) {
        return (MAP_TRANSLATION.get(sourceOperator));
    }


    /**
     * Devuelve el tamaño total de un conjunto de variables
     * 
     * @param vars es una lista con las definiciones de las variables
     * @return retorna un entero con el tamaño total de las variables
     */
    public static int getVarsSize(List<VarDefinition> vars) {
        int size = 0;
        for (VarDefinition var : vars) {
            size += maplTypeSize(var.getTipo());
        }
        return size;
    }

    public static int getFieldOffset(StructType struct, String field) {
        int offset = 0;
        for (FieldDefinition f : struct.getDefinition().getFields()) {
            if (f.getName().equals(field)) {
                return offset;
            }
            offset += maplTypeSize(f.getTipo());
        }
        throw new IllegalArgumentException("Error calculando el offset de: " + field);
    }

    /**
     * Devuelve una etiqueta formateada con un contador.
     *
     * @param labelName El nombre base de la etiqueta.
     * @param count     El valor del contador a formatear.
     * @return La etiqueta completa con el contador formateado.
     */
    public static String formatLabel(String labelName, int count) {
        return labelName + String.format("%04d", count);
    }
    
}
