package domain;

public class Player {
	
	String playerName;
	int balance;
	


public Player(String name) {
	this.balance=3200;
	this.playerName=name;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public String getPlayerName() {
	return playerName;
}
}
