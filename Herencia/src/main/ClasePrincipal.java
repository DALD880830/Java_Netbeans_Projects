
package main;

import metro.Cajera;
import metro.Conductor;
import metro.JefeDeEstacion;

public class ClasePrincipal {
    
    public static void main(String[] args){
        
        Cajera isa = new Cajera();
        
        isa.pedirDatos();
        isa.datosCajera();
        System.out.println(" ");
        isa.mostrarDatos();
        isa.cajeraEstacion();
        System.out.println(" ");
        
        Conductor ale = new Conductor();
        ale.pedirDatos();
        ale.datosConductor();
        System.out.println(" ");
        ale.mostrarDatos();
        ale.conductorUnidad();
        System.out.println(" ");
        
        JefeDeEstacion dan = new JefeDeEstacion();
        dan.pedirDatos();
        dan.datosJefeDeEstacion();
        System.out.println(" ");
        dan.mostrarDatos();
        dan.jefeEstacion();
        System.out.println(" ");
    }
    
}
