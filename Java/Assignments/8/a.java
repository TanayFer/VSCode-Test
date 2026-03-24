import java.util.Scanner;

public class a {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Student extends Person {
        int rollNumber;
        double marks;

        Student(String name, int age, int rollNumber, double marks) {
            super(name, age);
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        void display() {
            super.display();
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();

            Student s = new Student(name, age, rollNumber, marks);
            s.display();
        }
    }
}