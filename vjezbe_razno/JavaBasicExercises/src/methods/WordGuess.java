package methods;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordGuess <word>");
            return;
        }

        String wordToGuess = args[0];
        boolean[] guessedPositions = new boolean[wordToGuess.length()];
        int trials = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String input = scanner.nextLine();
            trials++;

            if (input.length() == 1) {
                char guessedChar = input.charAt(0);
                boolean found = false;

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guessedChar) {
                        guessedPositions[i] = true;
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Character not found.");
                }

                System.out.print("Trial " + trials + ": ");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (guessedPositions[i]) {
                        System.out.print(wordToGuess.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();

            } else if (input.equals(wordToGuess)) {
                System.out.println("Congratulation!");
                System.out.println("You got it in " + trials + " trials");
                break;
            } else {
                System.out.println("Wrong guess. Try again.");
                System.out.print("Trial " + trials + ": ");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (guessedPositions[i]) {
                        System.out.print(wordToGuess.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
