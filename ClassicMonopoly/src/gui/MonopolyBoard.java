package gui;

import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;


public class MonopolyBoard {

	private JFrame mainFrame;
	private BoardGrid grid;
	
	//tokenlist here!
	
	public MonopolyBoard(ImageIcon[] tokenSelections) {
		initialize();
		
		for (int i = 0; i <GameSetupScreen.getNumberOfPlayers(); i++) {
			PlayerToken t= new PlayerToken(tokenSelections[i]);
			t.gridPosition=0;
			grid.squarePanels[0].add(t.tokenContainer);
		}
	}

	
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Monopoly");
		mainFrame.getContentPane().setBackground(Color.BLACK);
		mainFrame.setBounds(100, 100, 1699, 1020);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

		JLabel boardLabel = new JLabel();
		boardLabel.setBounds(0, 0, 950, 946);

		ImageIcon bigicon = new ImageIcon(MonopolyBoard.class.getResource("/resource/monopoly-board-web.jpg"));
		Image bigpic = bigicon.getImage();
		Image newpic = bigpic.getScaledInstance(boardLabel.getWidth(), boardLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledicon = new ImageIcon(newpic);
		mainFrame.getContentPane().setLayout(null);

		grid = new BoardGrid();
		grid.setLocation(12, 13);
		mainFrame.getContentPane().add(grid);

		boardLabel.setIcon(scaledicon);

		JPanel controlPanel = new JPanel();
		controlPanel.setBounds(962, 0, 695, 946);
		controlPanel.setBackground(Color.DARK_GRAY);

		JPanel gamePanel = new JPanel();
		gamePanel.setBackground(Color.BLACK);
		gamePanel.setBounds(12, 13, 1658, 947);
		mainFrame.getContentPane().add(gamePanel);
		gamePanel.setLayout(null);
		gamePanel.add(boardLabel);
		gamePanel.add(controlPanel);
		controlPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 671, 394);
		controlPanel.add(panel);

	}
}
