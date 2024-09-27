package algorithms;

public class quickSort {
    // Method to sort the entire array
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Recursive method to sort the array in place from fromIdx (inclusive) to toIdx
    // (inclusive)
    public static void quickSort(int[] array, int fromIdx, int toIdx) {
        if (fromIdx < toIdx) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, fromIdx, toIdx);

            // Recursively apply quickSort to the left and right sublists
            quickSort(array, fromIdx, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, toIdx);
        }
    }

    // Method to partition the array and return the index of the pivot
    private static int partition(int[] array, int fromIdx, int toIdx) {
        int pivot = array[toIdx]; // Choosing the last element as the pivot
        int i = fromIdx - 1; // Index of the smaller element

        for (int j = fromIdx; j < toIdx; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] with the pivot element (array[toIdx])
        int temp = array[i + 1];
        array[i + 1] = array[toIdx];
        array[toIdx] = temp;

        // Return the index of the pivot element
        return i + 1;
    }

    public static void main(String[] args) {
        // Test the quickSort method
        int[] array = { 20, 11, 18, 14, 15, 9, 32, 5, 26 };
        System.out.println("Before sorting: ");
        printArray(array);

        // Perform quick sort
        quickSort(array);

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
