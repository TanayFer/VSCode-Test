//Design a class Flight with flightNumber, origin, destination, and duration. Use a constructor to initialize all fields and display flight details.

import java.util.Scanner;

public class b {
    public int flightNumber;
    public String origin;
    public String destination;
    public double duration;

    public b(int flightNumber, String origin, String destination, double duration) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Duration (hours): " + duration);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter flight number: ");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter origin: ");
        String origin = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter duration in hours: ");
        double duration = scanner.nextDouble();

        b flight = new b(flightNumber, origin, destination, duration);

        System.out.println("\nFlight Details:");
        flight.displayDetails();

        scanner.close();
    }
}

