import cofe_Decorator.Decorator;
import cofe_Decorator.Mocha;
import cofe_Decorator.milk;
import cofe_kinds.Beverage;
import cofe_kinds.DarkRoast;

public class Main{
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());

        Beverage darkRoast1 = new DarkRoast();
        darkRoast1 = new milk(darkRoast1);
        darkRoast1 = new Mocha((Decorator) darkRoast1);
        System.out.println(darkRoast1.getDescription()+ darkRoast1.cost());
    }
}
