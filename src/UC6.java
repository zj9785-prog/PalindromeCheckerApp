import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UC6 {

    public static boolean isPalindrome(String input) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Compare dequeue (queue) and pop (stack)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
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