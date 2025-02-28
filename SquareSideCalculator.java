import java.util.Scanner;

// Create a class SquareSideCalculator to perimeter of square
public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for perimeter
        double perimeter;

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble(); // Read the perimeter

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f.%n", side, perimeter);

        // Close the scanner object
        input.close();
    }
}
