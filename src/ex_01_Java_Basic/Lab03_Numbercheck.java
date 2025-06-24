package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab03_Numbercheck {
    public static void main(String[] args){

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num = scanner.nextInt();

            if (num > 5) {
                System.out.println(num + " it's positive.");
            } else if (num < 5) {
                System.out.println(num + " it's negative.");
            } else {
                System.out.println("it's zero.");
            }


        }}}


