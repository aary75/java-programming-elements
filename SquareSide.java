import java.util.Scanner;

// Create the class SquareSide to find the length of sides with the help of perimeter
public class SquareSide {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side length of the square
        double side = perimeter / 4;

        // Output the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

    }
}

