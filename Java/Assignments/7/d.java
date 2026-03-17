// Design a Laptop class with private brand, model, and price.
// Provide getter and setter methods for each attribute.
import java.util.Scanner;

class d {
	private String brand;
	private String model;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("\nLaptop Details:");
		System.out.println("Brand : " + getBrand());
		System.out.println("Model : " + getModel());
		System.out.println("Price : " + getPrice());
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			d laptop = new d();

			System.out.print("Enter laptop brand: ");
			laptop.setBrand(sc.nextLine());

			System.out.print("Enter laptop model: ");
			laptop.setModel(sc.nextLine());

			System.out.print("Enter laptop price: ");
			laptop.setPrice(sc.nextDouble());

			laptop.displayDetails();
		}
	}
}
