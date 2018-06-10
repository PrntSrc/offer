package aoffer2;

/**
 * @author Yue Lin
 * @since 2018-06-07
 */
public class DeleteUnsortLinkedList {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node deleteDuplicate(Node node) {
        if (node == null) return null;
        Node temp = node;
        while (temp != null) {
            Node pre = temp, cur = temp.next;
            while (cur != null) {
                if (cur.val == temp.val)
                    pre.next = cur.next;
                else
                    pre = cur;
                cur = cur.next;
            }
            temp = temp.next;
        }
        return node;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(1);
        Node node6 = new Node(5);
        Node node7 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        Node t = node1;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.println();
        Node res = deleteDuplicate(node1);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
