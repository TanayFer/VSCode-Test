import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("Sum: " + sum);
        
        if (sum > 0) {
            System.out.println("The sum is positive.");
        } else if (sum < 0) {
            System.out.println("The sum is negative.");
        } else {
            System.out.println("The sum is zero.");
        }
        
        scanner.close();
    }
}