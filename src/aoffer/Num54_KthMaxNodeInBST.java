package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-28
 */
public class Num54_KthMaxNodeInBST {

    static class Node {
        private Node left;
        private Node right;
        private int val;
        public Node(int val) {
            this.val = val;
        }
    }

    public static int getKthMaxNode(Node root, int k) {
        Node node = inOrderTraversal(root, 6);
        return node.val;
    }

    private static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }
    private static int count = 0;
    private static Node inOrderTraversal(Node root, int k) {
        System.out.println(k);
        Node target = null;
        if (root.left != null)
            target = inOrderTraversal(root.left, k);
//        count++;    // 计数加1
////        if(target == null) {
//            if(count == k) {    // 如果计数等于k，则找到pRoot
//                target = root;
//                return target;
//            }
////        }

//        if (target == null) {
            if (k == 0) {
                target = root;
//                System.out.println(target.val);
                return target;
            }
            k--;
//        }
        if (target == null && root.right != null)
            target = inOrderTraversal(root.right, k);
        return target;
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
        System.out.println(getKthMaxNode(root, 3));
    }
}
