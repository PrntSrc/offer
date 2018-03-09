package zbook;

/**
 * @author Yue
 * @since 2018/3/9
 */
public class MergeSortedLists {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        Node mergeHead;
        if (head1.val < head2.val) {
            mergeHead  = head1;
            mergeHead.next = mergeSortedLists(head1.next, head2);
        } else {
            mergeHead = head2;
            mergeHead.next = mergeSortedLists(head1, head2.next);
        }

//        while (temp1 != null) {
//            cur.next = temp1;
////            temp1 = temp1.next;
//        }
//
//        while (temp2 != null) {
//            cur.next = temp2;
//            temp2 = temp2.next;
//        }
        return mergeHead;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node nodeh1 = new Node(2);
        Node nodeh2 = new Node(3);
        Node nodeh3 = new Node(4);
        head1.next = nodeh1;
        nodeh1.next = nodeh2;
        nodeh2.next = nodeh3;

        Node head2 = new Node(2);
        Node node1 = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        head2.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node head3 = mergeSortedLists(head1, head2);

        print(head1);
        print(head2);
        print(head3);


    }
}
