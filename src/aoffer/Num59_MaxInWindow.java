package aoffer;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class Num59_MaxInWindow {

    public static int[] getMaxInWindow(int[] nums, int windowLen) {
        if (nums == null || nums.length == 0 || windowLen <= 1) return nums;
        int[] res = new int[nums.length - windowLen + 1];
        for (int i = 0; i < nums.length - windowLen + 1; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = i; j < i + windowLen; j++)
                temp = Math.max(temp, nums[j]);
            res[i] = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 4, 2, 6, 2, 5, 1};
        int windowLen = 3;
        System.out.println(Arrays.toString(getMaxInWindow(nums, windowLen)));
    }
}
