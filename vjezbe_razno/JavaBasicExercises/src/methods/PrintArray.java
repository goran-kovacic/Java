package methods;

public class PrintArray {
    // Method to print int array
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method to print double array
    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method to print float array
    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Test driver
    public static void main(String[] args) {
        // Test with int arrays
        int[] emptyIntArray = {};
        int[] oneElementIntArray = {1};
        int[] nElementIntArray = {1, 2, 3, 4, 5};

        System.out.print("Empty int array: ");
        print(emptyIntArray);

        System.out.print("One-element int array: ");
        print(oneElementIntArray);

        System.out.print("N-element int array: ");
        print(nElementIntArray);

        // Test with double arrays
        double[] emptyDoubleArray = {};
        double[] oneElementDoubleArray = {1.1};
        double[] nElementDoubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.print("Empty double array: ");
        print(emptyDoubleArray);

        System.out.print("One-element double array: ");
        print(oneElementDoubleArray);

        System.out.print("N-element double array: ");
        print(nElementDoubleArray);

        // Test with float arrays
        float[] emptyFloatArray = {};
        float[] oneElementFloatArray = {1.1f};
        float[] nElementFloatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        System.out.print("Empty float array: ");
        print(emptyFloatArray);

        System.out.print("One-element float array: ");
        print(oneElementFloatArray);

        System.out.print("N-element float array: ");
        print(nElementFloatArray);
    }
}
