package strings;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex string: ");
        String input = scanner.nextLine();

        if (isValidHexString(input)) {
            System.out.println("\"" + input + "\"" + " is a hex string");
        } else {
            System.out.println("\"" + input + "\"" + " is NOT a hex string");
        }
    }

    public static boolean isValidHexString(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        input = input.toUpperCase(); 

        for (char c : input.toCharArray()) {
            if (!isValidHexChar(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidHexChar(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F');
    }
}
