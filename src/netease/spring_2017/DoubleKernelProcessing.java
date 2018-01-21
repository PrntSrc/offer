package netease.spring_2017;

import java.util.Scanner;

/**
 * Created by Yue on 2018/1/13.
 * 双核处理
 * 0 1 背包问题
 * https://www.cnblogs.com/fly1988happy/archive/2011/12/13/2285377.html
 * https://www.cnblogs.com/omelet/p/6755144.html
 */
public class DoubleKernelProcessing {

    public static int getMinProcessTime(int[] nums, int sum) {
        int[] dp = new int[sum / 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum / 2; j >= nums[i]; j--)
              dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
        }
        return Math.max(dp[sum / 2], sum - dp[sum / 2]) * 1024;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() / 1024;
            sum += nums[i];
        }
        System.out.println(getMinProcessTime(nums, sum));
    }
}
