package domain.squares.propertysquares.rentstrategy;

import domain.Player;
import domain.squares.propertysquares.RailRoad;
import domain.squares.propertysquares.TitleDeed;
import domain.squares.propertysquares.Utility;

public interface RentCalculationStrategy {

int calculateRent(TitleDeed t, Player owner);
int calculateRent(RailRoad r, Player owner);
int calculateRent(Utility u, Player owner);
}

