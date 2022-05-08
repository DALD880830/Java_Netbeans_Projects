
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener{
    JButton boton1, boton2;
    JPanel panel;
    JLabel etiqueta, etiqueta2, etiqueta3;
    
    public Ventana(){
        this.setSize(400, 100);
        this.setTitle("Unidad 5 Actividad Complementaria 1");
        this.setLocationRelativeTo(null);
        colocarAditamentos();
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void colocarAditamentos(){
        panel = new JPanel();
        
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel();
        etiqueta.setText("Hola, como te encuentras el día de hoy?");
        panel.add(etiqueta);
        
                
        boton1 = new JButton();
        boton2 = new JButton();
        boton1.setText("Bien");
        boton2.setText("Mal");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
           
        if (evento.getSource() == boton1){
            JOptionPane.showMessageDialog(null, "Excelente, espero sigas de maravilla");
            
         }
        if (evento.getSource() == boton2){
            JOptionPane.showMessageDialog(null, "Que mal, espero mejores pronto");
         }

}
    }
    

