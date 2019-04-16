package cofe_kinds;

public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 2.4;
    }

    public Decaf() {
        description = "Decaf";
    }
}
