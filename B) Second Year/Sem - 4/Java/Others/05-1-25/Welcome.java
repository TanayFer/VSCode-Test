public class Welcome {
    public Welcome() {}

    public void displayDetails() {
        System.out.println("Hello World, Welcome to Java Program");
    }

    public static void main(String[] args) {
        Welcome MSG = new Welcome();
        MSG.displayDetails();
    }
}