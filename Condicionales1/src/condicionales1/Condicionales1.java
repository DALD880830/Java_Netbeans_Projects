package condicionales1;

import javax.swing.JOptionPane;

/**
 *
 * @author alex_
 */
public class Condicionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
    }
    }
    
}
