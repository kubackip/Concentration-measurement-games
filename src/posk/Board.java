/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

/**
 *
 * @author Przemek
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Board extends JPanel implements ActionListener {

    /**
     * zmienna informująca czy gra się rozpoczęła
     */
    int gra = 0;
    /**
     * czas rozpoczęcia nowej gry
     */

    double czas1;
    double czasstop1;
    double czas2;
    double czasstop2;
//        double czas3;
//        double czasstop3;
    static double LiczCzas1;
    static double LiczCzas2;
//        static double LiczCzas3;
    static double LiczCzas10 = 99.99;
    static double LiczCzas11 = 99.99;

    public static Timer timer;

    private final Mapa m;
    private final JPanel[][] mapa;

    public Board() {

        setBounds(0, 0, 544, 544);
        m = new Mapa();

        timer = new Timer(25, this);
        /**
         * konstruktor mapy gry
         *
         * @param x ilość kafelkow mapy w poziomie
         * @param y ilość kafelków mapy w pionie
         */
        mapa = new JPanel[17][17];
        GridLayout lejaut = new GridLayout(17, 17);
        lejaut.setVgap(-5);
        this.setLayout(lejaut);

        for (int y = 0; y < 17; y++) {

            for (int x = 0; x < 17; x++) {

                if (m.getMapa(x, y).equals("t")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getTrawa());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new TrawaListener());

                }
                if (m.getMapa(x, y).equals("s")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getSciana());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new ScianaListener());

                }
                if (m.getMapa(x, y).equals("p")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getPoczatek1());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new Poczatek1Listener());

                }
                if (m.getMapa(x, y).equals("k")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getKoniec());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new KoniecListener());

                }
                if (m.getMapa(x, y).equals("b")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getKoniec2());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new Koniec2Listener());

                }
                if (m.getMapa(x, y).equals("a")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getPoczatek2());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new Poczatek2Listener());

                }
