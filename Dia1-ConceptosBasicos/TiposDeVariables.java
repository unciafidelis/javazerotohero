public class TiposDeVariables {
    public static void main(String[] args) {
        // Variables primitivas
        byte unByte = 127;             // Rango: -128 a 127
        short unShort = 32000;         // Rango: -32,768 a 32,767
        int unInt = 2147483647;        // Rango: -2,147,483,648 a 2,147,483,647
        long unLong = 9223372036854775807L; // Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float unFloat = 3.14f;         // Precisión simple, 32 bits, sufijo 'f' para indicar que es float
        double unDouble = 3.14159;     // Precisión doble, 64 bits
        char unChar = 'A';             // Un solo carácter Unicode
        boolean unBoolean = true;      // Valor verdadero o falso

        // Variables de referencia
        String unaCadena = "Hola Mundo"; // Cadena de caracteres
        int[] unArray = {1, 2, 3};       // Array de enteros

        // Imprimir valores
        System.out.println("byte: " + unByte);
        System.out.println("short: " + unShort);
        System.out.println("int: " + unInt);
        System.out.println("long: " + unLong);
        System.out.println("float: " + unFloat);
        System.out.println("double: " + unDouble);
        System.out.println("char: " + unChar);
        System.out.println("boolean: " + unBoolean);
        System.out.println("String: " + unaCadena);
        System.out.println("Array: " + java.util.Arrays.toString(unArray));
    }
}
