package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-29
 */
public class Num55_DepthOfBST {

//    private static int depth;

    static class Node {
        private Node left;
        private Node right;
        private int val;
        public Node(int val) {
            this.val = val;
        }
    }

    public static int getDepth(Node root) {
        return getDepth(root, 0);
    }

    private static int getDepth(Node root, int depth) {
        if (root == null) return depth;
        return Math.max(getDepth(root.left, depth), getDepth(root.right, depth)) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node left1 = new Node(3);
        Node right1 = new Node(7);
        Node left2 = new Node(2);
        Node right2 = new Node(4);
        Node left3 = new Node(6);
        Node right3 = new Node(8);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
//        inOrderTraversal(root);
        System.out.println(getDepth(root));
    }
}
