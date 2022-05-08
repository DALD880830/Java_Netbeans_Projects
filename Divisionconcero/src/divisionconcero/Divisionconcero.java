
package divisionconcero;

import java.util.Scanner;


public class Divisionconcero {

   
    public static void main(String[] args) {
        
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        int numerador = 0;
        int denominador = 0;
        double division=0;
        
        do{
            try{
               System.out.print("Coloca el numerador: ");
                numerador = entrada1.nextInt();
               System.out.print("Coloca el denominador: ");
                denominador= entrada2.nextInt();
                division=numerador/denominador;
                System.out.print("El resultado de la division es: "+division);

            }catch(ArithmeticException e){
                division=0;
                System.out.print("ERROR: "+e.getMessage());
                System.out.print("\nPrueba de nuevo");
                System.out.print("\n");
            }
        }while(denominador==0);
        System.out.print("\n");
    }
    
}
