package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-23
 */
public class Num42_MaxSumOfSubArray {

    public static int getMaxSumOfSubArray(int[] nums) throws Exception {
        if (nums == null || nums.length == 0) throw new Exception("input error");
        int cur = nums[0], max = cur;
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(getMaxSumOfSubArray(nums));
    }
}
