package domain;

import java.awt.EventQueue;

import domain.squares.Square;
 
import domain.squares.propertysquares.TitleDeed;

import gui.GameSetupScreen;


public class Test {
	public static void main(String[] args) {
		
		Square s =new TitleDeed("dsf",  0, new int[] {1,2,2,2,3,4}, 1, 1,1);
	System.out.println(	 ((TitleDeed) s).isMortgaged());
	System.out.println( ((TitleDeed) s).getBuyPrice());
	TitleDeed a= new TitleDeed("dsf",  0, new int[] {1,2,2,2,3,4}, 1, 1,1);
	
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("deprecation")
			public void run() {
				try {
					
					GameSetupScreen s=new GameSetupScreen();
					s.show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
}
