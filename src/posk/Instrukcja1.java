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

/**
 * Klasa dziedzicząca po klasie JDialog,
 * tworzy okno informujące gracza o poprawnie przebytym poziomie oraz czasie jaki uzyskał
 * @author Justyna
 */
public class Instrukcja1 extends JDialog {
    
    private JLabel tekst;
    private JButton ok;
//    private JButton odp1;
    
    public Instrukcja1(){
        setTitle("Instrukcja 1");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(700,500);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tekst = new JLabel("<html>Instruckja testu 1: Zadaniem użytkownika jest poprowadzenie kursora myszy przez białe pole w jak najkrótszym czasie. Aby to zrobić, należy kliknąć na pomarańczowe pole. Od tego momentu nalicza się czas. Aby zakończyć należy kliknąć w błękitne pole. Jeżeli gracz najedzie kursorem na białe pole to musi zacząć od początku.         Aby przeprowadzić test gracz klika w pole oznaczone żółtym znakiem X. Czas nie będzie wtedy naliczany.</html>");
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