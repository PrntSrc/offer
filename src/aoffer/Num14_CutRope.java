package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class Num14_CutRope {

    public static int getMaxProductOfCutRopes(int ropeLen) {
        // 默认ropelen > 0;
        if (ropeLen <= 3) return ropeLen - 1;
        int[] dp = new int[ropeLen + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= ropeLen; i++) {
            for (int j = 1; j <= i / 2; j++)
                dp[i] = Math.max(dp[j] * dp[i - j], dp[i]);
        }
        return dp[ropeLen];
    }

    public static void main(String[] args) {
        int ropelen = 8;
        System.out.println(getMaxProductOfCutRopes(ropelen));
    }
}
