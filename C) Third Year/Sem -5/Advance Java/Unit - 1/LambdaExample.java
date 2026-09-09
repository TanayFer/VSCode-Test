interface Add {

    int addition(int a, int b);
}
public class LambdaExample {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;

        int result = add.addition(10, 20);
        System.out.println("Sum: " + result);
    }
}