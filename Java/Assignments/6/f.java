//Design a class LibraryMember with memberId, name, and booksIssued. 
// Use a constructor to initialize values and a method to check if the member has reached the maximum limit of books (5 books).
import java.util.Scanner;

public class f {
    int memberId;
    String name;
    int booksIssued;

    public f(int memberId, String name, int booksIssued) {
        this.memberId = memberId;
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public boolean hasReachedMaxLimit() {
        return booksIssued >= 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of books issued: ");
        int booksIssued = scanner.nextInt();

        f member = new f(memberId, name, booksIssued);

        System.out.println("\nMember ID: " + member.memberId);
        System.out.println("Name: " + member.name);
        System.out.println("Books Issued: " + member.booksIssued);

        if (member.hasReachedMaxLimit()) {
            System.out.println("Member has reached the maximum limit of books.");
        } else {
            System.out.println("Member has not reached the maximum limit of books.");
        }

        scanner.close();
    }
}