import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        // Perform the integer operations considering operator precedence
        int result1 = a + b * c;  // a + (b * c) -> multiplication has higher precedence
        int result2 = a * b + c;  // (a * b) + c -> multiplication has higher precedence
        int result3 = c + a / b;  // c + (a / b) -> division has higher precedence
        int result4 = a % b + c;  // (a % b) + c -> modulus has higher precedence

        // Output the results of the integer operations
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}
