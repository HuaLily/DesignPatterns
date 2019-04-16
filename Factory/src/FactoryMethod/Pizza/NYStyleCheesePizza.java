package FactoryMethod.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name =" NY Style Cheese Piza";
        dough = "Thin Crust Dough"; //薄外壳
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
