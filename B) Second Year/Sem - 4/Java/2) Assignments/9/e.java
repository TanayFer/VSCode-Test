class Rectangle {
    protected double width;
    protected double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double area() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    
    @Override
    public double area() {
        return super.area();
    }
}

public class e {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(6);

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Square Area: " + square.area());
    }
}