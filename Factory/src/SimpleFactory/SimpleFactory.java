package SimpleFactory;

import SimpleFactory.PizzaKinds.CheesePizza;
import SimpleFactory.PizzaKinds.ClamPiza;
import SimpleFactory.PizzaKinds.VeggiePizza;

public class SimpleFactory {


    public Pizza createPizza(String order) {

        Pizza pizza = null;
        if("cheese".equals(order)){
            pizza = new CheesePizza();
        }else if ("clam".equals(order)){
            pizza = new ClamPiza();
        }else if ("Veggie".equals(order)){
            pizza = new VeggiePizza();
        }else {
            throw new IllegalArgumentException("Error Order");
        }

        return pizza;
    }
}
