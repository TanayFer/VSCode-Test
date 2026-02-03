import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateYearlySalary() {
        return salary * 12;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + calculateYearlySalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Employee Name: ");
        sc.nextLine(); 
        String name = sc.nextLine(); 
        
        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        
        Employee emp = new Employee(id, name, salary);
        emp.displayDetails();
        
        sc.close();
    }
}