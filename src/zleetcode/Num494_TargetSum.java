package zleetcode;

import java.util.ArrayList;

/**
 * @author Yue Lin
 * @since 2018-05-27
 */
public class Num494_TargetSum {

    public static int findTargetSumWays(int[] nums, int s) {
        return recursive(nums, s, 0, 0);
    }

    private static int recursive(int[] nums, int s, int cur, int index) {
        if (index == nums.length) {
            if (cur == s) return 1;
            else return 0;
        }
        return recursive(nums, s, cur + nums[index], index + 1) +
                recursive(nums, s, cur - nums[index], index + 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1, 1, 1};
        int s = 3;
        System.out.println(findTargetSumWays(nums, s));
    }
}
