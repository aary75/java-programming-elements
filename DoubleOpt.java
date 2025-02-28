import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c as double
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Perform the double operations considering operator precedence
        double result1 = a + b * c;  // a + (b * c) -> multiplication has higher precedence
        double result2 = a * b + c;  // (a * b) + c -> multiplication has higher precedence
        double result3 = c + a / b;  // c + (a / b) -> division has higher precedence
        double result4 = a % b + c;  // (a % b) + c -> modulus has higher precedence

        // Output the results of the double operations
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}
