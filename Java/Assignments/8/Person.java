public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 20);
        System.out.println("Person Details:");
        person.displayDetails();

        System.out.println();

        Student student = new Student("Alice", 19, 101, 89.5);
        System.out.println("Student Details:");
        student.displayDetails();
    }
}

class Student extends Person {
    private final int rollNumber;
    private final double marks;
    
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}