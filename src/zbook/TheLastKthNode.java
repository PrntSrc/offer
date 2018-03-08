package zbook;

/**
 * @author Yue
 * @since 2018/3/6
 */
public class TheLastKthNode {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node getTheLastKthNode(Node head, int k) {
        if (head == null && k == 0) return null;
        Node fast = head, slow = head;
        while (--k > 0) {
            fast = fast.next;
            if (fast == null)
                return null;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }

}
