package SimpleFactory;

public abstract class Pizza {
    String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("prepare!");
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

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
