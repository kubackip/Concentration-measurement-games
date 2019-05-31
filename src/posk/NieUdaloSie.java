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
public class NieUdaloSie extends JDialog {
    
    private JLabel tekst;
    private JButton ok;
//    private JButton odp1;
    
    public NieUdaloSie(){
        setTitle("Nie Udało Się!!");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(370,260);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst = new JLabel("<html>Niestety! Nie udało się Tobie pobić najlepszego czasu! Spróbuj jeszcze raz! Twój uzyskany czas to: "+Board.LiczCzas1+". Czas jaki należy pobić to: "+Board.LiczCzas10+".</html>");
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