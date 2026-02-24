// Service class that encapsulates palindrome logic
class PalindromeService {

    // Public method exposed to users
    public boolean checkPalindrome(String input) {

        // Internal data structure (char array)
        char[] chars = input.toLowerCase().toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Application class
public class UC11 {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();
        String input = "Level";

        if (service.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}