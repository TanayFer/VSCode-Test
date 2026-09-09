import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();
        
        double discount;
        if (amount > 1000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.05;
        }
        
        double finalAmount = amount - discount;
        
        System.out.println("Final payable amount: " + finalAmount);
        
        sc.close();
    }
}