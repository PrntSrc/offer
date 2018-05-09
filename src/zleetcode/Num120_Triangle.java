package zleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-06
 */
public class Num120_Triangle {

//    public static int minimumTotal(List<List<Integer>> triangle) {
//        int sum = 0;
//        for (int i = 0; i < triangle.size(); i++) {
//            sum += minInRow(triangle.get(i), 0 , i);
//        }
//        return sum;
//    }
//
//    private static int minInRow(List<Integer> list, int l, int r) {
//        if (l == r) return list.get(l);
//        int m = l + (r - l) / 2;
//        return Math.min(minInRow(list, l, m), minInRow(list, m + 1, r));
//    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) return 0;
        int len = triangle.size();
        int[] dp = new int[len];
        for (int i = 0; i < dp.length; i++)
            dp[i] = triangle.get(len - 1).get(i);
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++)
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
        }
        return dp[0];
    }

    private static int minInRow(List<List<Integer>> triangle, int row, int index, int sum) {
        if (row == triangle.size() || triangle.get(row).size() == 0) return sum;
        sum = sum + triangle.get(row).get(index);
        return Math.min(minInRow(triangle, row + 1, index, sum),
                minInRow(triangle, row + 1, index + 1, sum));
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
//        triangle.add(new ArrayList<Integer>(){{add(2);}});
//        triangle.add(new ArrayList<Integer>(){{add(3);add(4);}});
//        triangle.add(new ArrayList<Integer>(){{add(6);add(5);add(7);}});
//        triangle.add(new ArrayList<Integer>(){{add(4);add(1);add(8);add(3);}});
        triangle.add(new ArrayList<Integer>(){{add(-1);}});
        triangle.add(new ArrayList<Integer>(){{add(2);add(3);}});
        triangle.add(new ArrayList<Integer>(){{add(1);add(-1);add(-3);}});
        System.out.println(minimumTotal(triangle));
    }
}
