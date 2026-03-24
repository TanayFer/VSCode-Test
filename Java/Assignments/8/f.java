class Shape {
    public void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    public void display() {
        System.out.println("This is a Circle");
    }
}

public class f {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();
        
        Circle circle = new Circle();
        circle.display();
    }
}