package methods;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;


        // Loop to prompt user for input
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scanner.nextInt();

            // Check for termination condition
            if (number == -1) {
                break;
            }

            // Check if the number contains the digit 8 and add to sum if true
            if (hasEight.hasEight(number)) {
                sum += number;
            }
        }
        scanner.close();

        // Print the result
        System.out.println("The magic sum is: " + sum);
    }
}
