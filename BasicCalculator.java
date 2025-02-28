import java.util.Scanner;

// Create the  class BasicCalculator to perform calculator functions
public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store the two numbers
        double number1, number2;

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble(); // Read the second number

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : Double.POSITIVE_INFINITY; // Handle division by zero

        // Display the results
        System.out.printf("The addition, subtraction, multiplication and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                          number1, number2, addition, subtraction, multiplication, division);

   
    }
}
