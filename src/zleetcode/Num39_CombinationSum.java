package zleetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-11
 */
public class Num39_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }

    public static void main(String[] args) {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates, target);
        res.forEach(list -> System.out.println(Arrays.toString(list.toArray(new Integer[]{}))));
    }
}
