import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryManagement {
    private List<String> bookList = new ArrayList<>();
    private Set<String> uniqueBooks = new HashSet<>();

    public void addBook(String title) {
        bookList.add(title);
        uniqueBooks.add(title);
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        if (bookList.remove(title)) {
            uniqueBooks.remove(title);
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBooks() {
        System.out.println("All Books (with duplicates allowed in list): " + bookList);
        System.out.println("Unique Books (via HashSet): " + uniqueBooks);
    }

    public static void main(String[] args) {
        LibraryManagement lib = new LibraryManagement();
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.addBook("Java Programming"); // Duplicate
        lib.displayBooks();
    }
}