import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create a List
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Apple");
        list.add(1, "Banana");

        System.out.println("After Adding Elements: " + list);

        // Update an element
        list.set(1, "Orange");
        System.out.println("After set(): " + list);

        // Access elements
        System.out.println("\nAccessing Elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Check if an element exists
        System.out.println("\nContains 'Apple'? " + list.contains("Apple"));

        // Find first and last occurrence
        System.out.println("First index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // Remove by index
        list.remove(1);
        System.out.println("\nAfter remove(index): " + list);

        // Remove by object
        list.remove("Apple");   // Removes first occurrence
        System.out.println("After remove(object): " + list);

        // Add more elements for iteration
        list.add("Mango");
        list.add("Grapes");

        // Iterate using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Iterate using for-each loop
        System.out.println("\n\nUsing for-each loop:");
        for (String item : list) {
            System.out.print(item + " ");
        }
    }
}