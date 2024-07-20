package methods;

public class ArrayContains {
    public static void main(String[] args) {
        // Test arrays
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] multipleElementArray = {1, 2, 3, 4, 5};

        // Test cases
        System.out.println("Test with empty array:");
        System.out.println("Contains 5: " + contains(emptyArray, 5)); // Should print false

        System.out.println("\nTest with one-element array:");
        System.out.println("Contains 5: " + contains(oneElementArray, 5)); // Should print true
        System.out.println("Contains 1: " + contains(oneElementArray, 1)); // Should print false

        System.out.println("\nTest with multiple-element array:");
        System.out.println("Contains 3: " + contains(multipleElementArray, 3)); // Should print true
        System.out.println("Contains 6: " + contains(multipleElementArray, 6)); // Should print false
    }

    public static boolean contains(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}
