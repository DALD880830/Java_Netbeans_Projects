package ciclos;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int i=1, a=0, c, d, contador, contador2, contador3;
         
         System.out.print("Dame los numeros que necesitas: ");
         contador = entrada.nextInt();
         
         while(i<=contador){
             System.out.println(i);
             i++;
         }
         
         System.out.print("Dame los numeros que necesitas: ");
         contador2 = entrada.nextInt();
         
         do{
             System.out.println(contador2);
             contador2--;
         }while(contador2>=a);
         
         System.out.print("Dame los numeros que necesitas: ");
         contador3 = entrada.nextInt();
         
         for(c=1; c<=contador3; c++){
             System.out.println(c);
         }
         System.out.println("     ");
         for(d=contador3; d>=0; d--){
             System.out.println(d);
         }
    }
    
}
