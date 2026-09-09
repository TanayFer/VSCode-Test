import java.util.Scanner;

public class Movie {
    static class MovieDetails {
        String title;
        String director;
        int duration;

        MovieDetails(String title, String director, int duration) {
            this.title = title;
            this.director = director;
            this.duration = duration;
        }

        void displayDetails() {
            String type = duration <= 120 ? "Short" : "Long";
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Type: " + type + " movie");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie title: ");
        String title = sc.nextLine();

        System.out.print("Enter director name: ");
        String director = sc.nextLine();

        System.out.print("Enter duration (in minutes): ");
        int duration = sc.nextInt();

        MovieDetails movie = new MovieDetails(title, director, duration);
        movie.displayDetails();

        sc.close();
    }
}