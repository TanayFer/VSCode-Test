import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {

        // ===================================================
        // 1. Adding Elements
        // ===================================================
        System.out.println("1. Adding Elements");

        NavigableSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("For");
        ts.add("Mango");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        System.out.println("TreeSet after adding elements:");
        System.out.println(ts);

        // ===================================================
        // 2. Accessing Elements
        // ===================================================
        System.out.println("\n2. Accessing Elements");

        String check = "Mango";

        System.out.println("Contains \"" + check + "\" : " + ts.contains(check));
        System.out.println("First Element : " + ts.first());
        System.out.println("Last Element  : " + ts.last());

        String value = "Apple";
        System.out.println("Higher than \"" + value + "\" : " + ts.higher(value));
        System.out.println("Lower than \"" + value + "\"  : " + ts.lower(value));

        // ===================================================
        // 3. Removing Elements
        // ===================================================
        System.out.println("\n3. Removing Elements");

        System.out.println("Original TreeSet : " + ts);

        ts.remove("B");
        System.out.println("After removing 'B' : " + ts);

        ts.pollFirst();
        System.out.println("After removing first element : " + ts);

        ts.pollLast();
        System.out.println("After removing last element : " + ts);

        // ===================================================
        // 4. Iterating TreeSet
        // ===================================================
        System.out.println("\n4. Iterating TreeSet");

        for (String s : ts) {
            System.out.print(s + " ");
        }

        System.out.println();

        // ===================================================
        // 5. TreeSet with Custom Objects (StringBuffer)
        // ===================================================
        System.out.println("\n\n5. TreeSet with Custom Objects");

        Set<StringBuffer> customSet = new TreeSet<>(new Comparator<StringBuffer>() {
            @Override
            public int compare(StringBuffer sb1, StringBuffer sb2) {
                return sb1.toString().compareTo(sb2.toString());
            }
        });

        customSet.add(new StringBuffer("Apple"));
        customSet.add(new StringBuffer("Zebra"));
        customSet.add(new StringBuffer("Lion"));
        customSet.add(new StringBuffer("Ball"));
        customSet.add(new StringBuffer("Orange"));
        customSet.add(new StringBuffer("1"));

        System.out.println("Custom TreeSet:");
        System.out.println(customSet);
    }
}