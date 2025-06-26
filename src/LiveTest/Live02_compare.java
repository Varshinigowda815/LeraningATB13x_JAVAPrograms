package LiveTest;

public class Live02_compare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = new String("Java");
        String str4 = "java";

        System.out.println("== operator:");
        System.out.println("str1 == str2: " + (str1 == str2));   // true (same pool reference)
        System.out.println("str1 == str3: " + (str1 == str3));   // false (different objects)

        System.out.println("\nequals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));   // true
        System.out.println("str1.equals(str4): " + str1.equals(str4));   // false

        // 3. Using equalsIgnoreCase() (checks content - case-insensitive)
        System.out.println("\nequalsIgnoreCase() method:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));  // true

        // 4. Using compareTo() (lexicographic comparison)
        System.out.println("\ncompareTo() method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));

        // Optional: case-insensitive comparison using compareToIgnoreCase()
        System.out.println("\ncompareToIgnoreCase() method:");
        System.out.println("str1.compareToIgnoreCase(str4): " + str1.compareToIgnoreCase(str4));
    }
}


