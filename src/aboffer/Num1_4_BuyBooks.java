package aboffer;

/**
 * @author Yue Lin
 * @since 2018-04-11
 */
public class Num1_4_BuyBooks {

    public static int getMinPrize(int n) {
        double[] dp = new double[n + 1];
        dp[1] = 8;
        dp[2] = 8 * 2 * 0.95;
        dp[3] = 8 * 3 * 0.9;
        dp[4] = 8 * 4 * 0.8;
        dp[5] = 8 * 5 * 0.75;
//        for (int i = 6; i <= n; i++) {
//            for ()
//        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(getMinPrize(n));
    }
}
