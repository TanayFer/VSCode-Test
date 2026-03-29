class Shape {
    public void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    @Override
    public void display() {
        System.out.println("This is a Circle");
    }
}