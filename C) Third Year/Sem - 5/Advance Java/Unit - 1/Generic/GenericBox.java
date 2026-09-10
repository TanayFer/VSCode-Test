import java.util.Scanner;

class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box<Integer> intBox = new Box<>();

        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        intBox.setValue(num);

        int value = intBox.getValue();

        System.out.println("Integer Value: " + value);

        sc.nextLine();

        Box<String> strBox = new Box<>();

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        strBox.setValue(text);

        System.out.println("String Value: " + strBox.getValue());

        sc.close();
    }
}