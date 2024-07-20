import java.util.Scanner;
public class SeguirDiagrama{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner nObj=new Scanner(System.in);
        int n=0,divisor=2;
        boolean esPrimo = true;
        System.out.println("Inserte número");
        n=nObj.nextInt();
        while(divisor==n/2){       
            if(n%divisor==0){
                esPrimo=false;
            }
            divisor++;
        }
        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}