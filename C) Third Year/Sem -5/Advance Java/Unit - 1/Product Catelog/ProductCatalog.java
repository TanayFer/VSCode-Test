import java.util.HashMap;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {

        HashMap<Integer, String> products = new HashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Mobile");
        products.put(103, "Keyboard");
        products.put(104, "Mouse");
        products.put(105, "Monitor");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();

        if (products.containsKey(id)) {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + products.get(id));
        } else {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}