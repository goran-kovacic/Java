package recursion;

public class factorial {
    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 10};
        for (int number : testNumbers) {
            System.out.printf("factorial(%d) = %d%n", number, factorial(number));
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
