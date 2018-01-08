package domain;

import java.awt.EventQueue;

import gui.GameSetupScreen;


public class Test {
	public static void main(String[] args) {
		
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
