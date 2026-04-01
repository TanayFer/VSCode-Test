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

public class e {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture table = new Table();

        System.out.println("Chair material: " + chair.material());
        System.out.println("Table material: " + table.material());
    }
}