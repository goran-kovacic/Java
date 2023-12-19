package decisionAndLoop;

public class HarmonicSum {

	public static void main(String[] args) {

		final int MAX_DENOMINATOR = 5000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;

		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {

			sumL2R += 1.0 / denominator;

		}

		System.out.println("The sum from left-to-right is: " + sumL2R);

		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {

			sumR2L += (double) 1 / denominator;

		}

		System.out.println("The sum from right to left is: " + sumR2L);

		absDiff = Math.abs(sumR2L - sumR2L);

		System.out.println(absDiff);

	}

}
