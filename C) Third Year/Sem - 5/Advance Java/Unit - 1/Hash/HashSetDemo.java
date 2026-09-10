import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        System.out.println("1. Adding Elements");

        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("For");
        hs.add("Mango");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
        hs.add("Apple");

        System.out.println("HashSet : " + hs);

        System.out.println("\n2. Removing Elements");

        hs.remove("B");
        System.out.println("After removing 'B' : " + hs);

        System.out.println("B exists in Set : " + hs.remove("B"));

        System.out.println("\n3. Iterating using Iterator");

        Iterator<String> iterator = hs.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n\n4. Iterating using Enhanced For Loop");

        for (String element : hs) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}