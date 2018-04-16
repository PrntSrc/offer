package zbook;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class SequenceTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void sequenceTraversal(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }

    public static void sequenceTraversalWithLayer(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int temp = 1;
            int len = temp;
            temp = 0;
            while (len-- > 0) {
                TreeNode node = queue.poll();
                System.out.println(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                    temp++;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    temp++;
                }
            }
        }
    }

}
