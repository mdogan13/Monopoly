package domain.squares.propertysquares.rentstrategy;

import domain.Player;
import domain.squares.propertysquares.RailRoad;
import domain.squares.propertysquares.TitleDeed;
import domain.squares.propertysquares.Utility;

public class TitleDeedRentCalculationStrategy implements RentCalculationStrategy {

	@Override
	public int calculateRent(TitleDeed p, Player owner) {

		if (p.getNumOfHouses() == 0) {
			if (p.isHasMajorityOwnerShip()) {
				// in case of a majority ownership, rent is doubled
				return p.getRentValues()[0] * 2;
			}
			return p.getRentValues()[0];
		} else if (p.getNumOfHotels() == 0) {
			// if there are no hotels and some houses, return its rent
			return p.getRentValues()[p.getNumOfHouses()];
		} else {
			// else there must be a hotel, return its rent
			return p.getRentValues()[5];
		}

	}

	@Override
	public int calculateRent(RailRoad r, Player owner) {
		// do nothing
		return 0;
	}

	@Override
	public int calculateRent(Utility u, Player owner) {
		// do nothing
		return 0;
	}

}
