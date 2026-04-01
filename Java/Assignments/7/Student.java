import java.util.Scanner;

public class Student {
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

    // Display Student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Student student = new Student();

            // Take dynamic input
            System.out.print("Enter Student name: ");
            student.setName(scanner.nextLine());

            System.out.print("Enter Student marks: ");
            student.setMarks(scanner.nextDouble());

            // Display details
            System.out.println("\n--- Student Details ---");
            student.displayDetails();
        }
    }
}