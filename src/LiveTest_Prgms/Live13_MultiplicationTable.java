package LiveTest_Prgms;

public class Live13_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table for " + i + ":");

            // Inner loop for multipliers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Print a blank line for better readability
            System.out.println();
        }
    }
}
