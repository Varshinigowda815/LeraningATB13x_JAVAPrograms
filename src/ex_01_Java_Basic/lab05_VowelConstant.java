package ex_01_Java_Basic;

public class lab05_VowelConstant {
        public static void main(String[] args) {
            char ch = 'v'; // You can change this character to test

            // Convert to lowercase for simplicity
            ch = Character.toLowerCase(ch);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println(ch + " is not an alphabet letter.");
            }
        }
    }


