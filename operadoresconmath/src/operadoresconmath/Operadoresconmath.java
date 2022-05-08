/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresconmath;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Operadoresconmath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Dame una base");
        double base = entrada1.nextDouble();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Dame una base");
        double exponente = entrada2.nextDouble();
        System.out.println(" ");
        
        double raiz = Math.sqrt(19);
        int raiz2 = (int) Math.sqrt(81);
        double potencia = Math.pow(base, exponente);
        long redondear = Math.round(4.56789);
        float redondear2 = Math.round(9.81f);
        double aleatorio = Math.random();
        
        System.out.println("El resultado de la potencia es: "+potencia);
        System.out.println("Raiz de 19 con decimales: "+raiz);
        System.out.println("Raiz entera de 81 en: "+raiz2);
        System.out.println("Redondeando el numero 4.56789 queda en: "+redondear);
        System.out.println("Redondeando el numero 9.81 queda en: "+redondear2);
        System.out.println("Numero aleatorio: "+aleatorio);
        
    }
    
}
