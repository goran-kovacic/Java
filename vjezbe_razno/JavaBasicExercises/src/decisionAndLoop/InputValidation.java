package decisionAndLoop;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {

		int n;
		boolean isValid = false;
		Scanner s = new Scanner(System.in);
		do {

			System.out.print("enter a number between 0-10 or 90-100: ");
			n = s.nextInt();
			if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
				isValid = true;
			} else {
				System.out.println("invalid input");
			}

		} while (!isValid);

	}

}
