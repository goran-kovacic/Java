package nestedLoops;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");

		n = s.nextInt();
		
		while(n<=0) {
			System.out.println("input must be a positive integer");
			System.out.print("Enter size: ");
			n = s.nextInt();
		}

		for (int row = 1; row <= n; row++) {
			for (int column = 1; column <= n; column++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
