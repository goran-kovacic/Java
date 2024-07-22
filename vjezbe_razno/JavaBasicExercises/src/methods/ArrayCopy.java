package methods;

public class ArrayCopy {
    public static void main(String[] args) {
        // Test arrays
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] multipleElementArray = {1, 2, 3, 4, 5};

        // Test cases
        System.out.println("Test with empty array:");
        printArray(copyOf(emptyArray)); // Should print []

        System.out.println("\nTest with one-element array:");
        printArray(copyOf(oneElementArray)); // Should print [5]

        System.out.println("\nTest with multiple-element array:");
        printArray(copyOf(multipleElementArray)); // Should print [1, 2, 3, 4, 5]

        // Check that the copied array is actually a new array
        int[] originalArray = {10, 20, 30};
        int[] copiedArray = copyOf(originalArray);
        System.out.println("\nTest that copied array is a new array:");
        originalArray[0] = 100;
        System.out.print("Original array: ");
        printArray(originalArray); // Should print [100, 20, 30]
        System.out.print("Copied array: ");
        printArray(copiedArray); // Should print [10, 20, 30]
    }

    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }

        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
