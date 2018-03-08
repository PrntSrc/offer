package zbook;

import java.util.LinkedList;

/**
 * @author Yue
 * @since 2018/3/4
 */
public class DeleteLinkedListNode {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void delete(Node head, Node toDelete) {
        if (head == null || toDelete == null) return;
        if (head == toDelete) {
            head = null;
            return;
        }
        if (toDelete.next == null) {
            Node temp = head;
            while (temp.next != toDelete) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            toDelete.val = toDelete.next.val;
            toDelete.next = toDelete.next.next;
        }
    }

    public static void print(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node sec = new Node(2);
        Node thr = new Node(3);
        Node fou = new Node(4);
        Node fiv = new Node(5);
        head.next = sec;
        sec.next = thr;
        thr.next = fou;
        fou.next = fiv;
        print(head);
        delete(head, head);
        print(head);
        LinkedList linkedList = new LinkedList();
    }
}
