package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-20
 */
public class Num64_MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0);
                else if (i == 0) grid[i][j] += grid[i][j - 1];
                else if (j == 0) grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[r - 1][c - 1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1,3,1},
                {1,5,1},
                {4,2,1}};

        System.out.println(minPathSum(grid));

    }
}
