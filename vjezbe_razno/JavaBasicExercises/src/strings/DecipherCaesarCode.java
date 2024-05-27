package strings;

import java.util.Scanner;

public class DecipherCaesarCode {
	
	// Method to decrypt the input string using Caesar Cipher
    public static String decrypt(String text, int shift) {
        // Since decryption is the reverse of encryption, we use the negative shift
        return encrypt(text, 26 - (shift % 26));
    }
    
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

        // Ask the user for the encrypted string
        System.out.println("Enter the text to be decrypted:");
        String input = scanner.nextLine();

        // Ask the user for the shift value
        System.out.println("Enter the shift value used for encryption:");
        int shift = scanner.nextInt();

        // Decrypt the input string
        String decryptedText = decrypt(input, shift);

        // Print the decrypted string
        System.out.println("Decrypted text: " + decryptedText);

        // Close the scanner
        scanner.close();
    }

}
