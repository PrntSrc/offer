package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class ActivityPlanning {

    public static List<Integer> plan(int[] s, int[] f) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int len = s.length;
        for (int i = 1, j = 0; i < len; i++) {
            if (s[i] > f[j]) {
                res.add(i + 1);
                j = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] s = new int[] {1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12};
        int[] f = new int[] {4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16};
        List<Integer> res = plan(s, f);
        res.forEach(System.out::println);
    }
}
