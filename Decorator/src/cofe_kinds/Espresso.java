package cofe_kinds;

import cofe_kinds.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 12.2;
    }

    public Espresso() {
        description = "Espresso";
    }
}
