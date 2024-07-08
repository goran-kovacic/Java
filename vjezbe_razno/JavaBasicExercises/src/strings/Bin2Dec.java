package strings;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binaryString = scanner.nextLine();
        scanner.close();

        if (isValidBinary(binaryString)) {
            int decimal = convertBinaryToDecimal(binaryString);
            System.out.println("The equivalent decimal number for binary \"" + binaryString + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid binary string \"" + binaryString + "\"");
        }
    }

    // Method to check if a string is a valid binary number
    private static boolean isValidBinary(String binaryString) {
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    // Method to convert a binary string to a decimal number
    private static int convertBinaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
}
