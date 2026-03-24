class Vehicle {
    String brand = "Generic Brand";
    String color = "White";
    
    void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    String model = "Generic Model";
    int year = 2024;
    
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class ElectricCar extends Car {
    double batteryCapacity = 75.0;
    
    void displayElectricCarInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
    
    void displayAllFeatures() {
        displayVehicleInfo();
        displayCarInfo();
        displayElectricCarInfo();
    }
}

public class h {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.brand = "Tesla";
        tesla.color = "Red";
        tesla.model = "Model S";
        tesla.year = 2024;
        tesla.batteryCapacity = 100.0;
        
        tesla.displayAllFeatures();
    }
}