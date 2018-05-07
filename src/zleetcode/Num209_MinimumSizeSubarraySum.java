package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-07
 */
public class Num209_MinimumSizeSubarraySum {

    public static int minSubArrayLen(int s, int[] nums) {
        int cur = 0, head = 0, len = nums.length + 1, i = 0;
        while (i < nums.length) {
            while (i < nums.length && cur < s) cur += nums[i++];
            while (cur >= s) {
                len = Math.min(i - head, len);
                cur -= nums[head++];
            }
        }
        return len <= nums.length ? len : 0;
    }

    public static void main(String[] args) {
        int s = 7;
        int[] nums = new int[] {2, 3, 1};
        System.out.println(minSubArrayLen(s, nums));
    }
}
