package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * three numbers sum equals zero.
 * @author Yue Lin
 * @since 2018-04-01
 */
public class Num15_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1, h = nums.length - 1, sum = - nums[i];
                while (l < h) {
                    if (nums[l] + nums[h] == sum) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                        while (l < h && nums[l + 1] == nums[l]) l++;
                        while (l < h && nums[h - 1] == nums[h]) h--;
                        l++;
                        h--;
                    } else if (nums[l] + nums[h] < sum) l++;
                    else h--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
//        int[] nums = new int[] {-2, -4, -2};
        threeSum(nums).forEach(n -> System.out.println(Arrays.toString(n.toArray())));
    }
}
