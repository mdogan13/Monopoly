package domain;

import java.util.ArrayList;

import domain.squares.propertysquares.RailRoad;
import domain.squares.propertysquares.TitleDeed;
import domain.squares.propertysquares.Utility;

public class Player {
	
	private String playerName;
	private int balance;
	private ArrayList<TitleDeed> ownedTitleDeeds=new ArrayList<TitleDeed>();
	private ArrayList<RailRoad> ownedRailRoads=new ArrayList<RailRoad>();
	private ArrayList<Utility> ownedUtilities=new ArrayList<Utility>();
	private int position=0;
	




public Player(String name) {
	this.balance=1500;
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

public ArrayList<RailRoad> getOwnedRailRoads() {
		return ownedRailRoads;
	}

public ArrayList<TitleDeed> getOwnedTitleDeeds() {
	return ownedTitleDeeds;
}

public ArrayList<Utility> getOwnedUtilities() {
	return ownedUtilities;
}

public int getPosition() {
	return position;
}

public void setPosition(int position) {
	this.position = position;
}
}
