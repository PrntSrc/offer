package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-11
 */
public class Num238_ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i < nums.length; i++)
            output[i] = output[i - 1] * nums[i - 1];
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);
        System.out.println(Arrays.toString(output));
    }

}
