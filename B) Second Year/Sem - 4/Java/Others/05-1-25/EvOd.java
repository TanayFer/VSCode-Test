public class EvOd {
    public static void main(String[] args) {
        int number = 10;
        EvenOdd(number);
    }

    public static void EvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
