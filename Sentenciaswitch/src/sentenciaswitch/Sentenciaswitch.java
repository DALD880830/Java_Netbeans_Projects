package sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author alex_
 */
public class Sentenciaswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion entre 1-5"));
        
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null, "Elegiste la opcion 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Elegiste la opcion 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Elegiste la opcion 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "Elegiste la opcion 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Elegiste la opcion 5");
            break;
            default: JOptionPane.showMessageDialog(null, "Ese numero no esta dentro de las opciones");
        }
        
    }
    
}
