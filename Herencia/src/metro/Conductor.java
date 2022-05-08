
package metro;

import java.util.Scanner;

public class Conductor extends Empleado{
    
    int unidadManejada;
    Scanner entrada2 = new Scanner(System.in);
        
    
    public void datosConductor(){
        System.out.print("Numero de unidad que maneja el conductor: ");
        unidadManejada = entrada2.nextInt();
    }
    
    public void conductorUnidad(){
        System.out.println("El conductor maneja la unidad: "+unidadManejada);
    }
    
}
