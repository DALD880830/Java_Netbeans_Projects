
package metro;
import java.util.Scanner;

public class Empleado {

    protected String nombreEmpleado;
    protected int numeroEmpleado;
    protected String rfc;
    protected float salario;
    
    Scanner entradaA = new Scanner(System.in);
    Scanner entradaB = new Scanner(System.in);
    Scanner entradaC = new Scanner(System.in);
    Scanner entradaD = new Scanner(System.in);
    
    
    public void pedirDatos(){
        System.out.print("Nombre de empleado: ");
        nombreEmpleado = entradaA.nextLine();
        
        System.out.print("Numero del empleado: ");
        numeroEmpleado = entradaB.nextInt();
        
        System.out.print("RFC del empleado: ");
        rfc = entradaC.nextLine();
        
        System.out.print("Salario del empleado: ");
        salario = entradaD.nextFloat();
    }
    
    public void mostrarDatos(){
        System.out.println("Empleado: "+nombreEmpleado);
        System.out.println("# Empleado: "+numeroEmpleado);
        System.out.println("RFC del empleado: "+rfc);
        System.out.println("Salario del empleado: "+salario);
    }
    
}
