package OddEvenZero;

public class EvenOdd {
    public static void main(String[] args) {
        int A = 10;
        System.out.println("-------Checking The Number---------");
        if(A == 0){
            System.out.println(A + " Is Zero");
        }
        else if(A % 2 == 0){
            System.out.println(A + " Is Even");
        }
        else{
            System.out.println(A + " Is Odd");
        }
    }    
}
