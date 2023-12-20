package decisionAndLoop;

public class ComputePI {

	public static void main(String[] args) {

		double sum = 0.0;
		int max_denominator = 1000000;

		for (int denominator = 1; denominator <= max_denominator; denominator += 2) {

			if (denominator % 4 == 1) {
				sum+= 1.0 / denominator;
			} else if (denominator % 4 == 3) {
				sum-= 1.0 / denominator;
			} else {
				System.out.println("impossible");
			}
		}

		System.out.println("pi = " + sum * 4);
		System.out.println("piComputed / Math.PI = " + ((sum * 4) / Math.PI) * 100);

		int max_term = 1000000;
		double sum2 = 0.0;

		for (int term = 1; term <= max_term; term++) {

			if (term % 2 == 1) {
				sum2+= 1.0 / (term * 2 - 1);
			} else {
				sum2-= 1.0 / (term * 2 - 1);
			}

		}

		System.out.println("pi = " + sum2 * 4);
		System.out.println("piComputed / Math.PI = " + ((sum2 * 4) / Math.PI) * 100);

	}

}
