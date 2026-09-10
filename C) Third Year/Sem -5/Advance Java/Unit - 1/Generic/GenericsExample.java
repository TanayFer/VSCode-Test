class SimpleBox<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        SimpleBox<String> stringBox = new SimpleBox<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        SimpleBox<Integer> intBox = new SimpleBox<>();
        intBox.set(50);
        System.out.println("Value: " + intBox.get());
    }
}