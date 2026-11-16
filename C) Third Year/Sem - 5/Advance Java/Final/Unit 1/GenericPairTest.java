class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class GenericPairTest {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "One");
        Pair<String, Double> p2 = new Pair<>("Pi", 3.14159);

        p1.display();
        p2.display();
    }
}