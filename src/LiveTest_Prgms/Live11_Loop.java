package LiveTest_Prgms;

import java.util.Scanner;

public class Live11_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read value of N from user
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        // Print numbers from 1 to N using for loop
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
