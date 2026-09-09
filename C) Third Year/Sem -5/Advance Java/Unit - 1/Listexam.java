import java.util.*;

class Listexam {

    public static void main(String[] args)
    {
        // Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");

        System.out.println("Elements of List are:");

        // Iterating through the list
        for (String s : li) {
            System.out.println(s);
        }

}
}

Output
Elements of List are:
Java
Python
DSA
C++