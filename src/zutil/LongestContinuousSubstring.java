package zutil;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-26
 */
public class LongestContinuousSubstring {

    public static int longestContinuousSubstring(String s, String t) {
        int sLen = s.length(), tLen = t.length(), max = 0;
        int[][] dp = new int[sLen + 1][tLen + 1];
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= tLen; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(longestContinuousSubstring(s, t));
    }
}
