package zbook;

/**
 * @author Yue
 * @since 2018/3/7
 */
public class ReverseLinkedList {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node cur = head, pre = null, temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
//        ReverseLinkedList linkedList = new ReverseLinkedList();
        Node head = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(head);
        head = reverseLinkedList(head);
        System.out.println();
        print(head);
    }
}
