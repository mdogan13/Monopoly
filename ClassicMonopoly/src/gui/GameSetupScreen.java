package gui;

import java.awt.BorderLayout;
 

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.GameController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class GameSetupScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();

	JComboBox<String> playerNumCombobox;
	static int numberOfPlayers;

	JPanel player1Panel;
	JPanel player2Panel;
	JPanel player3Panel;
	JPanel player4Panel;

	private JTextField p1nameField;
	private JTextField p2nameField;
	private JTextField p3nameField;
	private JTextField p4nameField;

	JComboBox p1tokenBox;
	JComboBox p2tokenBox;
	JComboBox p3tokenBox;
	JComboBox p4tokenBox;

	JButton okButton;
	JButton cancelButton;

	String[] tokenOptions = { "-Select-", "Car", "Ship", "Hat", "Shoe" };
	String[] playerNumOptions = { "-Select-", "2", "3", "4" };

	ImageIcon carIcon = new ImageIcon(MonopolyBoard.class.getResource("/resource/car.png"));
	ImageIcon shipIcon = new ImageIcon(MonopolyBoard.class.getResource("/resource/ship.png"));
	ImageIcon hatIcon = new ImageIcon(MonopolyBoard.class.getResource("/resource/hat.png"));
	ImageIcon shoeIcon = new ImageIcon(MonopolyBoard.class.getResource("/resource/shoe.png"));

	ArrayList<String> playerNames = new ArrayList<String>();
	ImageIcon[] tokenSelections = new ImageIcon[4];

 
	public GameSetupScreen() {
		setTitle("Game Setup");
		setBounds(100, 100, 582, 315);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel playerNumLabel = new JLabel("How many players?");
		playerNumLabel.setBounds(135, 35, 155, 16);
		contentPanel.add(playerNumLabel);

		playerNumCombobox = new JComboBox(playerNumOptions);
		playerNumCombobox.setBounds(302, 32, 142, 22);
		contentPanel.add(playerNumCombobox);

		initialize();

		playerNumCombobox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (playerNumCombobox.getSelectedIndex() == 2) {// 3 Players
					player1Panel.setVisible(true);
					player2Panel.setVisible(true);
					player3Panel.setVisible(true);
					player4Panel.setVisible(false);
					setNumberOfPlayers(3);

				} else if (playerNumCombobox.getSelectedIndex() == 1) {// 2 Players
					player1Panel.setVisible(true);
					player2Panel.setVisible(true);
					player3Panel.setVisible(false);
					player4Panel.setVisible(false);
					setNumberOfPlayers(2);

				} else if (playerNumCombobox.getSelectedIndex() == 3) {// 4 Players
					player1Panel.setVisible(true);
					player2Panel.setVisible(true);
					player3Panel.setVisible(true);
					player4Panel.setVisible(true);
					setNumberOfPlayers(4);
				}
			}
		});

		p1tokenBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (p1tokenBox.getSelectedIndex() == 1) {
					tokenSelections[0] = carIcon;
				} else if (p1tokenBox.getSelectedIndex() == 2) {
					tokenSelections[0] = shipIcon;
				} else if (p1tokenBox.getSelectedIndex() == 3) {
					tokenSelections[0] = hatIcon;
				} else if (p1tokenBox.getSelectedIndex() == 4) {
					tokenSelections[0] = shoeIcon;
				}
			}

		});
		p2tokenBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (p2tokenBox.getSelectedIndex() == 1) {
					tokenSelections[1] = carIcon;
				} else if (p2tokenBox.getSelectedIndex() == 2) {
					tokenSelections[1] = shipIcon;
				} else if (p2tokenBox.getSelectedIndex() == 3) {
					tokenSelections[1] = hatIcon;
				} else if (p2tokenBox.getSelectedIndex() == 4) {
					tokenSelections[1] = shoeIcon;
				}
			}

		});
		p3tokenBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (p3tokenBox.getSelectedIndex() == 1) {
					tokenSelections[2] = carIcon;
				} else if (p3tokenBox.getSelectedIndex() == 2) {
					tokenSelections[2] = shipIcon;
				} else if (p3tokenBox.getSelectedIndex() == 3) {
					tokenSelections[2] = hatIcon;
				} else if (p3tokenBox.getSelectedIndex() == 4) {
					tokenSelections[2] = shoeIcon;
				}
			}

		});
		p4tokenBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (p4tokenBox.getSelectedIndex() == 1) {
					tokenSelections[3] = carIcon;
				} else if (p4tokenBox.getSelectedIndex() == 2) {
					tokenSelections[3] = shipIcon;
				} else if (p4tokenBox.getSelectedIndex() == 3) {
					tokenSelections[3] = hatIcon;
				} else if (p4tokenBox.getSelectedIndex() == 4) {
					tokenSelections[3] = shoeIcon;
				}
			}

		});

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// makes sure all fields are filled for each possible number of players then
				// creates the board and the controller

				if (playerNumCombobox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Select the number of players first!", " title",
							JOptionPane.WARNING_MESSAGE);

				} else if (p1nameField.getText().trim().isEmpty() || p2nameField.getText().trim().isEmpty()
						|| p1tokenBox.getSelectedIndex() == 0 || p2tokenBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "You have to fill all fields!", " title",
							JOptionPane.WARNING_MESSAGE);
				} else if (numberOfPlayers == 3
						&& (p1nameField.getText().trim().isEmpty() || p2nameField.getText().trim().isEmpty()
								|| p3nameField.getText().trim().isEmpty() || p1tokenBox.getSelectedIndex() == 0
								|| p2tokenBox.getSelectedIndex() == 0 || p3tokenBox.getSelectedIndex() == 0)) {
					JOptionPane.showMessageDialog(null, "You have to fill all fields!", " title",
							JOptionPane.WARNING_MESSAGE);
				} else if (numberOfPlayers == 4
						&& (p1nameField.getText().trim().isEmpty() || p2nameField.getText().trim().isEmpty()
								|| p3nameField.getText().trim().isEmpty() || p4nameField.getText().trim().isEmpty()
								|| p1tokenBox.getSelectedIndex() == 0 || p2tokenBox.getSelectedIndex() == 0
								|| p3tokenBox.getSelectedIndex() == 0 || p4tokenBox.getSelectedIndex() == 0)) {
					JOptionPane.showMessageDialog(null, "You have to fill all fields!", " title",
							JOptionPane.WARNING_MESSAGE);
				} else {
					if (numberOfPlayers == 2) {
						playerNames.add(p1nameField.getText());
						playerNames.add(p2nameField.getText());
					} else if (numberOfPlayers == 3) {
						playerNames.add(p1nameField.getText());
						playerNames.add(p2nameField.getText());
						playerNames.add(p3nameField.getText());
					} else if (numberOfPlayers == 4) {
						playerNames.add(p1nameField.getText());
						playerNames.add(p2nameField.getText());
						playerNames.add(p3nameField.getText());
						playerNames.add(p4nameField.getText());
					}

					new GameController(playerNumCombobox.getSelectedIndex() + 1, playerNames);
					new MonopolyBoard(tokenSelections);
					setVisible(false);
				}

			}

		});
		
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//return to main menu
				
			}
			
		});
	}
 
	private void initialize() {
		player1Panel = new JPanel();
		player1Panel.setBounds(31, 97, 504, 22);
		contentPanel.add(player1Panel);
		player1Panel.setLayout(null);

		JLabel p1nameLabel = new JLabel("Player 1's Name:");
		p1nameLabel.setBounds(0, 0, 111, 16);
		player1Panel.add(p1nameLabel);

		p1nameField = new JTextField();
		p1nameField.setBounds(123, 0, 116, 22);
		player1Panel.add(p1nameField);
		p1nameField.setColumns(10);

		JLabel p1tokenLabel = new JLabel("Select Token:");
		p1tokenLabel.setBounds(267, 0, 89, 16);
		player1Panel.add(p1tokenLabel);

		p1tokenBox = new JComboBox(tokenOptions);
		p1tokenBox.setBounds(382, 0, 122, 22);
		player1Panel.add(p1tokenBox);
		// -------------------------------------------------------------------------------
		player2Panel = new JPanel();
		player2Panel.setBounds(31, 126, 504, 22);
		contentPanel.add(player2Panel);
		player2Panel.setLayout(null);

		JLabel p2nameLabel = new JLabel("Player 2's Name:");
		p2nameLabel.setBounds(0, 0, 111, 16);
		player2Panel.add(p2nameLabel);

		p2nameField = new JTextField();
		p2nameField.setBounds(123, 0, 116, 22);
		player2Panel.add(p2nameField);
		p2nameField.setColumns(10);

		JLabel p2tokenLabel = new JLabel("Select Token:");
		p2tokenLabel.setBounds(267, 0, 89, 16);
		player2Panel.add(p2tokenLabel);

		p2tokenBox = new JComboBox(tokenOptions);
		p2tokenBox.setBounds(382, 0, 122, 22);
		player2Panel.add(p2tokenBox);
		// ------------------------------------------------------------------------------------
		player3Panel = new JPanel();
		player3Panel.setBounds(31, 155, 504, 22);
		contentPanel.add(player3Panel);
		player3Panel.setLayout(null);

		JLabel p3nameLabel = new JLabel("Player 3's Name:");
		p3nameLabel.setBounds(0, 0, 111, 16);
		player3Panel.add(p3nameLabel);

		p3nameField = new JTextField();
		p3nameField.setBounds(123, 0, 116, 22);
		player3Panel.add(p3nameField);
		p3nameField.setColumns(10);

		JLabel p3tokenLabel = new JLabel("Select Token:");
		p3tokenLabel.setBounds(267, 0, 89, 16);
		player3Panel.add(p3tokenLabel);

		p3tokenBox = new JComboBox(tokenOptions);
		p3tokenBox.setBounds(382, 0, 122, 22);
		player3Panel.add(p3tokenBox);
		// --------------------------------------------------------------------------------
		player4Panel = new JPanel();
		player4Panel.setBounds(31, 184, 504, 22);
		contentPanel.add(player4Panel);
		player4Panel.setLayout(null);

		JLabel p4nameLabel = new JLabel("Player 4's Name:");
		p4nameLabel.setBounds(0, 0, 111, 16);
		player4Panel.add(p4nameLabel);

		p4nameField = new JTextField();
		p4nameField.setBounds(123, 0, 116, 22);
		player4Panel.add(p4nameField);
		p4nameField.setColumns(10);

		JLabel p4tokenLabel = new JLabel("Select Token:");
		p4tokenLabel.setBounds(267, 0, 89, 16);
		player4Panel.add(p4tokenLabel);

		p4tokenBox = new JComboBox(tokenOptions);
		p4tokenBox.setBounds(382, 0, 122, 22);
		player4Panel.add(p4tokenBox);
		// -----------------------------------------------------------------------------------

		player1Panel.setVisible(false);
		player2Panel.setVisible(false);
		player3Panel.setVisible(false);
		player4Panel.setVisible(false);

		JPanel buttonPane = new JPanel();
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

	}

	public static int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int val) {
		GameSetupScreen.numberOfPlayers = val;
	}

}
