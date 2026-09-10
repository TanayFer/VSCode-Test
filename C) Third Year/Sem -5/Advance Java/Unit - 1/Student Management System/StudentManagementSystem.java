import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> studentIds = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (studentIds.contains(id)) {
                System.out.println("Duplicate ID! Student not added.");
                continue;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students.add(new Student(id, name));
            studentIds.add(id);

            System.out.println("Student added successfully.");
        }

        System.out.println("\nStudent Records:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}