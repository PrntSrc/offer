package zleetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-05-27
 */
public class Num547_FriendCircles {

    private static int count;

    public static int findCircleNum(int[][] M) {
        boolean[] marked = new boolean[M.length];
        dfs(M, marked, 0);
        return count;
    }

    private static void dfs(int[][] M, boolean[] marked, int v) {
        marked[v] = true;
        for (int w = v; w < M[0].length; w++) {
            if (marked[w]) count++;
            else if (M[v][w] == 1)
                dfs(M, marked, w);
        }
    }

    public static void main(String[] args) {
        int[][] M = new int[][] {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}};

        System.out.println(findCircleNum(M));
    }
}
