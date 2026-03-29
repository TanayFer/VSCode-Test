class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {
    int speed = 100;
    
    void printSpeed() {
        System.out.println("Parent speed: " + super.speed);
        System.out.println("Child speed: " + this.speed);
    }
}