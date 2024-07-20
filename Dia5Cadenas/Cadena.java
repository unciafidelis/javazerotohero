package Dia5Cadenas;
import java.util.Scanner;
public class Cadena {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        String cadenaAComparar="",cadenaMayor=""; //Proceso
        int numCadena,realizaComparacion=0; //Proceso
        Scanner xy=new Scanner(System.in); // Entrada pero no se pone
        System.out.println("Número de cadenas a comparar: "); // salida
        numCadena=xy.nextInt(); // Entrada si se pone
        for (int i=1;i<=numCadena;i++){ //Ciclo for van los 3 datos
            System.out.println("Inserta la cadena número "+i); // Salida
            cadenaAComparar=xy.next(); // Entrada si se pone
            realizaComparacion=cadenaAComparar.compareTo(cadenaMayor); // Proceso
            if(realizaComparacion>0) // If va la comparación dentro de la decisión
                cadenaMayor=cadenaAComparar; // Proceso
        }
        System.out.print("La cadena Mayor es igual a "+cadenaMayor); // Salida

    }  
}
