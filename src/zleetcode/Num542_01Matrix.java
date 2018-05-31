package zleetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-05-31
 */
public class Num542_01Matrix {

    public static int[][] updateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    matrix[i][j] = bfs(matrix, i, j);
            }
        }
        return matrix;
    }

    private static int bfs(int[][] matrix, int a, int b) {
        int dis = 0;
        boolean[][] marked = new boolean[matrix.length][matrix[0].length];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {a, b});
        marked[a][b] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] t = queue.poll();
                int x = t[0];
                int y = t[1];
                marked[x][y] = true;
                if (matrix[x][y] == 0) return dis;
                if (x > 0 && !marked[x - 1][y]) queue.offer(new int[]{x - 1, y});
                if (x < matrix.length - 1 && !marked[x + 1][y]) queue.offer(new int[]{x + 1, y});
                if (y > 0 && !marked[x][y - 1]) queue.offer(new int[]{x, y - 1});
                if (y < matrix[0].length - 1 && !marked[x][y + 1]) queue.offer(new int[]{x, y + 1});
            }
            dis++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};
        int[][] distance = updateMatrix(matrix);
        for (int[] dis : distance)
            System.out.println(Arrays.toString(dis));
    }
}
