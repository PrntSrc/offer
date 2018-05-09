package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-07
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Num148_SortList {

    public static ListNode sortList(ListNode head) {
        return new ListNode(1);
    }

    public static void main(String[] args) {
        int[] vals = new int[] {-1, 5, 3, 4, 0};
        ListNode head = new ListNode(vals[0]);
        ListNode temp = head;
        for (int i = 1; i < vals.length; i++) {
            temp.next = new ListNode(vals[i]);
            temp = temp.next;
        }
        head = sortList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
