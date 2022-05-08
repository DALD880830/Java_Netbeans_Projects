/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import logica.arbol;

/**
 *
 * @author alex_
 */
public class controlador {
    private dibujo objetoDibujo;
    private arbol objetoArbol;
    
    public controlador(dibujo objetoDibujo, arbol objetoArbol){
        this.objetoDibujo = objetoDibujo;
        this.objetoArbol = objetoArbol;
    }
    
    public void iniciar(){
        objetoDibujo.setObjetoArbol(objetoArbol);
    }
}
