package methods;

public class ArraySearch {
    public static void main(String[] args) {
        // Test arrays
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] multipleElementArray = {1, 2, 3, 4, 5};

        // Test cases
        System.out.println("Test with empty array:");
        System.out.println("Index of 5: " + search(emptyArray, 5)); // Should print -1

        System.out.println("\nTest with one-element array:");
        System.out.println("Index of 5: " + search(oneElementArray, 5)); // Should print 0
        System.out.println("Index of 1: " + search(oneElementArray, 1)); // Should print -1

        System.out.println("\nTest with multiple-element array:");
        System.out.println("Index of 3: " + search(multipleElementArray, 3)); // Should print 2
        System.out.println("Index of 6: " + search(multipleElementArray, 6)); // Should print -1
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
