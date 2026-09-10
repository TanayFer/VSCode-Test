import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println("1. Adding Elements");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("E");

        System.out.println("HashSet after adding elements: " + set);

        System.out.println("\n2. Accessing Elements");
        String search = "D";

        if (set.contains(search)) {
            System.out.println(search + " is present in the HashSet.");
        } else {
            System.out.println(search + " is not present in the HashSet.");
        }

        System.out.println("\n3. Removing Elements");
        System.out.println("Before removing: " + set);

        set.remove("B");

        System.out.println("After removing 'B': " + set);

        System.out.println("\n4. Iterating Through HashSet");

        for (String value : set) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}