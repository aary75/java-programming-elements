
import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the number of handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

      
    }
}
