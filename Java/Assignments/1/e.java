public class e {
    public static void main(String[] args) {
        // Swap using temporary variable
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap (with temp): a = " + a + ", b = " + b);
        
        // Swap without temporary variable
        a = 5;
        b = 10;
        System.out.println("\nBefore swap: a = " + a + ", b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swap (without temp): a = " + a + ", b = " + b);
    }
}