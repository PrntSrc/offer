package tencent.summer_2017;

import java.util.Scanner;

/**
 * 构造回文 动态规划 最长公共子序列
 * https://www.nowcoder.com/questionTerminal/28c1dc06bc9b4afd957b01acdf046e69
 * @author Yue
 * @since 2018/1/28
 */
public class ConstructPalindrome {

    public static int constructPalindrome(String s) {
        String r = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i - 1) == r.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return s.length() - dp[s.length()][s.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(constructPalindrome(s));
        }
    }
}
