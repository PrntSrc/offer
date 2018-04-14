package aboffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-11
 */
public class Num1_2_ChineseChess {

    public static List<Integer[]> getAllValidWays() {
        List<Integer[]> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (Math.abs(j - i) % 3 != 0)
                    res.add(new Integer[] {i, j});
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer[]> res = getAllValidWays();
        res.forEach(r -> System.out.println(Arrays.toString(r)));
    }
}
