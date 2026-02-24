public class UC12StrategyPattermPalindrome {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new DequeStrategy();
        // PalindromeStrategy strategy = new StackStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.executeStrategy(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}