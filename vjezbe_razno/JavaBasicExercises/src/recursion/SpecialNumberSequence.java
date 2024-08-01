package recursion;

public class SpecialNumberSequence {
    
    // Iterative method to compute the length of S(n)
    public static int lengthIterative(int n) {
        int length = 0;
        for (int i = 1; i <= n; i++) {
            length += numOfDigits(i);
        }
        return length;
    }
    
    // Recursive method to compute the length of S(n)
    public static int lengthRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return lengthRecursive(n - 1) + numOfDigits(n);
        }
    }

    // Helper method to count the number of digits in a number
    public static int numOfDigits(int n) {
        return Integer.toString(n).length();
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Length of S(" + n + ") recursively: " + lengthRecursive(n));
        System.out.println("Length of S(" + n + ") iteratively: " + lengthIterative(n));
    }
}
