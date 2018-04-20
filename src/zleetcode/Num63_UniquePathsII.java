package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-20
 */
public class Num63_UniquePathsII {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[0][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (obstacleGrid[i - 1][j - 1] != 1)
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        for (int[] t : dp)
            System.out.println(Arrays.toString(t));
        return dp[m][n];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = new int[][] {
                {0,0,0},
                {0,1,0},
                {0,0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
