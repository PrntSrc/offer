package dp;

import java.util.Scanner;

/**
 * 固定容量v, n个物品, m价值
 * @author Yue
 * @since 2018/3/10
 */
public class ZeroOneBag {

    public static int getMaxMInV(int[] prods, int[] vals, int n, int v) {
//        int[][] dp = new int[n + 1][v + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= v; j++) {
//                if (j >= prods[i - 1])
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - prods[i - 1]] + vals[i - 1]);
//                else
//                    dp[i][j] = dp[i - 1][j];
//            }
//        }
        int[] dp = new int[v + 1];
         for (int i = 1; i <= n; i++) {
            for (int j = v; j >= 0; j--) {
                if (j >= prods[i - 1])
                    dp[j] = Math.max(dp[j], dp[j - prods[i - 1]] + vals[i - 1]);
            }
        }
        return dp[v];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int[] prods = new int[n];
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            prods[i] = sc.nextInt();
            vals[i] = sc.nextInt();
        }
        System.out.println(getMaxMInV(prods, vals, n, v));

    }
}
