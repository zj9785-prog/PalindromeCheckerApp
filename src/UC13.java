import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UC13 {

    // UC3: Reverse String
    static boolean reverseStringCheck(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // UC4: Character Array (Two Pointer)
    static boolean charArrayCheck(String input) {
        char[] arr = input.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start++] != arr[end--]) {
                return false;
            }
        }
        return true;
    }

    // UC5: Stack
    static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // UC7: Deque
    static boolean dequeCheck(String input) {
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

    public static void main(String[] args) {

        String input = "levellevellevellevellevel";

        long start, end;

        start = System.nanoTime();
        reverseStringCheck(input);
        end = System.nanoTime();
        System.out.println("Reverse String Time: " + (end - start) + " ns");

        start = System.nanoTime();
        charArrayCheck(input);
        end = System.nanoTime();
        System.out.println("Char Array Time:     " + (end - start) + " ns");

        start = System.nanoTime();
        stackCheck(input);
        end = System.nanoTime();
        System.out.println("Stack Time:          " + (end - start) + " ns");

        start = System.nanoTime();
        dequeCheck(input);
        end = System.nanoTime();
        System.out.println("Deque Time:          " + (end - start) + " ns");
    }
}