
package ecuacioncuadratica;

import java.util.Scanner;

public class EcuacionCuadratica {

    int a=0;
    int b=0;
    int c=0;
    Scanner entradaA = new Scanner(System.in);

    
    public EcuacionCuadratica(){
        System.out.print("Ingresa el valor de a: ");
        a = entradaA.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = entradaA.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c = entradaA.nextInt();
        
        double determinante = Math.pow(b, 2)-(4*a*c);
        
        if (determinante>0){
            double x1 = ((b*(-1)) + Math.sqrt(determinante))/(2*a);
            double x2 = ((b*(-1)) - Math.sqrt(determinante))/(2*a);
            System.out.println(" ");
            System.out.println("El valor de x1 es: " +x1);
            System.out.println("El valor de x2 es: " +x2);
        }
        else {
            System.out.println("El determinante es negativo, no se puede completar la operacion");
        }
    }
    
    public static void main(String[] args) {
         
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica();
        
    }
    
}
