import java.io.*;

public class AutoboxingUnboxing {

    // Main driver method
    public static void main(String[] args) {

        // Creating an Integer object
        Integer i = Integer.valueOf(10);

        // Unboxing the object
        int i1 = i;

        // Print statements
        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        // Autoboxing of character
        Character C = 'a';

        // Auto-unboxing of Character
        char ch = C;

        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + C);
    }
}