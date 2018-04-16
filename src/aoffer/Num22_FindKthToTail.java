package aoffer;

/**
 * todo
 * @author Yue Lin
 * @since 2018-04-16
 */
public class Num22_FindKthToTail {

    static class Node {
        int val;
        Node next;
    }

    public static Node findKthToTail(Node head, int k) {
        Node fast = head, slow = head;
        while (fast != null && k-- > 0) fast = fast.next;
        if (k > 0) return null;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
