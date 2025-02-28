
// importing Scanner class
import java.util.Scanner;

// Create a class KmToMilesConverter to convert distance from Km to miles
public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the distance in kilometers
        double km;

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble(); // Read user input

        // Convert kilometers to miles using the formula: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);

        // Close the scanner object
        input.close();
    }
}
