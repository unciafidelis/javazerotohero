
```java
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
```

### Explicación

1. **byte unByte = 127;**
   - **byte**: Tipo de dato entero de 8 bits.
   - **Rango**: -128 a 127.
   
2. **short unShort = 32000;**
   - **short**: Tipo de dato entero de 16 bits.
   - **Rango**: -32,768 a 32,767.
   
3. **int unInt = 2147483647;**
   - **int**: Tipo de dato entero de 32 bits.
   - **Rango**: -2,147,483,648 a 2,147,483,647.
   
4. **long unLong = 9223372036854775807L;**
   - **long**: Tipo de dato entero de 64 bits.
   - **Rango**: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
   - **L**: Sufijo para indicar que es un tipo `long`.

5. **float unFloat = 3.14f;**
   - **float**: Tipo de dato de punto flotante de precisión simple (32 bits).
   - **f**: Sufijo para indicar que es un tipo `float`.
   
6. **double unDouble = 3.14159;**
   - **double**: Tipo de dato de punto flotante de precisión doble (64 bits).

7. **char unChar = 'A';**
   - **char**: Tipo de dato de carácter de 16 bits que representa un solo carácter Unicode.

8. **boolean unBoolean = true;**
   - **boolean**: Tipo de dato lógico que puede ser `true` o `false`.

9. **String unaCadena = "Hola Mundo";**
   - **String**: Clase que representa una cadena de caracteres.

10. **int[] unArray = {1, 2, 3};**
    - **int[]**: Declaración de un array de enteros.

### Impresión de valores

El programa también imprime los valores de cada variable para verificar su contenido. 
