package algorithms;

public class insertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i]; 
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = { 9, 6, 4, 1, 5, 2, 7 };
        System.out.println("Before sorting: ");
        printArray(array);

        insertionSort(array);

        System.out.println("After sorting: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
