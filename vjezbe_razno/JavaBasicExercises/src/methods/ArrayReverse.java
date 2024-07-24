package methods;

public class ArrayReverse {
    public static void main(String[] args) {
        // Test arrays
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] multipleElementArray = {1, 2, 3, 4, 5};

        // Test cases
        System.out.println("Test with empty array:");
        reverse(emptyArray);
        printArray(emptyArray); // Should print []

        System.out.println("\nTest with one-element array:");
        reverse(oneElementArray);
        printArray(oneElementArray); // Should print [5]

        System.out.println("\nTest with multiple-element array:");
        reverse(multipleElementArray);
        printArray(multipleElementArray); // Should print [5, 4, 3, 2, 1]
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
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
