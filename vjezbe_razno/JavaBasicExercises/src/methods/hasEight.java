package methods;

public class hasEight {
    public static void main(String[] args) {
        // Test the hasEight method
        int[] testNumbers = {18, 168, 1288, 123, 4567, 890};
        for (int number : testNumbers) {
            System.out.println("Does " + number + " contain the digit 8? " + hasEight(number));
        }
    }

    public static boolean hasEight(int number) {
        // Convert the number to a positive value if it is negative
        number = Math.abs(number);

        // Check if the number contains the digit 8
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }

        return false;
    }
}
