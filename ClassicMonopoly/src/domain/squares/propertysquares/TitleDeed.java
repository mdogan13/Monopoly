package domain.squares.propertysquares;

import domain.GameController;
import domain.Player;
import domain.squares.Square;
import domain.squares.propertysquares.rentstrategy.RentCalculationStrategy;
import domain.squares.propertysquares.rentstrategy.TitleDeedRentCalculationStrategy;

public class TitleDeed implements Square {

	RentCalculationStrategy rentStrategy;
	private String name;
	private Player owner = GameController.bank;
	private int buyPrice;
	private int mortgageValue;
	private boolean isMortgaged = false;
	private int[] rentValues; // 0 = base rent , 1...4 = house rents, 5 = hotel rent
	private int houseCost;
	private int hotelCost;
	private int numOfHouses = 0;
	private int numOfHotels = 0;
	private boolean hasMajorityOwnerShip = false;

	public TitleDeed(String name, int buyPrice, int[] rentValues, int houseCost, int hotelCost, int mortgageValue) {
		this.rentStrategy = new TitleDeedRentCalculationStrategy();
		this.name = name;
		this.buyPrice = buyPrice;
		this.rentValues = rentValues;
		this.houseCost = houseCost;
		this.hotelCost = hotelCost;
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

	public int getHouseCost() {
		return houseCost;
	}

	public int getHotelCost() {
		return hotelCost;
	}

	public int getMortgageValue() {
		return mortgageValue;
	}

	public int getNumOfHouses() {
		return numOfHouses;
	}

	public void setNumOfHouses(int numOfHouses) {
		this.numOfHouses = numOfHouses;
	}

	public int getNumOfHotels() {
		return numOfHotels;
	}

	public void setNumOfHotels(int numOfHotels) {
		this.numOfHotels = numOfHotels;
	}

	public boolean isHasMajorityOwnerShip() {
		return hasMajorityOwnerShip;
	}

	public void setHasMajorityOwnerShip(boolean hasMajorityOwnerShip) {
		this.hasMajorityOwnerShip = hasMajorityOwnerShip;
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
