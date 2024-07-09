package strings;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Octal string: ");
        String octalString = scanner.nextLine();

        try {
            int decimalValue = octalToDecimal(octalString);
            System.out.println("The equivalent decimal number for octal \"" + octalString + "\" is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid octal string \"" + octalString + "\"");
        }
    }

    public static int octalToDecimal(String octalString) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < octalString.length(); i++) {
            char octalChar = octalString.charAt(i);
            int digitValue = octalCharToDec(octalChar);
            decimalValue = decimalValue * 8 + digitValue;
        }
        return decimalValue;
    }

    private static int octalCharToDec(char octalChar) throws NumberFormatException {
        if (octalChar >= '0' && octalChar <= '7') {
            return octalChar - '0';
        } else {
            throw new NumberFormatException("Invalid octal character: " + octalChar);
        }
    }
}
