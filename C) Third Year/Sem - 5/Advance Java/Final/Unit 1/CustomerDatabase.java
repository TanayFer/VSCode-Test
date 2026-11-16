import java.util.HashMap;
import java.util.Map;

public class CustomerDatabase {
    private Map<Integer, String> customers = new HashMap<>();

    public void addCustomer(int id, String name) {
        customers.put(id, name);
        System.out.println("Added customer: " + name);
    }

    public void searchCustomer(int id) {
        if (customers.containsKey(id)) {
            System.out.println("Found Customer ID " + id + ": " + customers.get(id));
        } else {
            System.out.println("Customer ID not found.");
        }
    }

    public void updateCustomer(int id, String newName) {
        if (customers.containsKey(id)) {
            customers.put(id, newName);
            System.out.println("Updated Customer ID " + id + " to " + newName);
        } else {
            System.out.println("Customer ID does not exist.");
        }
    }

    public void displayAll() {
        System.out.println("Customer Database:");
        for (Map.Entry<Integer, String> entry : customers.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        CustomerDatabase db = new CustomerDatabase();
        db.addCustomer(101, "Alice");
        db.addCustomer(102, "Bob");
        db.searchCustomer(101);
        db.updateCustomer(101, "Alice Smith");
        db.displayAll();
    }
}