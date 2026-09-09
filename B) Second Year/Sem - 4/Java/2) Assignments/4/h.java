import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start of range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of range: ");
        int end = scanner.nextInt();
        
        System.out.println("Even numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}