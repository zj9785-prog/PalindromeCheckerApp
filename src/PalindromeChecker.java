public class PalindromeChecker {

    // Main Method - Entry Point
    public static void main(String[] args) {

        displayWelcomeMessage();   // UC1
        checkHardcodedPalindrome(); // UC2

        System.out.println("Application Finished.");
    }

    // ===== UC1 =====
    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Version: 1.0");
        System.out.println();
    }

    // ===== UC2 =====
    public static void checkHardcodedPalindrome() {

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check using if-else
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println();
    }
}