package withStrategyPattern.strategy;

import withStrategyPattern.strategy.strat.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {         // We created a constructor here and passed the drive strategy
        super(new SportsDriveStrategy()); //super is used to call the parent constructor with passed strategy
    }
}
