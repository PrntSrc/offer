package zleetcode;

import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-06-19
 */
public class Num98_ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val <= pre.val)
                return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
