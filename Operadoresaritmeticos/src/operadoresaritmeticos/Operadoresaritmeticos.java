/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Operadoresaritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2, suma, resta, multi, div, residuo;
        
        System.out.println("Dame 2 numero para las diferentes operaciones: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        div = numero1 / numero2;
        residuo = numero1 % numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+div);
        System.out.println("El residuo es: "+residuo);
        
        
    }
    
}
