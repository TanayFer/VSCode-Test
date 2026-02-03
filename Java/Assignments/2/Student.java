import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private String studentClass;
    private int totalMarks;
    private int obtainedMarks;

    public Student(String name, int rollNumber, String studentClass, int totalMarks, int obtainedMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public void displayDetails() {
        double percentage = calculatePercentage();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Class: " + studentClass);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
    }

    private double calculatePercentage() {
        return (double) obtainedMarks / totalMarks * 100;
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter class: ");
        studentClass = sc.nextLine();
        System.out.print("Enter total marks: ");
        totalMarks = sc.nextInt();
        System.out.print("Enter obtained marks: ");
        obtainedMarks = sc.nextInt();
    }

    public static void main(String[] args) {
        Student student = new Student("", 0, "", 0, 0);
        student.inputDetails();
        student.displayDetails();
    }
}
