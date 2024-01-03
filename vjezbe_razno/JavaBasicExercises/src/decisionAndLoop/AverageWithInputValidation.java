package decisionAndLoop;

import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {

		final int NUM_STUDENTS = 3;

		int n;
		boolean isValid;
		int sum = 0;
		double average;
		Scanner s = new Scanner(System.in);

		for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {

			isValid = false;
			do {
				System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
				n = s.nextInt();
				
				if(n>=0 && n<=100) {
					isValid=true;
				}else {
					System.out.println("invalid input");
				}
				
			} while (!isValid);
			
			sum+=n;

		}
		
		average= (double) sum/NUM_STUDENTS;
		System.out.printf("The average is: %.2f ", average );

	}

}
