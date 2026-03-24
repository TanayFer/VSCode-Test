public class b {
	static class Vehicle {
		String brand;
		String model;

		Vehicle(String brand, String model) {
			this.brand = brand;
			this.model = model;
		}

		void displayInfo() {
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
		}
	}

	static class Car extends Vehicle {
		int speed;

		Car(String brand, String model, int speed) {
			super(brand, model);
			this.speed = speed;
		}

		void displayInfo() {
			super.displayInfo();
			System.out.println("Speed: " + speed + " km/h");
		}
	}

	public static void main(String[] args) {
		Car car = new Car("Toyota", "Corolla", 180);
		car.displayInfo();
	}
}
