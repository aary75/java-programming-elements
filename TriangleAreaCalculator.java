import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Declare variables for base and height
        double base, height;

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle (in cm): ");
        base = input.nextDouble(); // Read base value

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle (in cm): ");
        height = input.nextDouble(); // Read height value

        // Calculate the area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert area from square centimeters to square inches
        double areaInch2 = areaCm2 / 2.54 / 2.54; // 1 inch = 2.54 cm, so divide by 2.54 twice to get square inches

        // Display the results
        System.out.printf("The area of the triangle in square centimeters is %.2f cm² and in square inches is %.2f in².%n", areaCm2, areaInch2);

        
    }
}
