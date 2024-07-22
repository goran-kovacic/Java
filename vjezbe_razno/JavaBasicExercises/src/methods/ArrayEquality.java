package methods;

public class ArrayEquality {
    public static void main(String[] args) {
        // Test arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {1, 2, 4};
        int[] emptyArray1 = {};
        int[] emptyArray2 = {};

        // Test cases
        System.out.println("Test with equal arrays:");
        System.out.println("array1 equals array2: " + equals(array1, array2)); // Should print true

        System.out.println("\nTest with different length arrays:");
        System.out.println("array1 equals array3: " + equals(array1, array3)); // Should print false

        System.out.println("\nTest with same length but different content arrays:");
        System.out.println("array1 equals array4: " + equals(array1, array4)); // Should print false

        System.out.println("\nTest with empty arrays:");
        System.out.println("emptyArray1 equals emptyArray2: " + equals(emptyArray1, emptyArray2)); // Should print true

        System.out.println("\nTest with one empty array and one non-empty array:");
        System.out.println("emptyArray1 equals array1: " + equals(emptyArray1, array1)); // Should print false
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true; // Same reference
        }
        if (array1 == null || array2 == null) {
            return false; // One is null
        }
        if (array1.length != array2.length) {
            return false; // Different lengths
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Different elements
            }
        }
        return true; // Arrays are equal
    }
}
