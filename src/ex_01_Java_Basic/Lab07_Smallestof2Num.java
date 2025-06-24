package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab07_Smallestof2Num
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = scanner.nextInt();
        System.out.println("Enter  Second number");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println(a + " is Smallest");
        } else {
            System.out.println(b + " is Smallest");
        }
    }}


