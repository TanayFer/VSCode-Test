import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

public class MultipleObjectSerialization {
    public static void main(String[] args) {
        String file = "students.ser";
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        // Writing list of objects
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(students);
            System.out.println("Multiple student objects serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading list of objects
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            @SuppressWarnings("unchecked")
            List<Student> deserializedList = (List<Student>) ois.readObject();
            System.out.println("Deserialized Students: " + deserializedList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}