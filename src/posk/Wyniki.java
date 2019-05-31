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

public class Wyniki extends JDialog {

    private JLabel tekst;
    private JLabel tekst2;
    private JLabel tekst3;

    private JButton ok;
//    private JButton odp1;

    public Wyniki() {
        setTitle("Wyniki");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(700, 500);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);

        tekst = new JLabel("<html>Czas z testu nr. 1: " + Board.LiczCzas10 + " sekund.</html>");
        tekst.setBounds(10, 10, 300, 200);

        tekst2 = new JLabel("<html>Czas z testu nr. 2: " + Board.LiczCzas11 + " sekund.</html>");
        tekst2.setBounds(10, 30, 300, 200);

        tekst3 = new JLabel("<html>Czas z testu nr. 3: " + Zadanie.LiczCzas12 + " sekund.</html>");
        tekst3.setBounds(10, 50, 300, 200);
        ok = new JButton("OK");
        ok.setBounds(300, 300, 100, 100);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1, 1, 1, 1));
        ok.addActionListener(new OK());

        add(ok);
        add(tekst);
        add(tekst2);
        add(tekst3);
        setVisible(true);

    }

    public class OK implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }
}
