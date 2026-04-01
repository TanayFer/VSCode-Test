import java.util.Scanner;
public class Teacher {
    public String name;
    public String subject;
    public int experienceYears;

    public Teacher(String name, String subject, int experienceYears) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public boolean isSenior() {
        return experienceYears > 10;
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();

        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter experience years: ");
        int experienceYears = scanner.nextInt();

        Teacher teacher = new Teacher(name, subject, experienceYears);

        System.out.println("Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Experience (Years): " + teacher.getExperienceYears());
        System.out.println("Senior Teacher: " + teacher.isSenior());

        scanner.close();
    }
}