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
public class nodo <T> {
    private T elemento;
    private nodo izquierda, derecha;
    
    public nodo(T elemento){
        this.elemento = elemento;
    }
    
    public nodo insertar(nodo n, T elemento){
        if (n == null)
            return new nodo(elemento);
        else if(elemento.hashCode() < n.elemento.hashCode())
            n.izquierda = insertar(n.izquierda, elemento);
        else if(elemento.hashCode() > n.elemento.hashCode())
            n.derecha = insertar(n.derecha, elemento);
        return n;
    }
    
    public int nodosCompletos(nodo n){
        if (n==null)
            return 0;
        else{
            if (n.izquierda != null && n.derecha != null)
                return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha) +1;
            return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha);
        }
    }

    public T getElemento() {
        return elemento;
    }

    public nodo getIzquierda() {
        return izquierda;
    }

    public nodo getDerecha() {
        return derecha;
    }
}
