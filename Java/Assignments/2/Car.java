public class Car {
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public void increaseSpeed(int increment) {
        speed += increment;
    }

    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.increaseSpeed(50);
        myCar.displayDetails();
    }
}