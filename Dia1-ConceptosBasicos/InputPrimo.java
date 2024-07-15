import java.util.Scanner; // import the Scanner class 

class InputPrimo {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n;
    
    // Inserta un número para verificar si es primo o no
    System.out.println("Inserta un número para verificar si es primo o no"); 
    n = myObj.nextInt();   
    int divisor=2;
    int primo=0;
    int prueba=0;
    
    while (n==divisor) {
        prueba = n%divisor;
        if(prueba==0){
            primo=primo+1;
        }
        divisor=divisor+1;
    }
    if (primo==0) {
        System.out.println(n+" no es primo");
    } else 
        System.out.println(n+" si es primo");        
  }
}
