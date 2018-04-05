package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-04
 */
public class Num198_HouseRobber {


//    int len = nums.length;
//        if (nums == null || len == 0) return 0;
//        if (len == 1) return nums[0];
//        if (len == 2) return Math.max(nums[0], nums[1]);
//    int pre = nums[0], cur = nums[1], sum, max = pre, temp;
//        for (int i = 2; i < len; i++) {
//        sum = max + nums[i];
//        max = Math.max(max, cur);
//        temp = cur;
//        cur = sum;
//        pre = temp;
//    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if (nums == null || len == 0) return 0;
        if (len == 1) return nums[0];
        if (len == 2) return Math.max(nums[0], nums[1]);
        int[] sum = new int[len + 1];
        sum[1] = nums[0];
        sum[2] = nums[1];
        int max = sum[1];
        for (int i = 3; i <= len; i++) {
            sum[i] = max + nums[i - 1];
            max = Math.max(max, sum[i - 1]);
        }
//        System.out.println(Arrays.toString(sum));
        return Math.max(sum[len - 1], sum[len]);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 9, 5, 7, 4, 2, 8, 6};
        System.out.println(rob(nums));
    }
}
