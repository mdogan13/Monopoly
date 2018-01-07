package gui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;

public class MonopolyBoard {

	private JFrame mainFrame;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonopolyBoard window = new MonopolyBoard();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonopolyBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the mainFrame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(Color.BLACK);
		mainFrame.setBounds(100, 100, 1699, 1080);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel boardLabel = new JLabel();
		boardLabel.setBounds(0, 0, 950, 946);

		ImageIcon bigicon = new ImageIcon(MonopolyBoard.class.getResource("/resource/monopoly-board-web.jpg"));
		Image bigpic = bigicon.getImage();
		Image newpic = bigpic.getScaledInstance(boardLabel.getWidth(), boardLabel.getHeight(),
				Image.SCALE_SMOOTH);
		ImageIcon scaledicon = new ImageIcon(newpic);
		mainFrame.getContentPane().setLayout(null);

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
		panel.setBounds(-10009, -10038, 1681, 1033);
		mainFrame.getContentPane().add(panel);
	}
}
