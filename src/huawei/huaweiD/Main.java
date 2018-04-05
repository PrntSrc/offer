package huawei.huaweiD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Main {

    private static ArrayList<Integer> res;

    public static void isSubsetSum(int set[], int n, int sum)
    {
        // Base Cases
        if (n == 0 || sum < 0) {
            return;
        }
        // If last element is greater than sum, then ignore it
        if (set[n-1] > sum)
            isSubsetSum(set, n-1, sum);
       /* else, check if sum can be obtained by any of the following
          (a) including the last element
          (b) excluding the last element   */
        isSubsetSum(set, n-1, sum);
        isSubsetSum(set, n-1, sum-set[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb = Integer.valueOf(sc.nextLine());
        String[] ranks = sc.nextLine().split(" ");
        int len = ranks.length;
        int[] cost = new int[len];
        int[] coin = new int[len];
        for (int i = 0; i < len; i++) {
            cost[i] = Integer.valueOf(ranks[i]);
            coin[i] = sc.nextInt();
        }
        isSubsetSum(cost, len, mb);
    }
}
