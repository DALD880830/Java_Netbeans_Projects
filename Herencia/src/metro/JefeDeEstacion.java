
package metro;

import java.util.Scanner;

public class JefeDeEstacion extends Empleado {
    
    String estacionEncargada;
    Scanner entrada3 = new Scanner(System.in);
        
    
    public void datosJefeDeEstacion(){
       
        System.out.print("Nombre de la estación del Jefe de estacion: ");
        estacionEncargada = entrada3.nextLine();
        
    }
    
    public void jefeEstacion(){
        System.out.println("El Jefe de estacion está encargado de la estacion: "+estacionEncargada);
    }
    
}
