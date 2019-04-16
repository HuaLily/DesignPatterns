package FactoryMethod.PizzaStore;

import FactoryMethod.Pizza.Pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String order);

    public void orderPizza(String order){
        Pizza pizza = createPizza(order);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
