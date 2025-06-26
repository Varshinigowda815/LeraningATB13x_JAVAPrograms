package LiveTest;

public class Live01_SubString {
    public static void main(String[] args) {
        String firstName = "Varshini";
        String lastName = "Gowda";

        // 1. Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 2. Length
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);

        // 3. Substring
        String firstPart = fullName.substring(0, 4); // "Vars"
        System.out.println("Substring (0 to 4): " + firstPart);

        // 4. Character Extraction
        char charAtIndex = fullName.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex);
    }
}



