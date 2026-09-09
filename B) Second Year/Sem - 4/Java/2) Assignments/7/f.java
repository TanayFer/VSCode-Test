class Student {
    private static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

class f {
    public static final double PI = 3.14159;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        System.out.println("Total Students: " + Student.getStudentCount());

        double radius = 10.0;
        double area = f.calculateArea(radius);
        System.out.println("Area of circle (r=" + radius + "): " + area);
    }
}