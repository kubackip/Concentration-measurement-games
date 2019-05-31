/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Blad extends JDialog{ 
       
    private JLabel tekst2;
    private JButton ok;
    
    public Blad(){
        setTitle("Błąd!");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(370,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
       
        tekst2= new JLabel("<html>Nie udało Ci się. Spróbuj jeszcze raz. </html>");
        tekst2.setBounds(10,10,300,200);
        
        ok = new JButton("No Okej...");
        ok.setBounds(160, 180, 70, 30);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1,1,1,1));
        ok.addActionListener(new OK ());
               

        add(ok);
        add(tekst2);
        setVisible(true);
        
    }
    
     public class OK implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
        
            dispose();
        }
       
    }
}