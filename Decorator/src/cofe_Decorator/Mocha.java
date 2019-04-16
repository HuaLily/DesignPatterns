package cofe_Decorator;

public class Mocha extends Decorator {
    Decorator decorator;

    public Mocha(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String getDescription() {
        return decorator.getDescription()+ ",Mocha";
    }

    @Override
    public double cost() {
        return decorator.cost()+ 0.5;
    }
}
