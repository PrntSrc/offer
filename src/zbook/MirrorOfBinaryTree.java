package zbook;

/**
 * @author Yue
 * @since 2018/3/9
 */
public class MirrorOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode Mirror(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
        return root;
    }

}
