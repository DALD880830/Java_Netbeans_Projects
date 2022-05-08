package ClaseEmpleado;

import java.util.Scanner;


public class Main {
    
    String nombreEmpleado;
    int numeroEmpleado;

    
public void leerDatos(){
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Dame el nombre del empleado: ");
         nombreEmpleado = entrada.nextLine();
    System.out.print("Dame el numero de empleado: ");
         numeroEmpleado = entrada.nextInt();
         
}

public void verDatos (){
    System.out.println("El nombre del empleado es: "+nombreEmpleado);
    System.out.println("El nombre del empleado es: "+numeroEmpleado);
}
}