// Design a Car class with private make, model, and speed.
// Use getters and setters to update and display car details.
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("\nCar Details:");
        System.out.println("Make  : " + getMake());
        System.out.println("Model : " + getModel());
        System.out.println("Speed : " + getSpeed() + " km/h");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Car car = new Car();

            System.out.print("Enter car make: ");
            car.setMake(sc.nextLine());

            System.out.print("Enter car model: ");
            car.setModel(sc.nextLine());

            System.out.print("Enter car speed: ");
            car.setSpeed(sc.nextInt());

            car.displayDetails();
        }
    }
}