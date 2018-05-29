package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-27
 */
public class Num547_FriendCircles {

    public static int findCircleNum(int[][] M) {
        int count = 0;
        boolean[] marked = new boolean[M.length];
        for (int i = 0; i < M.length; i++) {
            if (!marked[i]) {
                dfs(M, marked, i);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int[][] M, boolean[] marked, int v) {
        for (int j = 0; j < M.length; j++) {
            if (!marked[j] && M[v][j] == 1) {
                marked[j] = true;
                dfs(M, marked, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] M = new int[][] {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}};
        System.out.println(findCircleNum(M));
    }
}
