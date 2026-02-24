public class UC4{

    public static boolean isPalindrome(String input) {
        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "level";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}