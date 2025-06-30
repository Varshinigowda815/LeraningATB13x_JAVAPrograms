package LiveTest_Prgms;

public class Live03_Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean x = true;
        boolean y = false;

        // Comparison Operators
        System.out.println("--- Comparison Operators ---");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));    // Equal to
        System.out.println("a != b: " + (a != b));    // Not equal to
        System.out.println("a < b: " + (a < b));      // Less than
        System.out.println("a > b: " + (a > b));      // Greater than
        System.out.println("a <= b: " + (a <= b));    // Less than or equal to
        System.out.println("a >= b: " + (a >= b));    // Greater than or equal to

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y (AND): " + (x && y));    // Logical AND
        System.out.println("x || y (OR): " + (x || y));     // Logical OR
        System.out.println("!x (NOT x): " + (!x));          // Logical NOT
        System.out.println("!y (NOT y): " + (!y));          // Logical NOT
    }
}
