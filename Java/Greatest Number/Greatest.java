public class Greatest {
    public static void main(String[] args) {
        int A = 50; 
        int B = 29;
        int C = 17;

        if(A > B && A > C){
            System.out.println(A + " is Greatest");
        }
        else if(B > A && B > C){
            System.out.println(B + " is Greatest");
        }
        else if(C > B && C > A){
            System.out.println(C + " is Greatest");
        }
        else{
            System.out.println("Error 404");
        }
    }
}
