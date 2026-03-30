public class Rectangle {
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