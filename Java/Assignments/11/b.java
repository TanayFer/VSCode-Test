interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}

class Robot implements Movable {
    @Override
    public void move() {
        System.out.println("Robot is walking");
    }
}