package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class PlayerGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlayerGUI() {
		setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(35, 38, 56, 16);
		add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(35, 67, 56, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(35, 96, 56, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(35, 125, 56, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(35, 154, 56, 16);
		add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 93, 176, 22);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(127, 122, 176, 22);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(127, 154, 176, 22);
		add(comboBox_2);

	}

}
