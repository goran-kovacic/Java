package decisionAndLoop;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {

		int n, digit, sum=0;

		System.out.print("Input a positive integer: ");

		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();

		System.out.print("The reverse is: ");

		while (n > 0) {
			digit = n % 10;
			sum+=digit;
			System.out.print(digit);
			n = n / 10;
		}
		
		System.out.println("\nSum is: " + sum);

	}

}
