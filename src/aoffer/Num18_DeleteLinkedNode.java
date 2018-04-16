package aoffer;

/**
 * todo
 * @author Yue Lin
 * @since 2018-04-16
 */
public class Num18_DeleteLinkedNode {

    static class Node {
        int val;
        Node next;
    }

    public static Node delete(Node head, Node toDelete) {
        if (toDelete.next == null) toDelete = null;
        else {
            toDelete.val = toDelete.next.val;
            toDelete.next = toDelete.next.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
