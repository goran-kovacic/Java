package strings;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = scanner.nextLine();
        scanner.close();

        if (isValidHexadecimal(hexString)) {
            int decimal = convertHexToDecimal(hexString);
            System.out.println("The equivalent decimal number for hexadecimal \"" + hexString + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid hexadecimal string \"" + hexString + "\"");
        }
    }

    // Method to check if a string is a valid hexadecimal number
    private static boolean isValidHexadecimal(String hexString) {
        for (char c : hexString.toCharArray()) {
            if (!((c >= '0' && c <= '9') || 
                  (c >= 'a' && c <= 'f') || 
                  (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    // Method to convert a hexadecimal string to a decimal number
    private static int convertHexToDecimal(String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}
