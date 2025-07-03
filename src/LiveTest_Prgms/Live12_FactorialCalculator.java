package LiveTest_Prgms;

import java.util.Scanner;

public class Live12_FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a positive integer from user
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

    }
}
