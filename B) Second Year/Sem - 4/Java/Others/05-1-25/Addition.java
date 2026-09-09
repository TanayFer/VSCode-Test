public class Addition {
    int no1;
    int no2;

    public Addition() {}

    public void displayDetails() {
        System.out.println("Addition : " + (no1+no2));
    }

    public static void main(String[] args) {
        Addition main = new Addition();
        main.no1 = 10;
        main.no2 = 15;

        main.displayDetails();
    }
}