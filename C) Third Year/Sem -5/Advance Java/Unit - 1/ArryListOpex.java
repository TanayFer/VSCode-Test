import java.util.*;

class ArrayListOpex {

    public static void main(String args[]) {

        // Creating an ArrayList of String type
        ArrayList<String> al = new ArrayList<>();

        // 1. Adding elements to ArrayList at the end
        al.add("Java");
        al.add("Programming");

        System.out.println("Original List : " + al);

        // Adding element at a specific index
        al.add(1, "ArrayList");

        System.out.println("After adding element at index 1 : " + al);

        // 2. Removing element using index
        al.remove(0);

        System.out.println("Element removed from index 0 : " + al);

        // Removing element using value
        al.remove("Programming");

        System.out.println("Element 'Programming' removed : " + al);

        // 3. Updating value at index 0
        al.set(0, "ArrayListOperations");

        System.out.println("List after updating value : " + al);
    }
}