package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue
 * @since 2018/6/17
 */
public class Num40_CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] candidates, int target, int v, List<List<Integer>> res, List<Integer> temp) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target > 0) {
            for (int i = v; i < candidates.length; i++) {
                if (i > v && candidates[i] == candidates[i - 1]) continue;
                temp.add(candidates[i]);
                dfs(candidates, target - candidates[i], i + 1, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[] {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidates, target);
        for (List<Integer> r : res)
            System.out.println(Arrays.toString(r.toArray()));
    }
}
