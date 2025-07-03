package LiveTest_Prgms;

import java.util.Scanner;

public class Live06_Numberclassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Classify the number using if-else
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
