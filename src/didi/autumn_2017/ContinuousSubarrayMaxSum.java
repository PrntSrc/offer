package didi.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-29
 */
public class ContinuousSubarrayMaxSum {

    public static int getContinuousSubArrayMaxSum(int n, int[] nums) {
        int cur = nums[0], max = nums[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(cur, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(getContinuousSubArrayMaxSum(n, nums));
    }
}
