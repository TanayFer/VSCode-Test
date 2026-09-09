public class h {
    public static void main(String[] args) {
        int age = 25;
        int salary = 30000;
        int experience = 2;
        
        boolean eligible = age >= 21 && salary >= 20000 && experience >= 1;
        
        if (eligible) {
            System.out.println("Candidate is eligible");
        } else {
            System.out.println("Candidate is not eligible");
        }
    }
}