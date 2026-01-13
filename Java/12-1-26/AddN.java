//Write a program that takes two integers from the user, adds them, and displays the sum along with a message indicating whether the sum is positive, negative, or zero.
import  java.util.Scanner;
public class AddN{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A integer: ");
            int A = sc.nextInt();

            System.out.print("Enter B integer: ");
            int B = sc.nextInt();

            int C = A+B;
            System.out.println("Addition is: "+C);

            if(C > 0){
                System.out.println("Sum is positive");
            }
            else if(C < 0){
                System.out.println("Sum is negative");
            }
            else{
                System.out.println("Sum is Zero");
            }
        }
    }
}
















