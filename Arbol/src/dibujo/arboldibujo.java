/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import javax.swing.JFrame;
import logica.arbol;

/**
 *
 * @author alex_
 */
public class arboldibujo {
    
    public static void main(String[] args) {
        
       arbol objetoArbol = new arbol();
       dibujo objetoDibujo = new dibujo();
       controlador objetoControlador = new controlador(objetoDibujo, objetoArbol);
       
       objetoArbol.insertar(8);
       objetoArbol.insertar(7);
       objetoArbol.insertar(13);
       objetoArbol.insertar(2);
       objetoArbol.insertar(9);
       objetoArbol.insertar(0);
       objetoArbol.insertar(10);
       objetoArbol.insertar(6);
       objetoArbol.insertar(14);
       objetoArbol.insertar(1);
       objetoArbol.insertar(3);
       objetoArbol.insertar(12);
       objetoArbol.insertar(5);
       objetoArbol.insertar(11);
       objetoArbol.insertar(4);
       objetoArbol.insertar(15);
       objetoControlador.iniciar();
       
       JFrame ventana = new JFrame();
       ventana.getContentPane().add(objetoDibujo);
       ventana.setDefaultCloseOperation(3);
       ventana.setSize(590, 420);
       ventana.setVisible(true);
       
    }
    
}
