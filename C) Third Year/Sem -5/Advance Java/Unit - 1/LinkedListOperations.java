import java.util.*;

public class LinkedListOperations {

    public static void main(String[] args) {

        // Creating a LinkedList of String type
        LinkedList<String> list = new LinkedList<>();

        // 1. Adding Elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Original List : " + list);

        // Adding an element at a specific index
        list.add(1, "HTML");
        System.out.println("After Adding HTML at index 1 : " + list);

        // 2. Updating an Element
        list.set(2, "JavaScript");
        System.out.println("After Updating index 2 : " + list);

        // 3. Removing Elements

        // Remove by index
        list.remove(0);
        System.out.println("After Removing element at index 0 : " + list);

        // Remove by value
        list.remove("C++");
        System.out.println("After Removing C++ : " + list);

        // 4. Iterating the LinkedList

        System.out.println("\nUsing for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (String language : list) {
            System.out.println(language);
        }
    }
}


O/p
Original List : [Java, Python, C++]
After Adding HTML at index 1 : [Java, HTML, Python, C++]
After Updating index 2 : [Java, HTML, JavaScript, C++]
After Removing element at index 0 : [HTML, JavaScript, C++]
After Removing C++ : [HTML, JavaScript]

Using for loop:
HTML
JavaScript

Using for-each loop:
HTML
JavaScript