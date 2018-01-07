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

public class MonopolyBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonopolyBoard window = new MonopolyBoard();
					window.frame.setVisible(true);
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
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
	
		
		JLabel lblSdfdsfdssfd = new JLabel();
		lblSdfdsfdssfd.setText("sdfdsfdssfd");
		 lblSdfdsfdssfd.setBounds(50, 50,950,946);
		
		ImageIcon bigicon=new ImageIcon(MonopolyBoard.class.getResource("/resource/monopoly-board-web.jpg"));
		Image bigpic=bigicon.getImage();
		Image newpic=bigpic.getScaledInstance(lblSdfdsfdssfd.getWidth(), lblSdfdsfdssfd.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledicon=new ImageIcon(newpic);
		 frame.getContentPane().setLayout(null);
	
		 frame.getContentPane().add(lblSdfdsfdssfd);
		 frame.getContentPane().add(lblSdfdsfdssfd);
	 lblSdfdsfdssfd.setIcon(scaledicon);

	
	}
}
