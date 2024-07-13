package arrays;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexString = scanner.nextLine();
        scanner.close();

        if (isValidHexadecimal(hexString)) {
            String binaryString = convertHexToBinary(hexString);
            System.out.println("The equivalent binary for hexadecimal \"" + hexString + "\" is: "
                    + formatBinaryString(binaryString));
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

    // Method to convert a hexadecimal string to a binary string
    private static String convertHexToBinary(String hexString) {
        StringBuilder binaryString = new StringBuilder();
        for (char c : hexString.toCharArray()) {
            int decimal = Integer.parseInt(String.valueOf(c), 16);
            String binary = Integer.toBinaryString(decimal);
            // Ensure each hex digit is represented by 4 binary digits
            while (binary.length() < 4) {
                binary = "0" + binary;
            }
            binaryString.append(binary);
        }
        return binaryString.toString();
    }

    // Method to format the binary string in groups of 4 bits separated by space
    private static String formatBinaryString(String binaryString) {
        StringBuilder formattedString = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 4) {
            if (i > 0) {
                formattedString.append(" ");
            }
            formattedString.append(binaryString, i, i + 4);
        }
        return formattedString.toString();
    }
}
