import java.io.*;

public class AutoboxingUnboxing {

    public static void main(String[] args) {

        Integer i = Integer.valueOf(10);

        int i1 = i;

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        Character C = 'a';

        char ch = C;

        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + C);
    }
}