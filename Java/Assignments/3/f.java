import java.util.Scanner;
public class Week {
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in); 

        System.out.println("===========Week===========");
        
        System.out.println("Select Option(1-7) : ");
        int opt = Sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new AssertionError();
        }

        Sc.close();
    }
}
