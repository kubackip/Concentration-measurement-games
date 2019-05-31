/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Brawo extends JDialog {
    
    private JLabel tekst;
    private JButton ok;
//    private JButton odp1;
    
    public Brawo(){
        setTitle("Poziom ukończony!");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(370,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst = new JLabel("<html>Brawo! Twój czas to : "+Board.LiczCzas1+" sekund.</html>");
        tekst.setBounds(10,10,300,200);
        ok = new JButton("OK");
        ok.setBounds(160, 180, 50, 30);
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
