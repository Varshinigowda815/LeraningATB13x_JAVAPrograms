package LiveTest_Prgms;

public class Live04_IncrementandDecrement {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Post-increment: i++
        System.out.println("\nPost-increment (i++):");
        System.out.println("Value used in expression: " + (i++)); // Uses i, then increments
        System.out.println("Value of i after i++: " + i);

        // Pre-increment: ++i
        System.out.println("\nPre-increment (++i):");
        System.out.println("Value used in expression: " + (++i)); // Increments i, then uses it
        System.out.println("Value of i after ++i: " + i);

        // Post-decrement: i--
        System.out.println("\nPost-decrement (i--):");
        System.out.println("Value used in expression: " + (i--)); // Uses i, then decrements
        System.out.println("Value of i after i--: " + i);

        // Pre-decrement: --i
        System.out.println("\nPre-decrement (--i):");
        System.out.println("Value used in expression: " + (--i)); // Decrements i, then uses it
        System.out.println("Value of i after --i: " + i);
    }
}
