import java.util.Scanner;
public class i {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Income : ");
        int INC = Sc.nextInt();

        if(INC < 250000){
            System.out.println("No Tax");
        }
        else if(INC > 250000 && INC < 500000){
            System.out.println("Tax : 5%");
            int Tax = (INC * 5) / 100;
            System.out.println(Tax);
        }
        else if(INC > 500001 && INC < 1000000){
            System.out.println("Tax : 20%");
            int Tax = (INC * 20) / 100;
            System.out.println(Tax);
        }
        else if(INC > 1000000){
            System.out.println("Tax : 30%");
            int Tax = (INC * 30) / 100;
            System.out.println(Tax);
        }
        else{
            System.err.println("Error 404");
        }

        Sc.close();
    }
}
