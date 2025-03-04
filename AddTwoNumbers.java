import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Predefined numbers to be added
        double predefinedNum1 = 5.0;
        double predefinedNum2 = 3.5;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Add the two numbers entered by the user
        double userSum = num1 + num2;

        // Add the predefined numbers
        double totalSum = userSum + predefinedNum1 + predefinedNum2;

        // Output the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + userSum);
        System.out.println("Adding predefined numbers (" + predefinedNum1 + " and " + predefinedNum2 + ")");
        System.out.println("The total sum is: " + totalSum);

        // Close the scanner object
        scanner.close();
    }
}
