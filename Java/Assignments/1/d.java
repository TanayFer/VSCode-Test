public class d {
    public static void main(String[] args) {
        int num = 5;
        
        System.out.println("Original number: " + num);
        
        // Prefix increment
        System.out.println("Prefix increment (++num): " + ++num);
        System.out.println("After prefix increment: " + num);
        
        // Postfix increment
        System.out.println("Postfix increment (num++): " + num++);
        System.out.println("After postfix increment: " + num);
        
        // Prefix decrement
        System.out.println("Prefix decrement (--num): " + --num);
        System.out.println("After prefix decrement: " + num);
        
        // Postfix decrement
        System.out.println("Postfix decrement (num--): " + num--);
        System.out.println("After postfix decrement: " + num);
    }
}