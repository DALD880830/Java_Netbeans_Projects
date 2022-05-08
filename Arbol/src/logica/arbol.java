/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author alex_
 * @param <T>
 */
public class arbol <T> {
    private nodo raiz;
            
    public void insertar (T elemento){
        if (raiz == null)
            raiz = new nodo(elemento);
        else
            raiz = raiz.insertar(raiz, elemento);
    }

    public nodo getRaiz() {
        return raiz;
    }
}
