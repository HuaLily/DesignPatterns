import behavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck  = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();

        Duck modelDuck1 = new ModelDuck();
        modelDuck1.setFlyBehavior(new FlyRocketPowered());
        modelDuck1.performFly();
        modelDuck1.performQuack();
    }
}
