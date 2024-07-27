package methods;

import java.util.Scanner;

public class NumberConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input string and radixes
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();
        scanner.close();

        // Convert the number and display the result
        String convertedNumber = toRadix(number, inRadix, outRadix);
        System.out.printf("\"%s\" in radix %d is \"%s\" in radix %d.%n", number, inRadix, convertedNumber, outRadix);
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        // Parse the input string as an integer of the specified input radix
        int decimalValue = Integer.parseInt(in, inRadix);

        // Convert the decimal integer to the specified output radix and return the result
        return Integer.toString(decimalValue, outRadix).toUpperCase();
    }
}


