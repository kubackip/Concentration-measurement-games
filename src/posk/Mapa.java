/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posk;

import java.util.*;
import java.io.*;
import javax.swing.ImageIcon;


public class Mapa {
	private static Scanner m;
	private final String Mapa[] = new String[17]; //TUTAJ
	private ImageIcon trawa, sciana, poczatek1, poczatek2, poczatek3, poczatek4, koniec, koniec2, koniectest, poczatektest, poczatek2test,koniec2test; ;
	
        
        static int poziom =1;
        
	public Mapa(){
		
		trawa = new ImageIcon("obrazy//trawa.png");
		sciana = new ImageIcon("obrazy//sciana.png");
                poczatek1 = new ImageIcon("obrazy//poczatek1.png");
                poczatek2 = new ImageIcon("obrazy//poczatek2.png");
                poczatek3 = new ImageIcon("obrazy//poczatek3.png");
                poczatek4 = new ImageIcon("obrazy//poczatek4.png");
                koniec = new ImageIcon("obrazy//koniec.png");
                koniec2 = new ImageIcon("obrazy//koniec2.png");
                koniectest = new ImageIcon("obrazy//koniectest.png");
                poczatektest = new ImageIcon("obrazy//poczatektest.png");
		koniec2test = new ImageIcon("obrazy//koniectest.png");
                poczatek2test = new ImageIcon("obrazy//poczatektest.png");
                
		openFile();
		readFile();
		closeFile();
	}
	
	public ImageIcon getTrawa(){
		return trawa;
	}
	public ImageIcon getSciana(){
		return sciana;
                
	}
        public ImageIcon getPoczatek1(){
		return poczatek1;
        }
        public ImageIcon getPoczatek2(){
		return poczatek2;
        }
        public ImageIcon getPoczatek3(){
		return poczatek3;
        }
        public ImageIcon getKoniec(){
		return koniec;       
        }
        public ImageIcon getKoniec2(){
		return koniec2;       
        }
        public ImageIcon getKoniectest(){
		return koniectest;       
        }
        public ImageIcon getPoczatektest(){
		return poczatektest;       
        }
        public ImageIcon getKoniec2test(){
		return koniectest;       
        }
        public ImageIcon getPoczatek2test(){
		return poczatektest;       
        }
        
	public String getMapa(int x, int y){
		String index = Mapa[y].substring(x, x+1);
		return index;
	}
	
	public static void openFile(){
		try
                {
                    if(poziom==1){
			m = new Scanner(new File("obrazy//mapa1.txt"));
                        new Instrukcja1();
                    }
                    if(poziom==2){
			m = new Scanner(new File("obrazy//mapa2.txt"));
                        new Instrukcja2();
                    }
//                    if(poziom==3){
//			new Instrukcja3();
//                    }                                       
                                   
		}
                catch(Exception e){
			System.out.println("Blad wczytywania mapy " + e.toString());
		}
	}
	
	public void readFile(){
		while (m.hasNext()){
			for(int i=0; i<17; i++){
                            
				Mapa[i] = m.next();
			}
		}
	}
	
	public void closeFile(){
		m.close();
	}
}

