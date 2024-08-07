package recursion;


public class LinearSearch {
    // Method to perform linear search and return true if key is found
    public static boolean linearSearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    // Method to perform linear search and return the index if key is found; or -1 otherwise
    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Test driver method to test the above methods
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62};
        int key = 23;
        int keyNotFound = 100;

        // Test linearSearch method
        boolean isFound = linearSearch(array, key);
        boolean isNotFound = linearSearch(array, keyNotFound);
        System.out.println("Is key " + key + " found: " + isFound); // Expected: true
        System.out.println("Is key " + keyNotFound + " found: " + isNotFound); // Expected: false

        // Test linearSearchIndex method
        int foundIndex = linearSearchIndex(array, key);
        int notFoundIndex = linearSearchIndex(array, keyNotFound);
        System.out.println("Index of key " + key + ": " + foundIndex); // Expected: index of key (2)
        System.out.println("Index of key " + keyNotFound + ": " + notFoundIndex); // Expected: -1
    }
}
