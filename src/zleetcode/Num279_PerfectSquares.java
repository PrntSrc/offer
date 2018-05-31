package zleetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-05-30
 */
public class Num279_PerfectSquares {

    public static int numSquares(int n) {
        int res = Integer.MAX_VALUE;
        List<Integer> squares = new ArrayList<>();
        int i = 1;
        while (i * i <= n) {
            squares.add(i * i);
            i++;
        }

        for (int j = squares.size() - 1; j >= 0; j--) {
            int cur = 0, k = j, m = n;
            while (m > 0) {
                int t = squares.get(k);
                System.out.println(t);
                m -= t;
                cur++;
                while (m > 0 && m < t) {
                    k--;
                    t = squares.get(k);
                }
            }
            if (m == 0) res = Math.min(res, cur);
            System.out.println("----------------------");
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 43;
        System.out.println(numSquares(n));
    }

}
