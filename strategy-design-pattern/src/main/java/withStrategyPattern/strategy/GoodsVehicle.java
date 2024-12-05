package withStrategyPattern.strategy;

import withStrategyPattern.strategy.strat.NormalDriveStrategy;
import withStrategyPattern.strategy.strat.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {         // We created a constructor here and passed the drive strategy
        super(new NormalDriveStrategy()); //super is used to call the parent constructor with passed strategy
    }
}
