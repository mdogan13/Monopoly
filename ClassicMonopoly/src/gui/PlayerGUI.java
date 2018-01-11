package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.border.LineBorder;



import java.awt.Color;

@SuppressWarnings("serial")
public class PlayerGUI extends JPanel {
//
	JLabel playerNamelbl;
	JLabel playerBalancelbl;
	JLabel playerIconlbl;
	
	@SuppressWarnings("rawtypes")
	JComboBox titleDeedsCbox;
	@SuppressWarnings("rawtypes")
	JComboBox railroadsCbox;
	@SuppressWarnings("rawtypes")
	JComboBox utilitiesCbox;
	
	ArrayList<String> titleDeedList;
	ArrayList<String>railroadList;
	ArrayList<String> utilityList;

	
	public PlayerGUI(String playerName) {
		titleDeedList=new ArrayList<String>();
		railroadList=new ArrayList<String>();
		utilityList=new ArrayList<String>();
		initialize();
		this.playerNamelbl.setText(playerName);
		this.playerBalancelbl.setText("3200");
		
	 
	

	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initialize() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		lblPlayer.setBounds(12, 13, 56, 25);
		add(lblPlayer);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		lblBalance.setBounds(12, 51, 90, 25);
		add(lblBalance);
		
		JLabel lblTitleDeeds = new JLabel("Title Deeds:");
		lblTitleDeeds.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		lblTitleDeeds.setBounds(12, 87, 90, 25);
		add(lblTitleDeeds);
		
		JLabel lblRailroads = new JLabel("Railroads:");
		lblRailroads.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		lblRailroads.setBounds(12, 125, 90, 25);
		add(lblRailroads);
		
		JLabel lblUtilities = new JLabel("Utilities:");
		lblUtilities.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		lblUtilities.setBounds(12, 162, 90, 25);
		add(lblUtilities);
		
		titleDeedsCbox = new JComboBox(titleDeedList.toArray());
		titleDeedsCbox.setFont(new Font("KabinLightDB", Font.PLAIN, 18));
		titleDeedsCbox.setBounds(147, 87, 176, 25);
		add(titleDeedsCbox);
		
		railroadsCbox = new JComboBox(railroadList.toArray());
		railroadsCbox.setFont(new Font("KabinLightDB", Font.PLAIN, 18));
		railroadsCbox.setBounds(147, 125, 176, 25);
		add(railroadsCbox);
		
		utilitiesCbox = new JComboBox(utilityList.toArray());
		utilitiesCbox.setFont(new Font("KabinLightDB", Font.PLAIN, 18));
		utilitiesCbox.setBounds(147, 162, 176, 25);
		add(utilitiesCbox);
		
		playerNamelbl = new JLabel("<name>");
		playerNamelbl.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		playerNamelbl.setBounds(213, 13, 110, 25);
		add(playerNamelbl);
		
		playerIconlbl = new JLabel("icon");
		playerIconlbl.setBounds(147, 13, 54, 25);
		add(playerIconlbl);
		
		playerBalancelbl = new JLabel("<balance>");
		playerBalancelbl.setFont(new Font("KabinLightDB", Font.BOLD, 22));
		playerBalancelbl.setBounds(147, 51, 110, 25);
		add(playerBalancelbl);
	}
}
