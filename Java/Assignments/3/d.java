import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Result(0-100) : ");
        int Result = Sc.nextInt();
        if(Result > 95){
            System.out.println("O Grade");
        }
        else if(Result > 90){
            System.out.println("A+ Grade");
        }
        else if(Result > 80){
            System.out.println("A Grade");
        }
        else if(Result > 75){
            System.out.println("B+ Grade");
        }
        else if(Result > 60){
            System.out.println("B Grade");
        }
        else if(Result > 40){
            System.out.println("C Grade");
        }
        else if(Result > 35){
            System.out.println("D Grade");
        }
        else if(Result > 0){
            System.out.println("F Grade / Fail Zalay Laj Vatude");
        }
        else{
            System.out.println("Error 404");
        }
        Sc.close();
    }
}
