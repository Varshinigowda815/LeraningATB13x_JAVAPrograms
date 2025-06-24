package ex_24_June_Prgms;

import java.util.Scanner;

public class Lab06_ATMWithdraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter amount to withdraw: ₹");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println(" Invalid amount! Amount should be greater than ₹0.");
        } else if (amount % 100 != 0) {
            System.out.println("ATM only accepts amounts in multiples of ₹100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Your current balance is ₹" + balance);
        } else {
            balance -= amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}