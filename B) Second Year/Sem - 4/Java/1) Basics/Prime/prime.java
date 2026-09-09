package Prime;

public class prime {
    public static void main(String[] args) {
        int no = 17;
        int cntr = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                cntr++;
            }
        }
        if (cntr == 2) {
            System.out.println(no + " is Prime");
        } else {
            System.out.println(no + " is not Prime");
        }
    }
}
