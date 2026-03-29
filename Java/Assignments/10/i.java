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