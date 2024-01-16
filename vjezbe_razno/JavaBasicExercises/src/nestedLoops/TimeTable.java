package nestedLoops;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		n = s.nextInt();

		while (n <= 0) {
			System.out.println("input must be a positive integer");
			System.out.print("Enter size: ");
			n = s.nextInt();
		}

		System.out.print(" * |");

		for (int a = 1; a <= n; a++) {
			System.out.printf("%4d", a);
		}

		System.out.println();

		for (int b = 1; b <= n + 1; b++) {
			System.out.print("----");
		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			if (i >= 10) {
				System.out.print(" " + i + "|");
			} else {
				System.out.print(" " + i + " |");
			}
			for (int j = 1; j <= n; j++) {
				System.out.printf("%4d", i * j);
				if (j == n) {
					System.out.println();
				}
			}
		}

	}

}
