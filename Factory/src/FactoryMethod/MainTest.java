package FactoryMethod;

import FactoryMethod.PizzaStore.ChiCaGoPizzaStore;
import FactoryMethod.PizzaStore.NYPizzaStore;

public class MainTest {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        ChiCaGoPizzaStore chiCaGoPizzaStore = new ChiCaGoPizzaStore();
        chiCaGoPizzaStore.orderPizza("cheese");

    }
}
