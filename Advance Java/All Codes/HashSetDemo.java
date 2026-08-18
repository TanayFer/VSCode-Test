import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        // ==========================================
        // 1. Adding Elements
        // ==========================================
        System.out.println("1. Adding Elements");

        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("For");
        hs.add("Mango");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
        hs.add("Apple");   // Duplicate element (ignored)

        System.out.println("HashSet : " + hs);

        // ==========================================
        // 2. Removing Elements
        // ==========================================
        System.out.println("\n2. Removing Elements");

        hs.remove("B");
        System.out.println("After removing 'B' : " + hs);

        // Trying to remove B again
        System.out.println("B exists in Set : " + hs.remove("B"));

        // ==========================================
        // 3. Iterating Using Iterator
        // ==========================================
        System.out.println("\n3. Iterating using Iterator");

        Iterator<String> iterator = hs.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ==========================================
        // 4. Iterating Using Enhanced For Loop
        // ==========================================
        System.out.println("\n\n4. Iterating using Enhanced For Loop");

        for (String element : hs) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}