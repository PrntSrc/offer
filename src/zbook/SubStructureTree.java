package zbook;

/**
 * @author Yue
 * @since 2018/3/9
 */
public class SubStructureTree {

    static class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSubStructureTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean isSubTree = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) isSubTree = helper(root1, root2);
            else if (root1.left != null) isSubTree = isSubStructureTree(root1.left, root2);
            else if (root1.right != null) isSubTree = isSubStructureTree(root1.right, root2);
        }
        return isSubTree;
    }

    private static boolean helper(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return helper(root1.left, root2.left) && helper(root1.right, root2.right);
    }
}
