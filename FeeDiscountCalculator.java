import java.util.Scanner;

// Create a class FeeDiscountCalculator to calculate discount
public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store fee and discount percentage
        double fee, discountPercent, discountAmount, finalFee;

        // Prompt the user to enter the student fee
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble(); // Read user input for fee

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble(); // Read user input for discount percentage

        // Calculate the discount amount
        discountAmount = (discountPercent / 100) * fee;

        // Calculate the final fee to be paid after applying the discount
        finalFee = fee - discountAmount;

        // print the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discountAmount, finalFee);

    }
}
