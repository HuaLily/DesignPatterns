package cofe_kinds;

public abstract class Beverage {
    String description = "Unkown Beverage";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
