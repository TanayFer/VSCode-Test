//Design a class Bus with busNumber, driverName, and passengerCapacity. Use a
//constructor to initialize values and a method to check if the bus is full given the current
//number of passengers.

import java.util.Scanner;

public class d {
	int busNumber;
	String driverName;
	int passengerCapacity;

	public d(int busNumber, String driverName, int passengerCapacity) {
		this.busNumber = busNumber;
		this.driverName = driverName;
		this.passengerCapacity = passengerCapacity;
	}

	public boolean isFull(int currentPassengers) {
		return currentPassengers >= passengerCapacity;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter bus number: ");
		int busNumber = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter driver name: ");
		String driverName = scanner.nextLine();

		System.out.print("Enter passenger capacity: ");
		int passengerCapacity = scanner.nextInt();

		System.out.print("Enter current passengers: ");
		int currentPassengers = scanner.nextInt();

		d bus = new d(busNumber, driverName, passengerCapacity);

		System.out.println("\nBus Number: " + bus.busNumber);
		System.out.println("Driver Name: " + bus.driverName);
		System.out.println("Passenger Capacity: " + bus.passengerCapacity);

		if (bus.isFull(currentPassengers)) {
			System.out.println("Bus is full.");
		} else {
			System.out.println("Bus is not full.");
		}

		scanner.close();
	}
}
