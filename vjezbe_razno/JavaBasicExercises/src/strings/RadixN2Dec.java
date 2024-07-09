package strings;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        if (radix < 2 || radix > 16) {
            System.out.println("error: invalid radix \"" + radix + "\". Radix must be between 2 and 16.");
            return;
        }

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        if (isValidRadixString(inputString, radix)) {
            int decimal = convertRadixToDecimal(inputString, radix);
            System.out.println("The equivalent decimal number for radix " + radix + " string \"" + inputString + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid string \"" + inputString + "\" for radix " + radix);
        }
    }

    // Method to check if a string is valid for a given radix
    private static boolean isValidRadixString(String inputString, int radix) {
        for (char c : inputString.toCharArray()) {
            if (Character.digit(c, radix) == -1) {
                return false;
            }
        }
        return true;
    }

    // Method to convert a string of a given radix to a decimal number
    private static int convertRadixToDecimal(String inputString, int radix) {
        return Integer.parseInt(inputString, radix);
    }
}
