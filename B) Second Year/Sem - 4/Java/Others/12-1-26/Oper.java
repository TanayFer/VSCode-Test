//Write a program to demonstrate the use of increment and decrement operators by
//applying both prefix and postfix operations on a number and printing the results.

public class Oper {
    public static void main(String[] args) {
        System.out.println("---------Prefix---------");
        for(int i=1; i<6; ++i){
            System.out.println("No: "+i);
        }

        System.out.println("---------Postfix---------");
        for(int i=1; i<6; i++){
            System.out.println("No: "+i);
        }
    }
}
