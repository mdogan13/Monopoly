package domain;

import java.util.ArrayList;

public class GameController {
	

	public static ArrayList<Player> playerList=new ArrayList<Player>();
	public static Die die1=new Die();
	public static Die die2=new Die();
	public static Player currentPlayer;

	
public GameController(int numofPlayers, ArrayList<String> playerNames) {

	
	for (int i = 0; i < numofPlayers; i++) {
		Player p =new Player(playerNames.get(i));
		playerList.add(p);
	}
	
	GameController.currentPlayer=playerList.get(0);
	
}

public static int[] rollDice(Die d1, Die d2) {
	int[] results=new int[3];
	results[0]=d1.roll();
	results[1]=d2.roll();
	results[2]=results[0]+results[1];
	
	return results;
}

public static void nextPlayer() {
	GameController.currentPlayer=playerList.get((playerList.indexOf(GameController.currentPlayer)+1)%playerList.size());
}

}
