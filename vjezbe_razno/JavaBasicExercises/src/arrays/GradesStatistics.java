package arrays;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        // Declare variables
        int numStudents;
        int[] grades;
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students and read the input as "int"
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Allocate the array
        grades = new int[numStudents];

        // Prompt and read the grades into the "int" array, if array length > 0
        for (int i = 0; i < numStudents; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        
        scanner.close();

        // Compute average, min, and max
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }
        double average = (double) sum / numStudents;

        // Print results
        System.out.printf("The average is: %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
