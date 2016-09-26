package cajero;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Emmanuel Oropeza
 */
public class Cajerin extends JFrame {

    JPanel panelNumeros, panelOperaciones;
    JTextField pantalla;

    public Cajerin() {
        super();
        setSize(500, 300);
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        JButton btn = new JButton();
        btn.setForeground(Color.RED);
        setLayout(null);
        btn = new JButton("retirar");
        btn.setBounds(100, 150, 100, 30);
        add(btn);

        btn.setForeground(Color.RED);
        setLayout(null);
        btn = new JButton("abonar");
        btn.setBounds(200, 150, 100, 30);
        add(btn);

        btn.setForeground(Color.RED);
        setLayout(null);
        btn = new JButton("Crear cuenta");
        btn.setBounds(300, 150, 100, 30);
        add(btn);
    }
    
   public void abono()
   {
      
   }
   
   public void retiro(){
       
   }
}
