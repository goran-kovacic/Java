package methods;

public class ArrayToString {
    public static void main(String[] args) {
        // Test with int arrays
        int[] emptyIntArray = {};
        int[] oneElementIntArray = {1};
        int[] nElementIntArray = {1, 2, 3, 4, 5};

        System.out.println("Empty int array: " + arrayToString(emptyIntArray));
        System.out.println("One-element int array: " + arrayToString(oneElementIntArray));
        System.out.println("N-element int array: " + arrayToString(nElementIntArray));
    }

    public static String arrayToString(int[] array) {
        if (array == null || array.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
