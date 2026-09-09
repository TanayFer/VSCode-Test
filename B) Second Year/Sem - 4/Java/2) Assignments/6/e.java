//Design a class Event with eventName, location, and numberOfAttendees. 
//Use a constructor to initialize values and a method to check if it is a “large” event (attendees> 1000).
import java.util.Scanner;
public class e {
    String eventName;
    String location;
    int numberOfAttendees;

    public e(String eventName, String location, int numberOfAttendees) {
        this.eventName = eventName;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
    }

    public boolean isLargeEvent() {
        return numberOfAttendees > 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter number of attendees: ");
        int numberOfAttendees = scanner.nextInt();

        e event = new e(eventName, location, numberOfAttendees);

        System.out.println("\nEvent Name: " + event.eventName);
        System.out.println("Location: " + event.location);
        System.out.println("Attendees: " + event.numberOfAttendees);
        System.out.println("Is Large Event: " + event.isLargeEvent());

        scanner.close();
    }
}