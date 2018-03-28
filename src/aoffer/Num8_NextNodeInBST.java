package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-18
 */
public class Num8_NextNodeInBST {

    static class Node {
        int val;
        Node left;
        Node right;
        Node parent;
        Node(int val) {
            this.val = val;
        }
    }

    public static Node getNextNode(Node root, Node target) {
        if (root == null || target == null) return null;
        Node next = null;
        if (target.right != null) {
            Node targetR = target.right;
            while (targetR.left != null) {
                targetR = target.left;
            }
            next = targetR;
        } else if (target.parent != null) {
            Node cur = target;
            Node par = target.parent;
            while (par != null && cur == par.right) {
                cur = par;
                par = par.parent;
            }
            next = par;
        }
        return next;
    }
}
