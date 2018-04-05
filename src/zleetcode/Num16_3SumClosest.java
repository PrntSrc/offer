package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Num16_3SumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE, value = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, h = nums.length - 1;
//            if (i == 0 || nums[i] != nums[i - 1]) {
                while (l < h && h > i + 1) {
                    int sum = nums[i] + nums[l] + nums[h];
                    if (sum == target) return target;
                    else if (sum < target) l++;
                    else h--;
//                    while (l < h && nums[l - 1] == nums[l]) l++;
//                    while (l < h && nums[h + 1] == nums[h]) h--;
                    if (Math.abs(sum - target) < diff) {
                        diff = Math.abs(sum - target);
                        value = sum;
                    }

                }
//            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 2, 1, 4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
