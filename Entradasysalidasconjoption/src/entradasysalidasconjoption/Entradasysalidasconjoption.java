/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasysalidasconjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author alex_
 */
public class Entradasysalidasconjoption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        char letra;
        int numero;
        double decimal;
        
        frase = JOptionPane.showInputDialog("Escribe una frase: ");
        letra = JOptionPane.showInputDialog("Escribe una letra: ").charAt(0);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "La frase es: "+frase);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+numero);
        JOptionPane.showMessageDialog(null, "La numero decimal es: "+decimal);
        
    }
    
}
