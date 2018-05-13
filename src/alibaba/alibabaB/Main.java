package alibaba.alibabaB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/5/11
 */
public class Main {

    public static String adjustPlan(int n, int m, int[][] stricts) {
        int[] per = new int[2*n];
        List<Integer>[] peo = new ArrayList[n * 2];
        for (int i = 0; i < n * 2; i++) peo[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            peo[stricts[i][0]].add(stricts[i][1]);
        }
        for (int i = 0; i < 2 * n; i ++) {
            if (adjust(per, peo, i)) return "no";
        }
        return "yes";
    }

    private static boolean adjust(int[] groups, List<Integer>[] peo, int index) {
        if (groups[index] == 1) return false;
        else groups[index] = 0;
        for (int i = 0; i < peo[index].size(); i++) {
            if (!adjust(groups, peo, peo[index].get(i))) return false;
        }
        groups[index] = 0;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] stricts = new int[m][n];
        for (int i = 0; i < m; i++) {
            stricts[i][0] = sc.nextInt();
            stricts[i][1] = sc.nextInt();
        }
        System.out.println(adjustPlan(n, m, stricts));
    }
}
