package methods;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int guess;
        int trials = 0;
        boolean guessed = false;

        System.out.println("Key in your guess:");

        while (!guessed) {
            guess = scanner.nextInt();
            trials++;

            if (guess < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else if (guess > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                guessed = true;
                System.out.printf("You got it in %d trials!%n", trials);
            }
        }

        scanner.close();
    }
}
