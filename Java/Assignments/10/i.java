abstract class Pizza {
    abstract void addToppings();
}

class VeggiePizza extends Pizza {
    @Override
    void addToppings() {
        System.out.println("Adding vegetable toppings: peppers, onions, mushrooms");
    }
}

class PepperoniPizza extends Pizza {
    @Override
    void addToppings() {
        System.out.println("Adding pepperoni slices");
    }
}

public class i {
    public static void main(String[] args) {
        Pizza veggie = new VeggiePizza();
        Pizza pepperoni = new PepperoniPizza();

        veggie.addToppings();
        pepperoni.addToppings();
    }
}