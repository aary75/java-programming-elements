import java.util.Scanner;

// Create the class HeightConverter to calculate the height in feet and inches
public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the height in centimeters
        double heightCm;

        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble(); // Read the height in centimeters

        // Conversion constants
        final double CM_TO_INCHES = 2.54;   // 1 inch = 2.54 cm
        final double INCHES_IN_FOOT = 12;   // 1 foot = 12 inches

        // Convert height in centimeters to inches
        double heightInInches = heightCm / CM_TO_INCHES;

        // Convert height in inches to feet and remaining inches
        int feet = (int) (heightInInches / INCHES_IN_FOOT); // Get the number of whole feet
        int inches = (int) (heightInInches % INCHES_IN_FOOT); // Get the remaining inches

        // Display the result
        System.out.printf("Your height in cm is %.2f while in feet is %d feet and %d inches.%n", heightCm, feet, inches);

      
    }
}
