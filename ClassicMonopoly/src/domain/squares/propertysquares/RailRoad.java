package domain.squares.propertysquares;

import domain.GameController;
import domain.Player;
import domain.squares.Square;
import domain.squares.propertysquares.rentstrategy.RailRoadRentCalculationStrategy;
import domain.squares.propertysquares.rentstrategy.RentCalculationStrategy;

public class RailRoad implements Square {
	RentCalculationStrategy rentStrategy;
	private int[] rentValues;
	private String name;
	private Player owner = GameController.bank;
	private int buyPrice;
	private int mortgageValue;
	private boolean isMortgaged = false;

	public RailRoad(String name, int buyPrice, int[] rentValues, int mortgageValue) {
		this.rentStrategy = new RailRoadRentCalculationStrategy();
		this.name = name;
		this.buyPrice = buyPrice;
		this.rentValues = rentValues;
		this.mortgageValue = mortgageValue;

	}

	@Override
	public void landedOn() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public int[] getRentValues() {
		return rentValues;
	}

	public int getMortgageValue() {
		return mortgageValue;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isMortgaged() {
		return isMortgaged;
	}

	public void setMortgaged(boolean isMortgaged) {
		this.isMortgaged = isMortgaged;
	}

}
