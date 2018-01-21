package netease.spring_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/1/20
 * 堆砖块 未解决
 * https://www.nowcoder.com/questionTerminal/040924ba0e64423b8a3fe2f75a56934a?toCommentId=447866
 */
public class StackBricks {

    public static int getMaxStackedHeight(int n, int[] height, int heightSum) {
        if (heightSum % 2 != 0)
            return -1;
        int[] dp = new int[heightSum / 2 + 1];
        for (int i = 0; i < height.length; i++) {
            for (int j = heightSum / 2; j >= height[i]; j--)
                dp[j] = Math.max(dp[j], dp[j - height[i]] + height[i]);
        }
        return dp[heightSum / 2] == heightSum / 2 ? dp[heightSum / 2] : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int heightSum = 0;
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            heightSum += height[i];
        }
        System.out.println(getMaxStackedHeight(n, height, heightSum));
    }
}
