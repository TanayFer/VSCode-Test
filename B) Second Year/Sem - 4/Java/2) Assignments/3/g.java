import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = Sc.nextInt();

        if(a % 3 == 0){
            System.out.println(a + " is Divisible by 3");
        }
        if(a % 5 == 0){
            System.out.println(a + " is Divisible by 5");
        }

        if(a % 3 == 0 & a % 5 == 0){
            System.out.println(a + " is Divisible by both");
        }
        
        else{
            System.out.println("Error 404");
        }

        Sc.close();
    }
}
