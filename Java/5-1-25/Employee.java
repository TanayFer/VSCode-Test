public class Employee {
    String name;
    String dept;
    int sal;
    int id;

    public Employee() {}

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);
        System.out.println("Sal : " + sal);
        System.out.println("ID : " + id);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Ashish Chanchlani";
        emp1.dept = "Boys Hostel 317";
        emp1.sal = 10000;
        emp1.id = 69;
        emp1.displayDetails();
    }
}