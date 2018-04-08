package tencent.tencentD;

/**
 * @author Yue Lin
 * @since 2018-04-05
 */
public class MainTemp {

    public static int getWayNum(int k, int a, int x, int b, int y) {
        int[] dp = new int[k + 1];
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        dp[min] = x;
        dp[min + 1] =
//        dp[max] = y;
        x--;
        y--;
        for (int i = min + 1; i <= k; i++) {
            if (dp[i - a] * x >= dp[i - b] * y) {
                dp[i] = dp[i - a] * x;
                x--;
            } else {
                dp[i] = dp[i - b] * y;
                y--;
            }
        }
        for (int l : dp)
            System.out.println(l);
        return dp[k];
    }

    public static void main(String[] args) {
        System.out.println(getWayNum(5, 2, 3, 3, 3));
    }
}
