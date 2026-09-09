class Person {
    private final String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
}

public class c {
    public static void main(String[] args) {
        Person person = new Person("John");
        Employee employee = new Employee("Alice");

        System.out.println("Person Name: " + person.getName());
        System.out.println("Employee Name: " + employee.getName());
    }
}