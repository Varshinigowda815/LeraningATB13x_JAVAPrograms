package ex_24_June_Prgms;

import java.util.Scanner;

public class Lab03_GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for marks
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Step 2: Check validity of marks
        if (marks < 0 || marks > 100) {
            System.out.println(" Invalid marks! Please enter a value between 0 and 100.");
        }
        // Step 3: Use if-else-if to determine grade
        else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}