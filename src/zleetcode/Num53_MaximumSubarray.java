package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Num53_MaximumSubarray {

    public static int getMaxSubarraySum(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int max = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = (dp[i - 1] < 0 ? 0 : dp[i - 1]) + nums[i - 1];
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMaxSubarraySum(nums));
    }
}
