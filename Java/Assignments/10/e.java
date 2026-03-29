abstract class Furniture {
    abstract String material();
}

class Chair extends Furniture {
    @Override
    String material() {
        return "Wood";
    }
}

class Table extends Furniture {
    @Override
    String material() {
        return "Glass";
    }
}