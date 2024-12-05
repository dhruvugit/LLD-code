package withStrategyPattern.strategy;

import withStrategyPattern.strategy.strat.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {         // We created a constructor here and passed the drive strategy
        super(new SportsDriveStrategy()); //super is used to call the parent constructor with passed strategy
    }
}