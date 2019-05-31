/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Zadanie extends JDialog 
{
    
    private JLabel tekst;
    private JButton ok,odp1,odp2,odp3,odp4,odp5,odp6,losujtest;
    public int numerZadania;
    double czas4;
    double czasstop4;
    static double LiczCzas4 = 99;
    static double LiczCzas12 = 100;
    int losuj;
    
    public Zadanie(){
        new Instrukcja3();
        setTitle("Zadanie");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(700,500);
        setModal(true);
        setLocationRelativeTo(null);
        setResizable(false);
      
        
        
        tekst = new JLabel("<html>Oblicz zadanie</html>");
        tekst.setBounds(315,0,400,50);
        
        ok = new JButton("Losuj");
        ok.setBounds(350, 400, 50, 50);
        ok.setFocusable(false);
        ok.setMargin(new Insets(1,1,1,1));
        ok.addActionListener(new Losuj ());
        
        losujtest = new JButton("Losuj Test");
        losujtest.setBounds(200, 400, 100, 50);
        losujtest.setFocusable(false);
        losujtest.setMargin(new Insets(1,1,1,1));
        losujtest.addActionListener(new LosujTest ());
        
        odp1 = new JButton("10");
        odp1.setBounds(200, 100, 50, 50);
        odp1.setFocusable(false);
        odp1.setMargin(new Insets(1,1,1,1));
        odp1.addActionListener(new odp1 ());
        
        odp2 = new JButton("8");
        odp2.setBounds(200, 200, 50, 50);
        odp2.setFocusable(false);
        odp2.setMargin(new Insets(1,1,1,1));
        odp2.addActionListener(new odp2 ());
        
        odp3 = new JButton("16");
        odp3.setBounds(200, 300, 50, 50);
        odp3.setFocusable(false);
        odp3.setMargin(new Insets(1,1,1,1));
        odp3.addActionListener(new odp3 ());
        
        odp4 = new JButton("13");
        odp4.setBounds(500, 100, 50, 50);
        odp4.setFocusable(false);
        odp4.setMargin(new Insets(1,1,1,1));
        odp4.addActionListener(new odp4 ());
        
        odp5 = new JButton("1");
        odp5.setBounds(500, 200, 50, 50);
        odp5.setFocusable(false);
        odp5.setMargin(new Insets(1,1,1,1));
        odp5.addActionListener(new odp5 ());
        
        odp6 = new JButton("21");
        odp6.setBounds(500, 300, 50, 50);
        odp6.setFocusable(false);
        odp6.setMargin(new Insets(1,1,1,1));
        odp6.addActionListener(new odp6 ());

               
        add(ok);
        add(tekst);
        add(odp1);
        add(odp2);
        add(odp3);
        add(odp4);
        add(odp5);
        add(odp6);
        add(losujtest);
        setVisible(true);
        
        
    }

    
    public class Losuj implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {        
        losuj = 0;        
        Random rand = new Random();
        numerZadania = rand.nextInt(6);
        czas4 = System.currentTimeMillis();
                        System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
        switch(numerZadania)
        {
                    case 0:
//                       
                        break;
                    
                    case 1:
//                        
                        break;
                    
                    case 2:
//                        
                       
                        break;
                        
                    case 3:
//                        
                        
                        break;
                        
                    case 4:
//                        
                    
                        break;
                        
                    case 5:
//                        
                    
                        break;
                    default:
                        
        }
            switch (numerZadania) {
                case 0:
                    System.out.println("Oblicz zadanie: 6*3-10+2");
                    new Zad1();
                    break;
                case 1:
                    System.out.println("Oblicz zadanie: (-5+7)^3");
                    new Zad2();
                    break;
                case 2:
                    System.out.println("Oblicz zadanie: 30/3+3*2");
                    new Zad3();
                    break;
                case 3:
                    System.out.println("Oblicz zadanie: 2*3*4-(6-(-5))");
                    new Zad4();
                    break;
                case 4:
                    System.out.println("Oblicz zadanie: (5*6+6)/36");
                    new Zad5();
                    break;
                case 5:
                    System.out.println("Oblicz zadanie: ((9-2)-4)^3");
                    new Zad6();
                    break;
                default:
                    break;
            }

        }
  
    }
    
    public class odp1 implements ActionListener{
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            if(numerZadania==0 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=0 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==0 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=0 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
        }
       
    }
    public class odp2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
           
            if(numerZadania==1 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=1 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==1 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=1 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
        }
       
    }
    public class odp3 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {            
            if(numerZadania==2 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=2 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==2 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=2 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
        }
       
    }
    public class odp4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
             if(numerZadania==3 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=3 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==3 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=3 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
            
        }
       
    }
    public class odp5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {            
            if(numerZadania==4 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=4 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==4 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=4 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
        }
       
    }
    public class odp6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {            
            if(numerZadania==5 && losuj==0)   
            {
            czasstop4 = System.currentTimeMillis();                
            LiczCzas4 = (czasstop4 - czas4)/1000;
            
            System.out.println("Czas 4: " + LiczCzas4 +"sek.");
            System.out.println("Czas 12: " + LiczCzas12 +"sek.");
            
            if(LiczCzas4 <= LiczCzas12 )
            {
                System.out.println("Dobra odpowiedź!");
                LiczCzas12 = LiczCzas4;

                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                new Brawo3();
            }
            else if(LiczCzas4 > LiczCzas12)
            {
                new NieUdaloSie3();
                                System.out.println("Czas 4: " + LiczCzas4 +"sek.");
                System.out.println("Czas 12: " + LiczCzas12 +"sek.");
                
            }
            }            
            
            if(numerZadania!=5 && losuj==0)
            {
                
                System.out.println("Błędna odpowiedź...");
                new Blad();
                dispose();
            }
            else if(numerZadania==5 && losuj==1)
            {
                new Brawo3();
            }
            else if(numerZadania!=5 && losuj==1)
            {
                System.out.println("Błędna odpowiedź...");
                new Blad();dispose();
            }
        }
       
    }
    
    public class LosujTest implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {        
        losuj = 1;        
        Random rand = new Random();
        numerZadania = rand.nextInt(6);
                    
        switch(numerZadania)
        {
                    case 0:
//                       
                        break;
                    
                    case 1:
//                        
                        break;
                    
                    case 2:
//                       
                       break;
                        
                    case 3:                        
//                        
                        break;
                        
                    case 4:
//                        
                    
                        break;
                        
                    case 5:
//                        
                    
                        break;
                    default:
                        
        }
            switch (numerZadania) {
                case 0:
                    System.out.println("Oblicz zadanie: 6*3-10+2");
                    new Zad1();
                    break;
                case 1:
                    System.out.println("Oblicz zadanie: (-5+7)^3");
                    new Zad2();
                    break;
                case 2:
                    System.out.println("Oblicz zadanie: 30/3+3*2");
                    new Zad3();
                    break;
                case 3:
                    System.out.println("Oblicz zadanie: 2*3*4-(6-(-5))");
                    new Zad4();
                    break;
                case 4:
                    System.out.println("Oblicz zadanie: (5*6+6)/36");
                    new Zad5();
                    break;
                case 5:
                    System.out.println("Oblicz zadanie: ((9-2)-4)^3");
                    new Zad6();
                    break;
                default:
                    break;
            }

        }
  
    }
}
