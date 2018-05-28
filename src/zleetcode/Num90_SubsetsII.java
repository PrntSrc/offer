package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-16
 */
public class Num90_SubsetsII {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        getSubsets(nums, 0, res, new ArrayList<>());
        return res;
    }

    private static void getSubsets(int[] nums, int start, List<List<Integer>> list, List<Integer> temp) {
        list.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            getSubsets(nums, i + 1, list, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4, 4, 4, 1, 4};
        List<List<Integer>> res = subsetsWithDup(nums);
        for (List r : res)
            System.out.println(Arrays.toString(r.toArray()));
    }
}
