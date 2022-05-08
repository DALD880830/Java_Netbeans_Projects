
package metro;

import java.util.Scanner;

public class Cajera extends Empleado{
    
    String estacionAtendida;
    Scanner entrada1 = new Scanner(System.in);
        
    
    public void datosCajera(){
        System.out.print("Estacion que atiende la cajera: ");
        estacionAtendida = entrada1.nextLine();
    }
    
    public void cajeraEstacion(){
        System.out.println("La cajera atiende la estacion: "+estacionAtendida);
    }
    
}
