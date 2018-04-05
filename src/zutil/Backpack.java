package zutil;

/**
 * introduction
 *
 * included methods :
 *  0-1 backpack :
 *      zeroOneBackpack 优化求解
 *      printZeroOneBackpackPath/*ReversedPath 路径打印
 *
 * parameter :
 *  n : 物品数
 *  capacity : 最大承重
 *  weights : 物品各自重量
 *  values : 物品各自价值
 *
 * @author Yue Lin
 * @since 2018-04-04
 */
public class Backpack {

    /**
     * optimally solve the 0-1 backpack problem
     * @param n the number of goods
     * @param weights the respective weight of goods
     * @param values the respective value of goods
     * @param capacity the capacity of the backpack
     * @return optimal result
     */
    public static int zeroOneBackpack(int n, int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = capacity; j >= weights[i - 1]; j--)
                dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
        }
        return dp[capacity];
    }

    /**
     * print the solving path index of 0-1 backpack problem in order
     * index start from 1
     * @param n the number of goods
     * @param weights the respective weight of goods
     * @param values the respective value of goods
     * @param capacity the capacity of the backpack
     */
    public static void printZeroOneBackpackPath(int n, int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        int[] path = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = capacity; j >= weights[i - 1]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
            }
        }
        for (int i = n, j = capacity; i > 0 && j >= weights[i - 1]; i--) {
            if (dp[j] == dp[j - weights[i - 1]] + values[i - 1]) {
                path[i] = 1;
                j -= weights[i - 1];
            }
        }
        for (int i = 1; i <= n; i++)
            if (path[i] == 1)
                System.out.print(i + " ");
    }

    /**
     * print the solving path index of 0-1 backpack problem in reverse order
     * index start from 1
     * @param n the number of goods
     * @param weights the respective weight of goods
     * @param values the respective value of goods
     * @param capacity the capacity of the backpack
     */
    public static void printZeroOneBackpackReversedPath(int n, int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = capacity; j >= weights[i - 1]; j--)
                dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
        }
        for (int i = n, j = capacity; i > 0 && j >= weights[i - 1]; i--) {
            if (dp[j] == dp[j - weights[i - 1]] + values[i - 1]) {
                System.out.print(i + " ");
                j -= weights[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[] weights = new int[] {12, 13, 23, 36};
        int[] values = new int[] {12, 11, 20, 30};
        int capacity = 40;
        System.out.println(zeroOneBackpack(n, weights, values, capacity));
        printZeroOneBackpackPath(n, weights, values, capacity);
    }
}
