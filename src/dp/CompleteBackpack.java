package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class CompleteBackpack {

    public static long getWaysToN(int n) {
        int[] coins = new int[] {1, 5, 10, 20, 50, 100};
        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            for (int j = coins[i - 1]; j <= n; j++)
                dp[j] += dp[j - coins[i - 1]];
        }
        return dp[n];
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 5;
        System.out.println(getWaysToN(n));
    }
}
