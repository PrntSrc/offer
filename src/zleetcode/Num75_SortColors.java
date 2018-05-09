package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-23
 */
public class Num75_SortColors {

    public static void sortColors(int[] nums) {
        int l = 0, h = nums.length - 1, i = 0;
        while (i <= h) {
            if (nums[i] == 0) {
                nums[i] = nums[l];
                nums[l] = 0;
                l++;
            } else if (nums[i] == 2) {
                nums[i] = nums[h];
                nums[h] = 2;
                h--;
                i--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
