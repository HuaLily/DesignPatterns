import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim(){
            System.out.println("All duck float");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
