public class UC8 {

    // Node definition for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    public static Node buildList(String input) {
        Node head = null, tail = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse a linked list
    public static Node reverse(Node head) {
        Node prev = null, curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Fast and slow pointer to find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf;

        while (temp != null) {
            if (firstHalf.data != temp.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "level";

        Node head = buildList(input);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}