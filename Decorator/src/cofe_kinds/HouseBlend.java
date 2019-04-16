package cofe_kinds;

import cofe_kinds.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 1.1;
    }

    public HouseBlend() {
        description = "HouseBlend";
    }
}
