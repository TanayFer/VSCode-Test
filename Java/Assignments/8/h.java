class Vehicle {
    String type = "Vehicle";
    String color = "Unknown";
    
    void display() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    String type = "Car";
    int numDoors = 4;
    
    void display() {
        super.display();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class ElectricCar extends Car {
    double batteryCapacity = 100.0; // kWh
    
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class h {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.display();
    }
}