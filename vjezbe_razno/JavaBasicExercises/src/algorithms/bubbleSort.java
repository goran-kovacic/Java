package algorithms;

public class bubbleSort {

    // Method to perform bubble sort on the array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Do-while loop to continue passes while swapping happens
        do {
            swapped = false; // Reset swapped flag for each pass

            // Loop through the array, comparing adjacent elements
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap the elements if they are out of order
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    swapped = true; // Set swapped flag to true if a swap occurred
                }
            }
            // After each pass, the largest element is in its final position, so reduce n
            n = n - 1;
        } while (swapped); // Repeat if at least one swap occurred in the previous pass
    }

    public static void main(String[] args) {
        // Test the bubbleSort method
        int[] array = { 34, 12, 24, 9, 5, 48 };
        System.out.println("Before sorting: ");
        printArray(array);

        // Perform bubble sort
        bubbleSort(array);

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

