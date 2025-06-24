package ex_24_June_Prgms;

import java.util.Scanner;

public class Lab05_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("" + num + " is a prime number.");
        } else {
            System.out.println("" + num + " is not a prime number.");
        }
    }
    }