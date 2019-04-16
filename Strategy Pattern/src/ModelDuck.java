import behavior.MuteQuack;
import behavior.flyNoWay;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("this is modelDuck!");
    }

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new flyNoWay();
    }


}
