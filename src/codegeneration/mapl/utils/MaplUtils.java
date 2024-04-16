package codegeneration.mapl.utils;

import ast.type.Type;

import java.util.List;

import ast.FieldDefinition;
import ast.type.ArrayType;
import ast.type.CharType; 
import ast.type.DoubleType;
import ast.type.IntType;
import ast.type.StructType;

public class MaplUtils {

    /**
     * Devuelve el sufijo utilizado en mapl de un tipo
     * @param t tipo
     * @return string sufijo
     */
    public static String getSuffix(Type t) {
        return switch (t) {
            case IntType i -> "i";
            case DoubleType f -> "f";
            case CharType c -> "c";
            default -> throw new IllegalArgumentException("Unrecognized type");
        };
    }


    /**
     * Devuelve el tamaño en bytes de un tipo
     * @param t tipo
     * @return tamaño en bytes
     */
    public static int getTypeSize(Type t) {
        return switch (t) {
            case IntType i -> 2;
            case DoubleType f -> 4;
            case CharType c -> 1;
            case StructType s -> getStructSize(s);
            case ArrayType a -> Integer.valueOf(a.getDimension().getValue()) * getTypeSize(a.getTipo());
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
            size += getTypeSize(f.getTipo());
        }
        return size;
    }
    
}
