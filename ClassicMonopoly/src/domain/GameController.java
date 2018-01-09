package domain;

import java.util.ArrayList;

public class GameController {
	

	static ArrayList<Player> playerList=new ArrayList<Player>();
	

	
public GameController(int numofPlayers, ArrayList<String> playerNames) {

	
	for (int i = 0; i < numofPlayers; i++) {
		Player p =new Player(playerNames.get(i));
		playerList.add(p);
	}
	
	
}


}
