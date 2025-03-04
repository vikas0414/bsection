import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Add the two numbers
        double sum = num1 + num2;

        // Output the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner object
        scanner.close();
    }
}

