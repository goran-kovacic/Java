package methods;

public class FibonacciInt {
    public static void main(String[] args) {
        // Define the range limits for a 32-bit signed integer
        final int MAX_INT = Integer.MAX_VALUE;
        final int MIN_INT = Integer.MIN_VALUE;

        // Initialize the first two Fibonacci numbers
        int f0 = 1;
        int f1 = 1;

        // Print the first two Fibonacci numbers
        System.out.println("F(0) = " + f0);
        System.out.println("F(1) = " + f1);

        // Variables to store the next Fibonacci number and its index
        int fn = 0;
        int n = 2;

        // Generate and print Fibonacci numbers until the next one would overflow
        while (true) {
            // Calculate the next Fibonacci number
            fn = f0 + f1;

            // Check if the next Fibonacci number is within the valid range
            if (fn < 0 || fn > MAX_INT || fn < MIN_INT) {
                // If the number is out of range, print the message and exit the loop
                System.out.println("F(" + n + ") is out of the range of int");
                break;
            }

            // Print the current Fibonacci number
            System.out.println("F(" + n + ") = " + fn);

            // Move to the next Fibonacci number
            f0 = f1;
            f1 = fn;
            n++;
        }
    }
}
