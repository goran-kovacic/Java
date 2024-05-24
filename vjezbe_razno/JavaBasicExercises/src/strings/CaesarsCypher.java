package strings;

import java.util.Scanner;

public class CaesarsCypher {
	
	// Method to encrypt the input string using Caesar Cipher
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
	
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the input string
        System.out.println("Enter the text to be encrypted:");
        String input = scanner.nextLine();

        // Ask the user for the shift value
        System.out.println("Enter the shift value:");
        int shift = scanner.nextInt();

        // Encrypt the input string
        String encryptedText = encrypt(input, shift);

        // Print the encrypted string
        System.out.println("Encrypted text: " + encryptedText);

        // Close the scanner
        scanner.close();
    }

}
