package dp;

/**
 * @author Yue Lin
 * @since 2018-04-05
 */
public class CompleteBackpackDemo {

    /**
     * n : 物品数
     * capacity : 最大承重
     * weights : 物品各自重量
     * values : 物品各自价值
     */
    public static long getWaysToN(int n, int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = weights[i]; j <= capacity; j++)
                dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
