package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-06
 */
public class Num78_Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        for (List<Integer> list : subsets(nums))
            System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }
}
