import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}

public class EmployeeStreamDemo {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 70000),
            new Employee("Charlie", "Finance", 65000),
            new Employee("David", "IT", 90000),
            new Employee("Eva", "HR", 60000),
            new Employee("Frank", "Finance", 80000),
            new Employee("Grace", "Sales", 55000),
            new Employee("Helen", "Sales", 75000),
            new Employee("Ian", "IT", 85000),
            new Employee("Jack", "HR", 45000),
            new Employee("Kevin", "Finance", 70000),
            new Employee("Laura", "Sales", 95000),
            new Employee("Mike", "IT", 72000),
            new Employee("Nina", "HR", 65000),
            new Employee("Oscar", "Finance", 90000),
            new Employee("Paul", "Sales", 62000),
            new Employee("Queen", "IT", 88000),
            new Employee("Rose", "HR", 70000),
            new Employee("Steve", "Finance", 75000),
            new Employee("Tom", "Sales", 80000)
        );

        // 1. Highest-paid employee in each department
        Map<String, Employee> highestPaid =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.collectingAndThen(
                             Collectors.maxBy(
                                 Comparator.comparingDouble(Employee::getSalary)),
                             Optional::get)));

        System.out.println("Highest Paid Employee in Each Department:");
        highestPaid.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp));

        // 2. Average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("\nAverage Salary: " + averageSalary);

        // Employees earning above average salary
        List<Employee> aboveAverage = employees.stream()
                .filter(e -> e.getSalary() > averageSalary)
                .collect(Collectors.toList());

        System.out.println("\nEmployees Earning Above Average:");
        aboveAverage.forEach(System.out::println);

        // 3. Sort employees by name
        List<Employee> sortedByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("\nEmployees Sorted by Name:");
        sortedByName.forEach(System.out::println);

        // 4. Department-wise employee count
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));

        System.out.println("\nDepartment-wise Employee Count:");
        departmentCount.forEach((dept, count) ->
                System.out.println(dept + " -> " + count));
    }
}