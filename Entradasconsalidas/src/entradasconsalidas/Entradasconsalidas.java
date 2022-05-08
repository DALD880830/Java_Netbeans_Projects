/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasconsalidas;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Entradasconsalidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada1 = new Scanner(System.in);
       Scanner entrada2 = new Scanner (System.in);
       Scanner entrada3 = new Scanner (System.in);
       Scanner entrada4 = new Scanner (System.in);
       
        int numero;
        float decimal;
        double decimallargo;
        String frase;
        char letra;
             
        System.out.print("Dame un numero: ");
        numero = entrada1.nextInt();
        
        System.out.print("Dame un decimal: ");
        decimal = entrada2.nextFloat();
        
        System.out.print("Dame un numero decimal grande: ");
        decimallargo = entrada3.nextDouble();
        
        System.out.print("Escribe una frase: ");
        frase = entrada4.nextLine();
        
        System.out.println("Escribe una letra: ");
        letra = entrada4.next().charAt(0);
                
        System.out.println("El numero entero es: "+numero);
        System.out.println("El numero deimal chico es: "+decimal);
        System.out.println("El numero decimal largo es: "+decimallargo);
        System.out.println("La frase es: "+frase);
        System.out.println("La letra es: "+letra);
        
    }
    
}
