import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of items to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the total price
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);

        
    }
}
