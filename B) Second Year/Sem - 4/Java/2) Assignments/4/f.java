import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        if (number < 0) {
            reversed = -reversed;
        }
        
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}