package arrays;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        // Declare variables
        final int NUM_ITEMS;
        int[] items;

        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of items and read the input as "int"
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = scanner.nextInt();

        // Allocate the array
        items = new int[NUM_ITEMS];

        // Prompt and read the items into the "int" array, if array length > 0
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = scanner.nextInt();
            }
        }
        
        scanner.close();

        // Print array contents
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                // Print the first item without a leading comma
                System.out.print(items[i]);
            } else {
                // Print the subsequent items with a leading comma
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
    }
}
