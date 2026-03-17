import java.util.Scanner;

public class a {
    private String name;
    private double marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display a details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a a = new a();

        // Take dynamic input
        System.out.print("Enter a name: ");
        a.setName(scanner.nextLine());

        System.out.print("Enter a marks: ");
        a.setMarks(scanner.nextDouble());

        // Display details
        System.out.println("\n--- a Details ---");
        a.displayDetails();

        scanner.close();
    }
}