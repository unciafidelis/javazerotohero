### Diagrama de Flujo

1. Inicio
2. Importar la clase Scanner
3. Definir la clase `InputPrimo`
4. Definir el método `main`
5. Crear un objeto `Scanner` para leer la entrada del usuario
6. Declarar la variable `n`
7. Imprimir "Inserta un número para verificar si es primo o no"
8. Leer el número ingresado por el usuario y almacenarlo en `n`
9. Inicializar `divisor` a 2
10. Inicializar `esPrimo` a `true`
11. ¿`divisor` es menor o igual a `n / 2`?
    - Sí: Continuar al paso 12
    - No: Saltar al paso 17
12. ¿`n % divisor` es igual a 0?
    - Sí: Establecer `esPrimo` a `false` y romper el bucle
    - No: Incrementar `divisor` en 1
13. Repetir desde el paso 11
14. ¿`esPrimo` es `true`?
    - Sí: Imprimir "n es primo"
    - No: Imprimir "n no es primo"
15. Fin

### Pseudocódigo

```
INICIO
IMPORTAR java.util.Scanner

DEFINIR clase InputPrimo
    DEFINIR método main
        CREAR objeto Scanner myObj
        DECLARAR entero n
        
        IMPRIMIR "Inserta un número para verificar si es primo o no"
        LEER n desde la entrada del usuario
        
        DECLARAR entero divisor = 2
        DECLARAR booleano esPrimo = true
        
        MIENTRAS divisor <= n / 2 HACER
            SI n % divisor == 0 ENTONCES
                esPrimo = false
                ROMPER bucle
            FIN SI
            INCREMENTAR divisor en 1
        FIN MIENTRAS
        
        SI esPrimo ENTONCES
            IMPRIMIR n + " es primo"
        SI NO
            IMPRIMIR n + " no es primo"
        FIN SI
    FIN método main
FIN clase InputPrimo
FIN
```