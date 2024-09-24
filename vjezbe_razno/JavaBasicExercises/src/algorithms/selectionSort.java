package algorithms;

public class selectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Traverse the array to place each element in the correct sorted position
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the smallest element in the unsorted sublist
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found smallest element with the first element of the unsorted
            // sublist
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Test the selectionSort method
        int[] array = { 9, 6, 4, 1, 5 };
        System.out.println("Before sorting: ");
        printArray(array);

        // Perform selection sort
        selectionSort(array);

        System.out.println("After sorting: ");
        printArray(array);
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
