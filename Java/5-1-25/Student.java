public class Student {
    int rollNo;
    String name;

    // Default constructor (required to use "new Student()")
    public Student() {}

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.rollNo = 01;
        student1.name = "Anish DesCHEpande";

        student1.displayDetails();
    }
}
