
package encuesta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class encuesta extends JFrame implements ActionListener{
    JButton boton1;
    JLabel etiqueta, nombre, especialidad;
    JPanel panel;
    JTextField cajaDeTexto;
    JRadioButton radioboton1, radioboton2, radioboton3;
    ButtonGroup grupoRadioBotones;
    
    public encuesta(){
        this.setSize(400, 200);
        this.setTitle("Unidad 5 Actividad Complementaria 3");
        this.setLocationRelativeTo(null);
        colocarAditamentos();
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void colocarAditamentos(){
        panel = new JPanel();
        
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel();
        etiqueta.setText("Ingresa tu nombre:");
        panel.add(etiqueta);
        
        cajaDeTexto = new JTextField();
        cajaDeTexto.setText("   Ingresa aquí tu nombre completo   ");
        cajaDeTexto.setSize(350, 10);
        panel.add(cajaDeTexto);
        
        radioboton1 = new JRadioButton("Programación",false);
        panel.add(radioboton1);
        radioboton2 = new JRadioButton("Administración",false);
        panel.add(radioboton2);
        radioboton3 = new JRadioButton("Informática",false);
        panel.add(radioboton3);
        
        grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioboton1);
        grupoRadioBotones.add(radioboton2);
        grupoRadioBotones.add(radioboton3);
        
        boton1 = new JButton();
        boton1.setText("Terminar");
        boton1.addActionListener(this);
        panel.add(boton1);
        
        nombre = new JLabel();
        panel.add(nombre);
        especialidad = new JLabel();
        panel.add(especialidad);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
           
        if (evento.getSource() == boton1){
            nombre.setText("Nombre del usuario: "+cajaDeTexto.getText());
            if (radioboton1.isSelected())
                especialidad.setText("La especialidad del Usuario es Programación");
            if (radioboton2.isSelected())
                especialidad.setText("La especialidad del Usuario es Administración");
            if (radioboton3.isSelected())
                especialidad.setText("La especialidad del Usuario es Informática");
            }
        
    }
}