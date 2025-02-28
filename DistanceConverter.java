

import java.util.Scanner;

// Create a class DistanceConverter to convert  distance from feet to yards and miles
public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the distance in feet
        double distanceInFeet;

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble(); // Read the distance in feet

        // Convert the distance from feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance from yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Display the results
        System.out.printf("The distance in yards is %.2f yards and in miles is %.4f miles for the given %.2f feet.%n", 
                          distanceInYards, distanceInMiles, distanceInFeet);

       
    }
}
