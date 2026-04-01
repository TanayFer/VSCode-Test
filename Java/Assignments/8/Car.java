// Vehicle base class
class Vehicle {
    protected String brand;
    protected String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Car derived class
public class Car extends Vehicle {
    private final int speed;
    
    public Car(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Speed: " + speed + " km/h");
    }
    
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 200);
        car.displayInfo();
    }
}