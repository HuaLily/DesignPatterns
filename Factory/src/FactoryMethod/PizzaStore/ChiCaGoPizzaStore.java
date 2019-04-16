package FactoryMethod.PizzaStore;

import FactoryMethod.Pizza.ChiCaGoCheesePizza;
import FactoryMethod.Pizza.Pizza;

public class ChiCaGoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String order) {
        Pizza pizza = null;
        if ("cheese".equals(order)){
            pizza = new ChiCaGoCheesePizza();
        }else {
            throw new IllegalArgumentException("error order");
        }
        return  pizza;
    }
}
