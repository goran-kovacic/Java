package strings;

import java.util.Scanner;

public class CheckBinStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String input = scanner.nextLine();  

        if(isBinaryString(input)) {
            System.out.println("The word is a binary string");
        } else {
            System.out.println("The word is not a binary string");
        }

        scanner.close();
        
    }


    public static boolean isBinaryString(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '0' && word.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
