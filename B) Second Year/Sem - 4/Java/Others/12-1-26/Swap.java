//Write a program to swap two numbers using a temporary variable and then without
//using a temporary variable.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter First No: ");
            int A = sc.nextInt();
            
            System.out.println("Enter First No: ");
            int B = sc.nextInt();

            System.out.println("A : "+A);
            System.out.println("B : "+B);

            System.out.println("------------3rd Var-----------");

            int A1 = A;
            int B1 = B;

            int C = A1;
            A1 = B1;
            B1 = C;
            
            System.out.println("A : "+A1);
            System.out.println("B : "+B1);

            System.out.println("------------3rd Var-----------");

        }
    }
}
