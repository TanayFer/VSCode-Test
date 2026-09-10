import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // ==========================================
        // 1. Adding Elements
        // ==========================================
        System.out.println("1. Adding Elements");

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Mango");
        hm.put(4, "Orange");

        System.out.println("HashMap : " + hm);

        // ==========================================
        // 2. Accessing Elements
        // ==========================================
        System.out.println("\n2. Accessing Elements");

        System.out.println("Value for key 1 : " + hm.get(1));
        System.out.println("Value for key 3 : " + hm.get(3));

        // ==========================================
        // 3. Updating (Changing) Elements
        // ==========================================
        System.out.println("\n3. Updating Elements");

        System.out.println("Before Update : " + hm);

        hm.put(2, "Grapes"); // Replace Banana with Grapes

        System.out.println("After Update : " + hm);

        // ==========================================
        // 4. Removing Elements
        // ==========================================
        System.out.println("\n4. Removing Elements");

        hm.remove(4);

        System.out.println("After Removing key 4 : " + hm);

        // ==========================================
        // 5. Traversing the HashMap
        // ==========================================
        System.out.println("\n5. Traversing HashMap");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + "  Value : " + entry.getValue());
        }
    }
}