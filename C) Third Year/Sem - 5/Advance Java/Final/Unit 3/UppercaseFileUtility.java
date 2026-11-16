import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UppercaseFileUtility {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        // Create a dummy input file for testing
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("hello java file handling world");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read, convert, and write
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destFile)) {
            
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(Character.toUpperCase((char) ch));
            }
            System.out.println("File successfully converted to uppercase.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}