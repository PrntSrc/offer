package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-18
 */
public class Num129_SumRootToLeafNumbers {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public static int sum(TreeNode n, int s){
        if (n == null) return 0;
        if (n.right == null && n.left == null) return s * 10 + n.val;
        return sum(n.left, s * 10 + n.val) + sum(n.right, s * 10 + n.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(0);
        TreeNode left2 = new TreeNode(5);
        TreeNode right2 = new TreeNode(1);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        System.out.println(sumNumbers(root));
    }
}
