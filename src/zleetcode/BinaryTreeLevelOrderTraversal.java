package zleetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue
 * @since 2018/2/19
 */
public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode t1 = root, t2 = null, t;
        queue.offer(root);
        while (!queue.isEmpty()) {
            t = queue.poll();
            if (t.left != null) {
                queue.offer(t.left);
                t2 = t.left;
            }
            if (t.right != null) {
                queue.offer(t.right);
                t2 = t.right;
            }
            temp.add(t.val);
            if (t == t1) {
                res.add(temp);
                temp.clear();
                t1 = t2;
            }
        }
        return res;
    }
}
