package domain.squares.propertysquares.rentstrategy;

import domain.GameController;
import domain.Player;
import domain.squares.propertysquares.RailRoad;
import domain.squares.propertysquares.TitleDeed;
import domain.squares.propertysquares.Utility;

public  class UtilityRentCalculationStrategy implements RentCalculationStrategy {

	@Override
	public int calculateRent(Utility u,Player owner) {
		int totalDiceVal=GameController.getDieVals()[2];
		int coefficient=0;
		if(owner.getOwnedUtilities().size()==1) {
			coefficient=4;
			
		}else if(owner.getOwnedUtilities().size()==2) {
			coefficient=10;
		}
		return totalDiceVal*coefficient;
		
	}

	@Override
	public int calculateRent(TitleDeed t, Player owner) {
		//do nothing
		return 0;
	}

	@Override
	public int calculateRent(RailRoad r, Player owner) {
		//do nothing
		return 0;
	}

}
