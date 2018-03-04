package zleetcode;

/**
 * leetcode 62 meduim
 * @author Yue
 * @since 2018/1/23
 */
public class UniquePaths {

    // 超时
    private int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    // dp
}
