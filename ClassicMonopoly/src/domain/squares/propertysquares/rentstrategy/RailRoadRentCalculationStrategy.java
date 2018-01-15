package domain.squares.propertysquares.rentstrategy;

import domain.Player;
import domain.squares.propertysquares.RailRoad;
import domain.squares.propertysquares.TitleDeed;
import domain.squares.propertysquares.Utility;

public  class RailRoadRentCalculationStrategy implements RentCalculationStrategy {

	@Override
	public int calculateRent(RailRoad r,Player owner) {
		if(owner.getOwnedRailRoads().size()==1) {
			return r.getRentValues()[0];
		}else if(owner.getOwnedRailRoads().size()==2) {
			return r.getRentValues()[1];
		}else if(owner.getOwnedRailRoads().size()==3) {
			return r.getRentValues()[2];
		}else {
			return r.getRentValues()[3];
		}
		
	}

	@Override
	public int calculateRent(TitleDeed t, Player owner) {
		//do nothing
		return 0;
	}

	@Override
	public int calculateRent(Utility u, Player owner) {
		//do nothing
		return 0;
	}

}
