class Person {
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
}

class Student extends Person {
    private int rollNumber;
    private double marks;
    
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