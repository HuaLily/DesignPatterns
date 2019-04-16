package FactoryMethod.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;//面团
    String sauce;//酱料
    ArrayList toppings = new ArrayList();//佐料


    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("prepare:" + name );
        System.out.println("Tossing dough...");//抖动面团
        System.out.println("Adding sauce...");
        System.out.println("Adding topping...");
        for (int i = 0; i < toppings.size() ; i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("bake!");
    }

    public void cut() {
        System.out.println("cut!");
    }

    public void box() {
        System.out.println("box!");
    }
}
