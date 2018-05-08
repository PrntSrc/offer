package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-05-08
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { this.val = x; }
}
public class Num102_BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        right1.left = left2;
        right1.right = right2;

        List<List<Integer>> res = levelOrder(root);
        System.out.println(res.size());
        for (List<Integer> list : res)
            System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }
}
