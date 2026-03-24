class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    protected String employeeId;
    protected double salary;
    
    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Salary: $" + salary);
    }
    
    public void work() {
        System.out.println(name + " is working.");
    }
}
class Manager extends Employee {
    private String department;
    private int teamSize;
    
    public Manager(String name, int age, String employeeId, double salary, String department, int teamSize) {
        super(name, age, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department + ", Team Size: " + teamSize);
    }
    
    public void manageSprint() {
        System.out.println(name + " is managing a sprint for the " + department + " department.");
    }
    
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting with " + teamSize + " team members.");
    }
}

public class c {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.displayInfo();
        
        System.out.println();
        
        Employee employee = new Employee("Alice", 28, "EMP001", 50000);
        employee.displayInfo();
        employee.work();
        
        System.out.println();
        
        Manager manager = new Manager("Bob", 35, "MGR001", 80000, "Engineering", 10);
        manager.displayInfo();
        manager.work();
        manager.manageSprint();
        manager.conductMeeting();
    }
}