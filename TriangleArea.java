import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input base and height in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();

        // Calculate the area in square centimeters
        double areaInCm2 = 0.5 * base * height;

        // Convert area from square centimeters to square inches
        double areaInInch2 = areaInCm2 / (2.54 * 2.54);

        // Output the results
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaInInch2, areaInCm2);

        // Close the scanner
        scanner.close();
    }
}
