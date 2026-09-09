class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {
    int childSpeed = 100;
    
    void printSpeed() {
        System.out.println("Parent speed: " + super.speed);
        System.out.println("Child speed: " + this.childSpeed);
    }
}

public class d {
    public static void main(String[] args) {
        Car car = new Car();
        car.printSpeed();
    }
}