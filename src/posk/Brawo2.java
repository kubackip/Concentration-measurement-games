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


public class Brawo2 extends JDialog {
    
    private JLabel tekst2;
    private JButton ok;
//    private JButton odp1;
    
    public Brawo2(){
        setTitle("Poziom ukończony!");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(370,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst2 = new JLabel("<html>Brawo! Twój czas to : "+Board.LiczCzas2+" sekund.</html>");
        tekst2.setBounds(10,10,300,200);
        ok = new JButton("OK");
        ok.setBounds(160, 180, 50, 30);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1,1,1,1));
        ok.addActionListener(new OK ());

               
        add(ok);
        add(tekst2);
        
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