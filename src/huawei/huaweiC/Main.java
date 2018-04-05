package huawei.huaweiC;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Main {

//    private static Set<Integer> res = new HashSet<>();

    public static void getDownloadOrder(int mb, int n, int[] cost, int[] coin) {
        int[][] dp = new int[n + 1][mb + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= mb; j++) {
                if (j >= cost[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cost[i - 1]] + coin[i - 1]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[n][mb]);

        // 逆序打印
        for (int i = n, j = mb; i > 0 && j >= cost[i - 1]; i--) {
            if (dp[i][j] == dp[i - 1][j - cost[i - 1]] + coin[i - 1]) {
                System.out.println(coin[i - 1]);
                j -= cost[i - 1];
            }
        }
    }

//    private static void helper(int mb, int n, int[] cost, int sum, int i, boolean set) {
//        if (sum > mb || i >= n - 1) return;
//        helper(mb, n, cost, sum - cost[i], i + 1, res.add(i));
//        helper(mb, n, cost, sum, i + 1, res.add(i + 1));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb = Integer.valueOf(sc.nextLine());
        String[] ranks = sc.nextLine().split(" ");
        int len = ranks.length;
        int[] cost = new int[len];
        int[] coin = new int[len];
        for (int i = 0; i < len; i++) {
            cost[i] = Integer.valueOf(ranks[i]);
            coin[i] = sc.nextInt();
        }
        getDownloadOrder(mb, len, cost, coin);
    }
}
