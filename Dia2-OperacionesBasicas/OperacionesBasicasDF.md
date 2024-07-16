### Ejemplo 1: Suma de dos números

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a + b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class Suma {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println("Suma: " + c);
    }
}
```

### Ejemplo 2: Resta de dos números

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a - b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class Resta {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = a - b;
        System.out.println("Resta: " + c);
    }
}
```

### Ejemplo 3: Multiplicación de dos números

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a * b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class Multiplicacion {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int c = a * b;
        System.out.println("Multiplicación: " + c);
    }
}
```

### Ejemplo 4: División de dos números

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a / b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class Division {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int c = a / b;
        System.out.println("División: " + c);
    }
}
```

### Ejemplo 5: Módulo de dos números

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a % b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class Modulo {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        int c = a % b;
        System.out.println("Módulo: " + c);
    }
}
```

### Ejemplo 6: Incremento de una variable

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a
  |
  v
a = a + 1
  |
  v
Imprimir a
  |
  v
 Fin
```

**Código**
```java
public class Incremento {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println("Incremento: " + a);
    }
}
```

### Ejemplo 7: Decremento de una variable

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a
  |
  v
a = a - 1
  |
  v
Imprimir a
  |
  v
 Fin
```

**Código**
```java
public class Decremento {
    public static void main(String[] args) {
        int a = 5;
        a--;
        System.out.println("Decremento: " + a);
    }
}
```

### Ejemplo 8: Operación combinada

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b, c, d
  |
  v
resultado = (a + b) * c - d
  |
  v
Imprimir resultado
  |
  v
 Fin
```

**Código**
```java
public class OperacionCombinada {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 4;
        int resultado = (a + b) * c - d / 2;
        System.out.println("Operación combinada: " + resultado);
    }
}
```

### Ejemplo 9: Operación con variables

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
resultado = a * b + (a - b)
  |
  v
Imprimir resultado
  |
  v
 Fin
```

**Código**
```java
public class OperacionConVariables {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int resultado = a * b + (a - b);
        System.out.println("Operación con variables: " + resultado);
    }
}
```

### Ejemplo 10: División de punto flotante

**Diagrama de Flujo**
```
Inicio
  |
  v
Leer a, b
  |
  v
c = a / b
  |
  v
Imprimir c
  |
  v
 Fin
```

**Código**
```java
public class DivisionFlotante {
    public static void main(String[] args) {
        double a = 7.0;
        double b = 2.0;
        double c = a / b;
        System.out.println("División de punto flotante: " + c);
    }
}
```