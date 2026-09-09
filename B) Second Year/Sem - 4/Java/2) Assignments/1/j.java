public class j {
    public static void main(String[] args) {
        // Integer to Float conversion
        int intValue = 42;
        float floatValue = (float) intValue;
        
        System.out.println("Integer to Float:");
        System.out.println("Before: " + intValue + " (int)");
        System.out.println("After: " + floatValue + " (float)");
        
        System.out.println();
        
        // Double to Integer conversion
        double doubleValue = 3.14;
        int intValue2 = (int) doubleValue;
        
        System.out.println("Double to Integer:");
        System.out.println("Before: " + doubleValue + " (double)");
        System.out.println("After: " + intValue2 + " (int)");
    }
}