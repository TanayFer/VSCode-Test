public class Factorial{
    public static void main(String[] args) {
        int a = 5;
        int Fact=1;
        for(int i=1; i <= a ; i++){
            Fact = Fact * i;
        }        
        System.out.println("Factorial : "+Fact);
    }
} 
