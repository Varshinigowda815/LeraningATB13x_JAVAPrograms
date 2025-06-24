package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab08_LargestOfNum
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter First number");
        int a = scanner.nextInt();
        System.out.println("Enter  Second number");
        int b = scanner.nextInt();
        System.out.println("Enter  Third number");
        int c = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is largest");
        }
        else if (b>c)
        {
            System.out.println(b + " is largest");
        }
        else
        {
            System.out.println(c + " is largest");
        }
    }
}
