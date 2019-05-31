/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Przemek
 */
public class Zad3 extends JDialog {
    
    private JLabel tekst;
    private JButton ok;
//    private JButton odp1;
    
    public Zad3(){
        setTitle("Instrukcja 1");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(700,500);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst = new JLabel("<html>Oblicz zadanie: 30/3+3*2.</html>");
        tekst.setBounds(260,50,400,250);
        ok = new JButton("OK");
        ok.setBounds(300, 300, 100, 100);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1,1,1,1));
        ok.addActionListener(new OK ());

               
        add(ok);
        add(tekst);
        
        setVisible(true);
        
        
    }
    
    public class OK implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {        
            dispose();
        }
       
    }
}