package LiveTest_Prgms;

public class Live02_Arithmetic {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        System.out.println("Initial Values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (integer)
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)

        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");

        int x = 10;
        System.out.println("Initial x = " + x);

        x += 5;  // x = x + 5
        System.out.println("x += 5  => x = " + x);

        x -= 3;  // x = x - 3
        System.out.println("x -= 3  => x = " + x);

        x *= 2;  // x = x * 2
        System.out.println("x *= 2  => x = " + x);

        x /= 4;  // x = x / 4
        System.out.println("x /= 4  => x = " + x);

        x %= 3;  // x = x % 3
        System.out.println("x %= 3  => x = " + x);
    }
}
