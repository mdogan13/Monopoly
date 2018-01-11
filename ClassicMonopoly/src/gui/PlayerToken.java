package gui;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerToken {

	JLabel tokenContainer=new JLabel();
	int gridPosition;
	
	public PlayerToken(ImageIcon icon) {
		this.gridPosition=0;
		
		tokenContainer.setBounds(0,0,40,17);
		ImageIcon originalicon = icon;
		Image originalpic = originalicon.getImage();
		Image smallpic = originalpic.getScaledInstance(tokenContainer.getWidth(), tokenContainer.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledicon = new ImageIcon(smallpic);
		tokenContainer.setIcon(scaledicon);
		
	}

	public int getGridPosition() {
		return gridPosition;
	}

	public void setGridPosition(int gridPosition) {
		this.gridPosition = gridPosition;
	}
}
