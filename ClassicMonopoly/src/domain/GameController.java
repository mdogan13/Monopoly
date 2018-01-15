package domain;

import java.util.ArrayList;

import domain.squares.Square;
import domain.squares.actionsquares.*;
import domain.squares.propertysquares.*;

public class GameController {
	
	public static Player bank=new Player("bank");
	public static ArrayList<Player> playerList=new ArrayList<Player>();
	public static ArrayList<Square> squares=new ArrayList<Square>();
	public static Die die1=new Die();
	public static Die die2=new Die();
	public static Player currentPlayer;
	private static int[] dieVals; 
	
	
public GameController(int numofPlayers, ArrayList<String> playerNames) {

	initializeSquares();
	
	for (int i = 0; i < numofPlayers; i++) {
		Player p =new Player(playerNames.get(i));
		playerList.add(p);
	}
	
	GameController.currentPlayer=playerList.get(0);
	
}

public static int[] rollDice(Die d1, Die d2) {
	setDieVals(new int[3]);
	getDieVals()[0]=d1.roll();
	getDieVals()[1]=d2.roll();
	getDieVals()[2]=getDieVals()[0]+getDieVals()[1];
	
	return getDieVals();
}

public static void nextPlayer() {
	GameController.currentPlayer=playerList.get((playerList.indexOf(GameController.currentPlayer)+1)%playerList.size());
}

public static int[] getDieVals() {
	return dieVals;
}

public static void setDieVals(int[] dieVals) {
	GameController.dieVals = dieVals;
}

void initializeSquares() {
	squares.add(0, new Go());
	squares.add(1, new TitleDeed("Old Kent Road",60,new int[] {2,10,30,90,160,250},50,50,30));
	squares.add(2, new CommunityChest());
	squares.add(3, new TitleDeed("Whitechapel Road",60,new int[] {4,20,60,180,320,450},50,50,30));
	squares.add(4, new IncomeTax());
	squares.add(5, new RailRoad("Kings Cross Station",200,new int[] {25,50,100,200},100));
	squares.add(6, new TitleDeed("The Angel Islington",100,new int[] {6,30,90,270,400,550},50,50,50));
	squares.add(7, new Chance());
	squares.add(8, new TitleDeed("Euston Road",100,new int[] {6,30,90,270,400,550},50,50,50));
	squares.add(9, new TitleDeed("Pentonville Road",120,new int[] {8,40,100,300,450,600},50,50,60));
	squares.add(10, new Jail());
	squares.add(11, new TitleDeed("Pall Mall",140,new int[] {10,50,150,450,625,750},100,100,70));
	squares.add(12, new Utility("Electric Company",150,75));
	squares.add(13, new TitleDeed("Whitehall",140,new int[] {10,50,150,450,625,750},100,100,70));
	squares.add(14, new TitleDeed("Northumrl'd Avenue",160,new int[] {12,60,180,500,700,900},100,100,80));
	squares.add(15, new RailRoad("Marylebone Station",200,new int[] {25,50,100,200},100));
	squares.add(16, new TitleDeed("Bow Street",180,new int[] {14,70,200,550,750,950},100,100,90));
	squares.add(17, new CommunityChest());
	squares.add(18, new TitleDeed("Marlborough Street",180,new int[] {14,70,200,550,750,950},100,100,90));
	squares.add(19, new TitleDeed("Vine Street",200,new int[] {16,80,220,600,800,1000},100,100,100));
	squares.add(20, new FreeParking());
	squares.add(21, new TitleDeed("Strand",220,new int[] {18,90,250,700,875,1050},150,150,110));
	squares.add(22, new Chance());
	squares.add(23, new TitleDeed("Fleet Street",220,new int[] {18,90,250,700,875,1050},150,150,110));
	squares.add(24, new TitleDeed("Trafalgar Square",240,new int[] {20,100,300,750,925,1100},150,150,120));
	squares.add(25, new RailRoad("Fenchurch St. Station",200,new int[] {25,50,100,200},100));
	squares.add(26, new TitleDeed("Leicester Square",260,new int[] {22,110,330,800,975,1150},150,150,130));
	squares.add(27, new TitleDeed("Coventry Street",260,new int[] {22,110,330,800,975,1150},150,150,130));
	squares.add(28, new Utility("Water Works",150,75));
	squares.add(29, new TitleDeed("Piccadilly",280,new int[] {24,120,360,850,1025,1200},150,150,140));
	squares.add(30, new GoToJail());
	squares.add(31, new TitleDeed("Regent Street",300,new int[] {26,130,390,900,1100,1275},200,200,150));
	squares.add(32, new TitleDeed("Oxford Street",300,new int[] {26,130,390,900,1100,1275},200,200,150));
	squares.add(33, new CommunityChest());
	squares.add(34, new TitleDeed("Bond Street",320,new int[] {28,150,390,900,1200,1400},200,200,160));
	squares.add(35, new RailRoad("Liverpool St. Station",200,new int[] {25,50,100,200},100));
	squares.add(36, new Chance());
	squares.add(37, new TitleDeed("Park Lane",350,new int[] {35,175,500,1100,1300,1500},200,200,175));
	squares.add(38, new SuperTax());
	squares.add(39, new TitleDeed("Mayfair",400,new int[] {50,175,500,1100,1700,2000},200,200,200));
}

}
