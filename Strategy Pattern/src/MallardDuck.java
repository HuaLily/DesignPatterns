import behavior.Quack;
import behavior.flyWithWings;
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior =  new Quack();
        flyBehavior = new flyWithWings();
    }

    @Override
    public void display() {
        System.out.println("this is MallarDuck");
    }
}
