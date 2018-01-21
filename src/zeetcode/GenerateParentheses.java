package zeetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue
 * @since 2018/1/20
 * leetcode 22 medium
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, n, 0, 0, "");
        return list;
    }

    private void helper(List<String> list, int n, int l, int r, String s) {
        if (l == n && r == n) {
            list.add(s);
            return;
        }
        if (l < n) helper(list, n, l + 1, r, s + "(");
        if (r < l) helper(list, n, l, r + 1, s + ")");
    }

}
