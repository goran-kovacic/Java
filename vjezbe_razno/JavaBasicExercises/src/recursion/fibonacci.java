package recursion;

public class fibonacci {
    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {0, 1, 2, 5, 10, 15};
        for (int number : testNumbers) {
            System.out.printf("F(%d) = %d%n", number, fibonacci(number));
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci number is not defined for negative numbers.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
