package strings;

import java.util.Scanner;

public class ExchangeCypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to be encrypted:");
        String input = scanner.nextLine();

        String encryptedText = exchangeCypher(input);

        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();
    }

    public static String exchangeCypher(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (Character.isLowerCase(chars[i])) {
                    chars[i] = (char) ('a' + ('z' - chars[i]));
                } else {
                    chars[i] = (char) ('A' + ('Z' - chars[i]));
                }
            }
        }
        return new String(chars).toUpperCase();
    }
}
