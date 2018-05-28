package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-28
 */
public class Num113_PathSumII {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root != null)
            addPath(root, sum, res, new ArrayList<>());
        return res;
    }

    private static void addPath(TreeNode root, int sum, List<List<Integer>> res, List<Integer> temp) {
        temp.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0)
            res.add(new ArrayList<>(temp));
        if (root.left != null)
            addPath(root.left, sum - root.val, res, temp);
        if (root.right != null)
            addPath(root.right, sum - root.val, res, temp);
        temp.remove(temp.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(8);
        TreeNode left21 = new TreeNode(11);
        TreeNode left22 = new TreeNode(13);
        TreeNode right21 = new TreeNode(4);
        TreeNode left31 = new TreeNode(7);
        TreeNode left32 = new TreeNode(5);
        TreeNode right31 = new TreeNode(2);
        TreeNode right32 = new TreeNode(1);
        root.left = left1;
        root.right = right1;
        left1.left = left21;
        right1.left = left22;
        right1.right = right21;
        left21.left = left31;
        left21.right = right31;
        right21.left = left32;
        right21.right = right32;
        List<List<Integer>> res = pathSum(root, 22);
        for (List r : res)
            System.out.println(Arrays.toString(r.toArray(new Integer[]{})));
    }

}
