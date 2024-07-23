package methods;

public class Swap {
    public static void main(String[] args) {
        // Test arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8};
        int[] emptyArray1 = {};
        int[] emptyArray2 = {};

        // Test cases
        System.out.println("Test with equal length arrays:");
        System.out.println("Before swap:");
        printArray(array1); // Should print [1, 2, 3]
        printArray(array2); // Should print [4, 5, 6]
        boolean swapped = swap(array1, array2);
        System.out.println("Swapped: " + swapped); // Should print true
        System.out.println("After swap:");
        printArray(array1); // Should print [4, 5, 6]
        printArray(array2); // Should print [1, 2, 3]

        System.out.println("\nTest with different length arrays:");
        swapped = swap(array1, array3);
        System.out.println("Swapped: " + swapped); // Should print false
        printArray(array1); // Should print [4, 5, 6]
        printArray(array3); // Should print [7, 8]

        System.out.println("\nTest with empty arrays:");
        swapped = swap(emptyArray1, emptyArray2);
        System.out.println("Swapped: " + swapped); // Should print true
        printArray(emptyArray1); // Should print []
        printArray(emptyArray2); // Should print []
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays have different lengths
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true; // Contents successfully swapped
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
