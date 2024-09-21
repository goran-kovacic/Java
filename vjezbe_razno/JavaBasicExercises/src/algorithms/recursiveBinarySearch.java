package algorithms;

public class recursiveBinarySearch {
    
    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx >= toIdx) {
            return false;
        }

        int middleIdx = (fromIdx + toIdx) / 2;

        if (array[middleIdx] == key) {
            return true;
        }
        else if (key < array[middleIdx]) {
            return binarySearch(array, key, fromIdx, middleIdx);
        }
        else {
            return binarySearch(array, key, middleIdx + 1, toIdx);
        }
    }

    public boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static void main(String[] args) {
        recursiveBinarySearch search = new recursiveBinarySearch();

        int[] array = { 11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45 };

        int key1 = 18;
        boolean result1 = search.binarySearch(array, key1);
        System.out.println("Is key " + key1 + " found: " + result1); // Expected: true

        int key2 = 50;
        boolean result2 = search.binarySearch(array, key2);
        System.out.println("Is key " + key2 + " found: " + result2); // Expected: false
    }
}
