/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informaticacincopoo;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Empleado {
    
    Scanner entrada1 = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
    
    String nombreEmpleado;
    int numeroEmpleado;
    
 
public void leerDatos(){
    
    System.out.print("Dame el nombre del empleado: ");
        nombreEmpleado = entrada1.nextLine();
     System.out.print("Dame el numero del empleado: ");
        numeroEmpleado = entrada2.nextInt();
    
}   
    
public void verDatos(){
    
    System.out.println("\nEl nombre del empleado es: "+nombreEmpleado);
    System.out.println("El numero del empleado es: "+numeroEmpleado);
    
}    
    
}
