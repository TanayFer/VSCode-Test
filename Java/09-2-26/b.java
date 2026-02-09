import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int Days = Inp.nextInt();
        if((Days % 4 == 0 && Days % 100 != 0) || (Days % 400 == 0)){
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
        Inp.close();
    }
}
