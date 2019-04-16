package SimpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPize("cheese");
        Pizza pizza1 = pizzaStore.orderPize("clam");
    }
}
