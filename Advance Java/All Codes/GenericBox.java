import java.util.Scanner;

// Generic class
class Box<T> {

    // Generic variable to store any type of data
    private T value;

    // Method to store value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to return value
    public T getValue() {
        return value;
    }
}

// Main class
public class GenericBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Generic Box for Integer
        Box<Integer> intBox = new Box<>();

        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        // Autoboxing: int → Integer
        intBox.setValue(num);

        // Unboxing: Integer → int
        int value = intBox.getValue();

        System.out.println("Integer Value: " + value);

        sc.nextLine(); // Consume newline

        // Generic Box for String
        Box<String> strBox = new Box<>();

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        strBox.setValue(text);

        System.out.println("String Value: " + strBox.getValue());

        sc.close();
    }
}