package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-04-04
 */
public class Num62_UniquePaths {

    // 超时
//    public static int uniquePaths(int m, int n) {
//        return countPath(1, 1, m, n);
//    }
//
//    private static int countPath(int x, int y, int m, int n) {
//        if (x > m || y > n) return 0;
//        if (x == m && y == n) return 1;
//        return countPath(x + 1, y, m, n) + countPath(x, y + 1, m, n);
//    }

    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] corner = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++)
            corner[i][1] = 1;
        for (int j = 1; j <= n; j++)
            corner[1][j] = 1;
        corner[1][2] = corner[2][1] = 1;
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                corner[i][j] = corner[i - 1][j] + corner[i][j - 1];
            }
        }
        return corner[m][n];
    }

    public static void main(String[] args) {
        int m = 2, n = 2;
        System.out.println(uniquePaths(m, n));
    }
}
