import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("First number is greater than second number");
        } else if (num1 < num2) {
            System.out.println("First number is less than second number");
        } else {
            System.out.println("Both numbers are equal");
        }
        
        scanner.close();
    }
}