import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of items to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the total purchase price
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", 
                          totalPrice, quantity, unitPrice);

        // Close the scanner
        scanner.close();
    }
}
