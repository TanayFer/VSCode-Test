import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    transient String password; // Will not be serialized

    public Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class TransientSerializationTest {
    public static void main(String[] args) {
        String filename = "emp.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Employee emp = new Employee(101, "John Doe", "secret123");
            out.writeObject(emp);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee emp = (Employee) in.readObject();
            System.out.println("Deserialized ID: " + emp.id);
            System.out.println("Deserialized Name: " + emp.name);
            System.out.println("Deserialized Password (transient returns null): " + emp.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}