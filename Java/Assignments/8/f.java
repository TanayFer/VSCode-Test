class Shape {
    public void display() {
        System.out.println("This is a Shape");
    }
}

public class f extends Shape {
    @Override
    public void display() {
        System.out.println("This is a Circle");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        f circle = new f();

        shape.display();
        circle.display();
    }
}