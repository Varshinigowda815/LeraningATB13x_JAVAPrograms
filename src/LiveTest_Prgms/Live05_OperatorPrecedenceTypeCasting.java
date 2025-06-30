package LiveTest_Prgms;

public class Live05_OperatorPrecedenceTypeCasting {
    public static void main(String[] args) {
        System.out.println("--- Operator Precedence ---");

        int a = 10;
        int b = 5;
        int c = 2;

        // Expression without parentheses
        int result1 = a + b * c; // b * c happens first, then added to a
        System.out.println("a + b * c = " + result1 + "  (Because * has higher precedence than +)");

        // Expression with parentheses
        int result2 = (a + b) * c; // a + b happens first due to parentheses
        System.out.println("(a + b) * c = " + result2 + "  (Because parentheses change the order)");

        // Expression with multiple operators
        int result3 = a + b * c - b / c;
        System.out.println("a + b * c - b / c = " + result3 +
                "  (Evaluated as a + (b * c) - (b / c))");

        // Type Casting
        System.out.println("\n--- Type Casting ---");

        // Implicit Type Casting (widening)
        int intVal = 100;
        // int is automatically converted to double
        System.out.println("Implicit casting: int " + intVal + " to double = " + (double) intVal);

        // Explicit Type Casting (narrowing)
        double d = 9.78;
        int i = (int) d; // manually cast double to int (decimal part is lost)
        System.out.println("Explicit casting: double " + d + " to int = " + i);

        // Casting in expressions
        double result4 = (double) a / b; // casting to get precise division
        System.out.println("Casting in expression: (double) a / b = " + result4 +
                "  (Ensures floating-point division)");

        // Casting char to int
        char ch = 'A';
        // implicit casting from char to int (ASCII value)
        System.out.println("Implicit casting: char '" + ch + "' to int = " + (int) ch);
    }
}
