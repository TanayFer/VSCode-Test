//1]Write a program to declare variable of basic data types(int, float, char, double)
//	Accept values from the user and print the values
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int intVal = sc.nextInt();
            
            System.out.print("Enter a float: ");
            float floatVal = sc.nextFloat();
            
            System.out.print("Enter a character: ");
            char charVal = sc.next().charAt(0);
            
            System.out.print("Enter a double: ");
            double doubleVal = sc.nextDouble();
            
            System.out.println("\nValues entered:");
            System.out.println("Integer: " + intVal);
            System.out.println("Float: " + floatVal);
            System.out.println("Character: " + charVal);
            System.out.println("Double: " + doubleVal);
        }
    }
}