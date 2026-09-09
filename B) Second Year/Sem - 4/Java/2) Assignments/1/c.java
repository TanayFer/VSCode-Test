import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        scanner.close();
    }
}