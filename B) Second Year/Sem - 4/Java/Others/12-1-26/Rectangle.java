//Write a program that takes the length and width of a rectangle, calculates both the
//rea and perimeter, and prints the results.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Length: ");
            int length = sc.nextInt();

            System.out.println("Enter Width: ");
            int width = sc.nextInt();

            int Area = length*width;
            System.out.println("Area : "+Area);

            int Peri = 2 * (length+width);
            System.out.println("Perimeter : "+Peri);
        }
    }    
}
