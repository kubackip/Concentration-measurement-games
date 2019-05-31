/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import javax.swing.JFrame;

/**
 *
 * @author Przemek
 */
public class POSK {

    public static void main(String[] args) {
        new POSK();
    }

    /**
     * Konstruktor klasy Labirynt Utworzenie okna gry i dodanie do niego panelu
     * z mapą gry oraz panelu z Menu gry
     */
    public POSK() {
        JFrame f = new JFrame();
        f.setTitle("Projekt POSK");
        f.setSize(760, 580);
        f.add(new Board());
        f.add(new Menu());
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board.timer.start();
    }
}
