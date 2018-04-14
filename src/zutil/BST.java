package zutil;

import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-04-13
 */
public class BST {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }

    public static void InOrderTraversalRec(TreeNode root) {
        if (root == null) return;
        InOrderTraversalRec(root.left);
        System.out.println(root.val);
        InOrderTraversalRec(root.right);
    }

    public static void InOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
