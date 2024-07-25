package methods;

import java.util.Scanner;

public class GradesHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Read grades
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        scanner.close();

        // Initialize histogram buckets
        int[] histogram = new int[10];
        for (int grade : grades) {
            int bucket = grade / 10;
            if (bucket == 10) {
                bucket = 9; // Handle grade 100
            }
            histogram[bucket]++;
        }

        // Display horizontal histogram
        System.out.println("\nHorizontal Histogram:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%2d - %2d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Display vertical histogram
        System.out.println("\nVertical Histogram:");
        int maxCount = 0;
        for (int count : histogram) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = maxCount; i > 0; i--) {
            for (int j = 0; j < histogram.length; j++) {
                if (histogram[j] >= i) {
                    System.out.print("  *  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }

        // Print the range labels
        for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%-5s", i * 10 + "-" + (i * 10 + 9));
        }
        System.out.println();
    }
}
