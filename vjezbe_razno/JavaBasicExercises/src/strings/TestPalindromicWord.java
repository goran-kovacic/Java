package strings;

import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String input = scanner.nextLine();

        if(isPalindromic(input)) {
            System.out.println("The word is palindromic");
        } else {
            System.out.println("The word is not palindromic");
        }

        scanner.close();
    }

    public static boolean isPalindromic(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
