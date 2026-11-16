import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCountUtility {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Create sample file
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("Practicing Java File Handling for Practical Exams.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Count characters
        int count = 0;
        try (FileReader fr = new FileReader(filename)) {
            while (fr.read() != -1) {
                count++;
            }
            System.out.println("Total characters in file: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}