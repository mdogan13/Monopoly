package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import domain.GameController;

public class GUIController {
	//put grid controls here later
public GUIController() {
		
	MonopolyBoard.turnLabel.setText("Player "+GameController.currentPlayer.getPlayerName()+"'s Turn");
	
	MonopolyBoard.rollButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			MonopolyBoard.rollButton.setEnabled(false);//this will change if double rolled
			int tokenIndexToMove = GameController.playerList.indexOf(GameController.currentPlayer);
			int[] dieVals=GameController.rollDice(GameController.die1,GameController.die2);
			MonopolyBoard.diceValLabel.setText("Dice Values:"+dieVals[0]+" "+dieVals[1]);
			MonopolyBoard.grid.moveOnGrid(MonopolyBoard.tokenList.get(tokenIndexToMove), dieVals[2]);
			MonopolyBoard.btnEndTurn.setEnabled(true);
		}
		
	});
	
	MonopolyBoard.btnEndTurn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		GameController.nextPlayer();
		MonopolyBoard.turnLabel.setText("Player "+GameController.currentPlayer.getPlayerName()+"'s Turn");
		MonopolyBoard.btnEndTurn.setEnabled(false);
		MonopolyBoard.rollButton.setEnabled(true);
		}
		
	});
	
}
}
