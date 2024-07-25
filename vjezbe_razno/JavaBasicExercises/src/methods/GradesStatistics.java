package methods;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
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

        // Display grades
        System.out.print("The grades are: ");
        printArray(grades);

        // Calculate statistics
        double average = calculateAverage(grades);
        double median = calculateMedian(grades);
        int min = findMin(grades);
        int max = findMax(grades);
        double stdDeviation = calculateStandardDeviation(grades, average);

        // Display statistics
        System.out.printf("The average is: %.2f%n", average);
        System.out.printf("The median is: %.2f%n", median);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.printf("The standard deviation is: %.2f%n", stdDeviation);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int grade : array) {
            sum += grade;
        }
        return (double) sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int grade : array) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int grade : array) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDiffs = 0.0;
        for (int grade : array) {
            sumSquaredDiffs += Math.pow(grade - mean, 2);
        }
        double variance = sumSquaredDiffs / array.length;
        return Math.sqrt(variance);
    }
}
