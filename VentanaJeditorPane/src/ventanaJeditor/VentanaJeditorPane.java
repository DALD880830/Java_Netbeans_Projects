
package ventanaJeditor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaJeditorPane extends JFrame implements ActionListener{
    JButton boton1, boton2, boton3, boton4, boton5;
    JPanel panel;
    JEditorPane editor;
    
    public VentanaJeditorPane(){
        this.setSize(600, 500);
        this.setTitle("Unidad 5 Actividad Complementaria 2");
        this.setLocationRelativeTo(null);
        colocarAditamentos();
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void colocarAditamentos(){
        panel = new JPanel();
        
        this.getContentPane().add(panel);
        
        editor = new JEditorPane();
        editor.setSize(550, 10);
        panel.add(editor);
        
                
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();
        boton1.setText("Copiar");
        boton2.setText("Pegar");
        boton3.setText("Color de letra Azul");
        boton4.setText("Cursiva");
        boton5.setText("Color de letra Negro");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
           
        if (evento.getSource() == boton1){
            editor.copy();
                     }
        if (evento.getSource() == boton2){
            editor.paste();
         }
        if (evento.getSource() == boton3){
            editor.setForeground(Color.blue);
         }
        if (evento.getSource() == boton4){
            editor.setFont(new Font("",Font.ITALIC,12));
         }
        if (evento.getSource() == boton5){
            editor.setForeground(Color.black);
         }

    }
}
