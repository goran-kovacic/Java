package decisionAndLoop;

public class Product1ToN {

	public static void main(String[] args) {

		System.out.println(factorial(19));

		long product = 1; // The accumulated product, init to 1
		int LOWERBOUND = 1;
		final int UPPERBOUND = 19;

		while (LOWERBOUND <= UPPERBOUND) {

			product = product * LOWERBOUND;
			LOWERBOUND++;

		}

		System.out.println(product);

	}

	public static long factorial(int number) {

		if (number <= 0 || number == 1) {
			return 1;
		}

		return number * factorial(number - 1);

	}

}
