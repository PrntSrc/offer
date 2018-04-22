package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-21
 */
public class Num39_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    private static void combinationSum(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> temp) {
        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                temp.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
        else if (target == 0) res.add(new ArrayList<>(temp));
    }

    public static void main(String[] args) {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates, target);
        for (List<Integer> r : res) {
            System.out.println(Arrays.toString(r.toArray(new Integer[]{})));
        }
    }
}
