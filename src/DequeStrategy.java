import java.util.Deque;
import java.util.ArrayDeque;

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}