class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class g extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        g penguin = new g();

        bird.fly();
        penguin.fly();
    }
}