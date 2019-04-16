package SimpleFactory;

public class PizzaStore {

   SimpleFactory simpleFactory = new SimpleFactory();

    public Pizza orderPize(String order){
        Pizza pizza = simpleFactory.createPizza(order);
        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
