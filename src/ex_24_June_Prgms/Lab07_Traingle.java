package ex_24_June_Prgms;

import java.util.Scanner;

public class Lab07_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First side");
        int a =sc.nextInt();
        System.out.println("Enter Second side");
        int b =sc.nextInt();
        System.out.println("Enter Three side");
        int c =sc.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println(" The triangle is valid.");
        } else {
            System.out.println("The triangle is NOT valid.");
        }
    }
}
