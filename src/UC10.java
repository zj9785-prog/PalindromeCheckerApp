public class UC10{

    // Method to normalize string and check palindrome
    public static boolean isPalindrome(String input) {

        // Normalize: remove spaces and convert to lowercase
        String normalized = input
                .replaceAll("\\s+", "")   // remove spaces using regex
                .toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Two-pointer palindrome check
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}