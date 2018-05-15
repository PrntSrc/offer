package zleetcode;

import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-15
 */

public class Num143_ReorderList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void reorderList(ListNode head) {
        if (head == null) return;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        p1.next = reverse(p1.next);
        ListNode temp = p1;
        p1 = p1.next;
        p2 = head;
        while (p2 != temp) {
            temp.next = p1.next;
            p1.next = p2.next;
            p2.next = p1;
            p2 = p1.next;
            p1 = temp.next;
        }
        print(head);

    }

    private static ListNode reverse(ListNode head) {
        ListNode temp = null, cur;
        while (head != null) {
            cur = head;
            head = head.next;
            cur.next = temp;
            temp = cur;
        }
        return temp;
    }

    private static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        reorderList(head);
    }

}
