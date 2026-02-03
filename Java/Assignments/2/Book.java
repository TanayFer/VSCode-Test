import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }
    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        
        Book book = new Book(title, author, price);
        book.applyDiscount(discount);
        
        System.out.println("\nUpdated Book Details:");
        book.display();
        
        sc.close();
    }
}