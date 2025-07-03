package LiveTest_Prgms;

import java.util.Scanner;

public class Live07_Largestof3Nos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest number using if-else if statements
        if (num1 >= num2 && num1 >= num3) {
            if (num1 == num2 && num1 == num3) {
                System.out.println("All numbers are equal.");
            } else if (num1 == num2 || num1 == num3) {
                System.out.println("The largest number is " + num1 + " (equal to one or more others).");
            } else {
                System.out.println("The largest number is " + num1);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num2 == num3) {
                System.out.println("The largest number is " + num2 + " (equal to one other).");
            } else {
                System.out.println("The largest number is " + num2);
            }
        } else {
            System.out.println("The largest number is " + num3);
        }

        scanner.close();
    }
}
