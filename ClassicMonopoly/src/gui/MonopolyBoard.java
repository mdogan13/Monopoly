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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.ScrollPane;
import java.awt.TextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTextArea;



public class MonopolyBoard {

	private JFrame mainFrame;
	static BoardGrid grid;
	GUIController guicontroller;
	
	JPanel gamePanel;
	JPanel controlPanel;
	JPanel playersPanel;
	
	static JButton rollButton;
	static JLabel diceValLabel;
	static JLabel turnLabel; 
	
	static JButton btnEndTurn;
	
	static JLabel cardInfoLabel ;
	

	static ArrayList<PlayerToken> tokenList=new ArrayList<PlayerToken>();
	private JButton btnUnmortgage;
	private JLabel gameLogTitleLabel;
	
	
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
			tokenList.add(t);
			t.gridPosition=0;
			grid.squarePanels[0].add(t.tokenContainer);
			
		}
		
		guicontroller=new GUIController();
	
		
	
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
		cardInfoLabel.setBounds(45, 640, 250, 279);
		controlPanel.add(cardInfoLabel);
		grid.createAndSetLabelSizedIcon(cardInfoLabel, MonopolyBoard.class.getResource("/resource/placeholder.png"));
		
		JPanel rollPanel = new JPanel();
		rollPanel.setBounds(12, 420, 306, 186);
		controlPanel.add(rollPanel);
		rollPanel.setLayout(null);
		
		rollButton = new JButton("Roll");
		rollButton.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		rollButton.setBounds(78, 129, 139, 48);
		rollPanel.add(rollButton);
		
		turnLabel = new JLabel("Player X's Turn");
		turnLabel.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		turnLabel.setBounds(12, 29, 139, 28);
		rollPanel.add(turnLabel);
		
		diceValLabel = new JLabel("Dice Values:");
		diceValLabel.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		diceValLabel.setBounds(12, 75, 249, 28);
		rollPanel.add(diceValLabel);
		
		JPanel actionsPanel = new JPanel();
		actionsPanel.setBounds(349, 420, 334, 186);
		controlPanel.add(actionsPanel);
		actionsPanel.setLayout(null);
		
		btnEndTurn = new JButton("End Turn");
		MonopolyBoard.btnEndTurn.setEnabled(false);
		btnEndTurn.setBounds(171, 132, 151, 41);
		btnEndTurn.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		actionsPanel.add(btnEndTurn);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setEnabled(false);
		btnBuy.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		btnBuy.setBounds(12, 13, 151, 41);
		actionsPanel.add(btnBuy);
		
		JButton btnSell = new JButton("Sell...");
		btnSell.setEnabled(false);
		btnSell.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		btnSell.setBounds(171, 13, 151, 41);
		actionsPanel.add(btnSell);
		
		JButton btnBuild = new JButton("Build...");
		btnBuild.setEnabled(false);
		btnBuild.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		btnBuild.setBounds(12, 132, 151, 41);
		actionsPanel.add(btnBuild);
		
		JButton btnMortgage = new JButton("Mortgage...");
		btnMortgage.setEnabled(false);
		btnMortgage.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		btnMortgage.setBounds(12, 73, 151, 41);
		actionsPanel.add(btnMortgage);
		
		btnUnmortgage = new JButton("Unmortgage...");
		btnUnmortgage.setFont(new Font("KabinLightDB", Font.BOLD, 24));
		btnUnmortgage.setEnabled(false);
		btnUnmortgage.setBounds(171, 73, 151, 41);
		actionsPanel.add(btnUnmortgage);
		
		JPanel gameLogPanel = new JPanel();
		gameLogPanel.setBounds(349, 619, 334, 314);
		controlPanel.add(gameLogPanel);
		gameLogPanel.setLayout(null);
		
		gameLogTitleLabel = new JLabel("Game Log");
		gameLogTitleLabel.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		gameLogTitleLabel.setBounds(12, 13, 139, 28);
		gameLogPanel.add(gameLogTitleLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("KabinLightDB", Font.PLAIN, 22));
		textArea.setLineWrap(true);
		textArea.append("The game has started. \n");
		textArea.append("sec");
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(12, 47, 312, 257);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		gameLogPanel.add(scrollPane);
		
	
		

		

		
		

	}
}
