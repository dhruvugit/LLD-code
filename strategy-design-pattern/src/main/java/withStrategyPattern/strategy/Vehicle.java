package withStrategyPattern.strategy;

import withStrategyPattern.strategy.strat.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle (DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}