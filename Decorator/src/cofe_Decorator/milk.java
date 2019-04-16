package cofe_Decorator;

import cofe_kinds.Beverage;

public class milk extends Decorator {
    Beverage beverage;

    public milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        System.out.println( beverage.getDescription() + ",milk");
        return beverage.getDescription() + " , milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