//                        if(m.getMapa(x,y).equals("b"))
//                        {
//                            mapa[x][y] = new JPanel();
//                            JLabel pic = new JLabel(m.getPoczatek3());
//                            mapa[x][y].add(pic);
//                            mapa[x][y].addMouseListener(new Poczatek3Listener());
//                          
//                        }
                if (m.getMapa(x, y).equals("m")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getPoczatektest());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new PoczatektestListener());

                }
                if (m.getMapa(x, y).equals("g")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getPoczatek2test());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new Poczatek2testListener());

                }
                if (m.getMapa(x, y).equals("n")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getKoniectest());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new KoniectestListener());

                }
                if (m.getMapa(x, y).equals("v")) {
                    mapa[x][y] = new JPanel();
                    JLabel pic = new JLabel(m.getKoniec2test());
                    mapa[x][y].add(pic);
                    mapa[x][y].addMouseListener(new Koniec2testListener());

                }

                //qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
                /**
                 * uzupełnienie mapy obrazkami
                 */
                this.add(mapa[x][y]);
                repaint();
            }
        }
    }

    /**
     * Funkcja odtwarzania dźwięku z pliku
     *
     * @param f - obiekt klasy File reprezentujący ścieżkę do pliku wave
     */
    public static synchronized void playSound(final File f) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }//playSound()

    /**
     * klasa implementująca klasę MouseListener
     */
    class TrawaListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {
            if (gra == 1 && gra == 2) {
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    /**
     * klasa implementująca klasę MouseListener, sprawdza czy gracza najechał
     * myszką na pole sciany labiryntu, jeśli tak, przerywa grę i informuje
     * gracza o popełnionym błędzie
     */
    class ScianaListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {
            if (gra == 1) {

                playSound(new File("dzwieki//linia.wav"));
                new Blad();
                gra = 0;
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    /**
     * klasa implementująca klasę MouseListener, rozpoczyna grę (gra =1) po
     * naciśnięciu myszy przez gracza w polu startu gry
     */
    class Poczatek1Listener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
//                new Instrukcja1();
            gra = 1;
            czas1 = System.currentTimeMillis();
            System.out.println("Licz czas 1:" + LiczCzas1);
            System.out.println("Licz czas 10:" + LiczCzas10);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    class Poczatek2Listener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                gra = 2;
                Thread.sleep((long) (Math.random() * 8500));
                playSound(new File("dzwieki/carton1.wav"));
                Thread.sleep((long) (Math.random() * 8500));
                playSound(new File("dzwieki/carton2.wav"));
                Thread.sleep((long) (Math.random() * 9500));
                playSound(new File("dzwieki/bells1.wav"));
                czas2 = System.currentTimeMillis();
            } catch (InterruptedException ex) {
                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

//            class Poczatek3Listener implements MouseListener{
//            @Override
//            public void mouseEntered(MouseEvent e)
//            {
//                
//            }
//            @Override
//            public void mouseExited(MouseEvent e){
//                
//            }
//            @Override
//            public void mouseReleased(MouseEvent e){
//                
//            }
//            @Override
//            public void mousePressed(MouseEvent e){
//                gra = 1;
////                czasStart = System.currentTimeMillis();
////                new Zadanie();
//                
//            }
//            @Override
//            public void mouseClicked(MouseEvent e)
//            {
//                
//            }
//        }
    class PoczatektestListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            gra = 1;

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    class Poczatek2testListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                gra = 2;
                Thread.sleep(1318);
                playSound(new File("dzwieki/carton1.wav"));
                Thread.sleep(2547);
                playSound(new File("dzwieki/carton2.wav"));
                Thread.sleep(2410);
                playSound(new File("dzwieki/bells1.wav"));
            } catch (InterruptedException ex) {
                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    /**
     * klasa implementująca klasę MouseListener, po bezbłędnym przebyciu
     * labiryntu i naciśnięciu myszy w polu mety, informuje gracza o poprawnym
     * przejsciu poziomu oraz oblicza i podaje czas, w któym pokonany został
     * dany poziom gry
     */
    //kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
    class KoniecListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            while (gra == 1) {
                czasstop1 = System.currentTimeMillis();
                LiczCzas1 = (czasstop1 - czas1) / 1000;

                if (LiczCzas1 < LiczCzas10) {
                    LiczCzas10 = LiczCzas1;
                    System.out.println("Czas: " + LiczCzas1 + "sek.");

                    System.out.println("Licz czas 1:" + LiczCzas1);
                    System.out.println("Licz czas 10:" + LiczCzas10);
                    gra = 0;
                    playSound(new File("dzwieki//meta.wav"));
                    Brawo brawo = new Brawo();

                } else if (LiczCzas1 > LiczCzas10) {
                    gra = 0;
                    playSound(new File("dzwieki//meta.wav"));
                    new NieUdaloSie();

                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    class KoniectestListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (gra == 1) {
                gra = 0;
                playSound(new File("dzwieki//meta.wav"));
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    class Koniec2testListener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (gra == 2) {
                gra = 0;
                playSound(new File("dzwieki//meta.wav"));
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    class Koniec2Listener implements MouseListener {

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
//                if(gra==2){
//                czasstop2 = System.currentTimeMillis();
//                LiczCzas2 = (czasstop2 - czas2)/1000;
//                System.out.println("Czas: " + LiczCzas2 +"sek.");
//                gra =0;
//                    Brawo2 brawo2 = new Brawo2();
//                }

            {
                while (gra == 2) {
                    czasstop2 = System.currentTimeMillis();
                    LiczCzas2 = (czasstop2 - czas2) / 1000;

                    if (LiczCzas2 < LiczCzas11) {
                        LiczCzas11 = LiczCzas2;
                        System.out.println("Czas: " + LiczCzas2 + "sek.");

                        gra = 0;
                        Brawo2 brawo2 = new Brawo2();

                    } else if (LiczCzas2 > LiczCzas11) {
                        gra = 0;
                        new NieUdaloSie2();

                    }
                }
            }

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
