package zbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * doing
 * @author Yue
 * @since 2018/3/8
 */
public class PathInTree {

    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    private static List<List<Integer>> paths = new LinkedList<>();
    public static List getPathBySumEqualsK(Node root, int k) {
        int sum = 0;
        getPathHelper(root, new Stack(), k, sum);
        return paths;
    }

    private static void getPathHelper(Node root, Stack path, int k, int sum) {
        if (sum == k)
        if (root == null) return;
        getPathHelper(root.left, path, k, sum);
        getPathHelper(root.right, path, k, sum);
    }


}
