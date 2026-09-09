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

public class b {
    public static void main(String[] args) {
        Movable car = new Car();
        Movable robot = new Robot();

        car.move();
        robot.move();
    }
}