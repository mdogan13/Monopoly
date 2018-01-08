package domain;

import java.util.ArrayList;

public class GameController {
	


	
public GameController(int numofPlayers, ArrayList<String> playerNames) {

	
	for (int i = 0; i < numofPlayers; i++) {
		Player p =new Player(playerNames.get(i));
	}
	
	
}


}
