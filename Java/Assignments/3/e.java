import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 

        System.out.println("===========Calculator===========");

        System.out.println("===========Menu===========");
        System.out.println("Select Option :");
        System.out.println("1 :- Addition :");
        System.out.println("2 :- Substraction :");
        System.out.println("3 :- Multiplication :");
        System.out.println("4 :- Division :");
        
        System.out.println("Select Option : ");
        int opt = a.nextInt();
        
        int num1, num2;

        switch (opt) {
            case 1:
                System.out.println("Enter A :");
                num1 = a.nextInt();
                System.out.println("Enter B :");
                num2 = a.nextInt();

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter A :");
                num1 = a.nextInt();
                System.out.println("Enter B :");
                num2 = a.nextInt();

                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Enter A :");
                num1 = a.nextInt();
                System.out.println("Enter B :");
                num2 = a.nextInt();

                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Enter A :");
                num1 = a.nextInt();
                System.out.println("Enter B :");
                num2 = a.nextInt();
                
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            default:
                throw new AssertionError();
        }

        a.close();
    }
}
