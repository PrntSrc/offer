package zbook;

import java.util.Stack;

/**
 * @author Yue
 * @since 2018/1/22
 */
public class LinkedListUtils {

    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    public void printReverse() {
        Stack<Integer> stack = new Stack<>();
        Node node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }


}
