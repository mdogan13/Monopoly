package gui;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;



public class MonopolyBoard {

	private JFrame mainFrame;
	private BoardGrid grid;
	
	JPanel gamePanel;
	JPanel controlPanel;
	JPanel playersPanel;
	
	static JLabel cardInfoLabel ;
	
	//tokenlist here!
	
	public MonopolyBoard(ImageIcon[] tokenSelections, ArrayList<String> playerNames) {
		initialize();
		
		for (int i = 0; i <GameSetupScreen.getNumberOfPlayers(); i++) {
			PlayerGUI g = new PlayerGUI(playerNames.get(i));
			URL path;
			try {
				path = new URL(tokenSelections[i].getDescription());
				grid.createAndSetLabelSizedIcon(g.playerIconlbl, path);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
			playersPanel.add(g);
			
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

		controlPanel = new JPanel();
		controlPanel.setBounds(962, 0, 695, 946);
		controlPanel.setBackground(Color.DARK_GRAY);

		gamePanel = new JPanel();
		gamePanel.setBackground(Color.BLACK);
		gamePanel.setBounds(12, 13, 1658, 947);
		mainFrame.getContentPane().add(gamePanel);
		gamePanel.setLayout(null);
		gamePanel.add(boardLabel);
		gamePanel.add(controlPanel);
		controlPanel.setLayout(null);
		
		playersPanel = new JPanel();
		playersPanel.setBounds(12, 13, 671, 394);
		controlPanel.add(playersPanel);
		playersPanel.setBackground(Color.DARK_GRAY);
		playersPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		cardInfoLabel = new JLabel();
		cardInfoLabel.setBounds(27, 654, 250, 279);
		controlPanel.add(cardInfoLabel);
		grid.createAndSetLabelSizedIcon(cardInfoLabel, MonopolyBoard.class.getResource("/resource/placeholder.png"));
		
		JPanel rollPanel = new JPanel();
		rollPanel.setBounds(12, 443, 304, 186);
		controlPanel.add(rollPanel);
		rollPanel.setLayout(null);
		
		JButton rollButton = new JButton("Roll");
		rollButton.setFont(new Font("KabinLightDB", Font.PLAIN, 24));
		rollButton.setBounds(79, 112, 139, 48);
		rollPanel.add(rollButton);
		
		JLabel turnLabel = new JLabel("Player X's Turn");
		turnLabel.setFont(new Font("KabinLightDB", Font.PLAIN, 22));
		turnLabel.setBounds(12, 29, 139, 28);
		rollPanel.add(turnLabel);
		
		JLabel diceValLabel = new JLabel("Dice Values:");
		diceValLabel.setFont(new Font("KabinLightDB", Font.PLAIN, 22));
		diceValLabel.setBounds(12, 71, 249, 28);
		rollPanel.add(diceValLabel);
		
		JPanel actionsPanel = new JPanel();
		actionsPanel.setBounds(377, 443, 306, 186);
		controlPanel.add(actionsPanel);
		
		JPanel buildingsPanel = new JPanel();
		buildingsPanel.setBounds(377, 674, 306, 259);
		controlPanel.add(buildingsPanel);
		
		

	}
}
