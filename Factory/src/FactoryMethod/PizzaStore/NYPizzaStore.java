package FactoryMethod.PizzaStore;

import FactoryMethod.Pizza.NYStyleCheesePizza;
import FactoryMethod.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String order) {
        Pizza pizza = null;
        if ("cheese".equals(order)){
            pizza = new NYStyleCheesePizza();
        }else {
            throw new IllegalArgumentException("error order");
        }
        return  pizza;
    }
}
