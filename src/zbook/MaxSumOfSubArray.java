package zbook;

/**
 * @author Yue
 * @since 2018/3/12
 */
public class MaxSumOfSubArray {

    public static Integer getMaxSumOfArray(int[] nums) {
        if (nums.length == 0) return null;
        int maxSum = nums[0], curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(getMaxSumOfArray(nums));
    }
}
