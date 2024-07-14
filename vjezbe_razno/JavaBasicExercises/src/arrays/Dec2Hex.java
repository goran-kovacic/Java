package arrays;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        if (decimalNumber >= 0) {
            String hexString = Integer.toHexString(decimalNumber).toUpperCase();
            System.out.println("The equivalent hexadecimal number is " + hexString);
        } else {
            System.out.println("error: invalid input. Please enter a positive decimal number.");
        }
    }
}
