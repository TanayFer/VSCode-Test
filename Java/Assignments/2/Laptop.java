import java.util.Scanner;

public class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public boolean isAffordable(double budget) {
        return budget >= price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter laptop brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter laptop model: ");
        String model = scanner.nextLine();
        System.out.print("Enter laptop price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        Laptop laptop = new Laptop(brand, model, price);
        laptop.displayDetails();

        if (laptop.isAffordable(budget)) {
            System.out.println("The laptop is affordable.");
        } else {
            System.out.println("The laptop is not affordable.");
        }

        scanner.close();
    }
}