import java.io.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [ID=" + bookId + ", Title=" + title + ", Price=" + price + "]";
    }
}

public class BookSerializationTest {
    public static void main(String[] args) {
        String file = "book.ser";

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            Book book = new Book(402, "Effective Java", 45.99);
            oos.writeObject(book);
            System.out.println("Book serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Book deserializedBook = (Book) ois.readObject();
            System.out.println("Deserialized " + deserializedBook);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}