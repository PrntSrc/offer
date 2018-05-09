package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-22
 */
public class Num46_Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        return permute(nums, 0, new ArrayList<>());
    }

    private static List<List<Integer>> permute(int[] nums, int k, List<List<Integer>> res) {
        if (k == nums.length - 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= k; i++) temp.add(nums[i]);
            res.add(temp);
            return res;
        }
        for (int i = k; i < nums.length; i++) {
            exchange(nums, k, i);
            permute(nums, k + 1, res);
            exchange(nums, k, i);
        }
        return res;
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1};
        for (List p : permute(nums))
            System.out.println(Arrays.toString(p.toArray(new Integer[]{})));
    }
}
