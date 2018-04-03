package huawei.developer;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class MaximumScore {

    public static void doAction(int n, int m, int[] score, int[][] action) {
        for (int i = 0; i < m; i++) {
            if (action[i][0] == 1) System.out.println(query(score, action[i][1] - 1, action[i][2] - 1));
            else update(score, action[i][1] - 1, action[i][2]);
        }
    }

    private static int query(int[] score, int x, int y) {
        int max = 0;
        int i = Math.min(x, y);
        int j = Math.max(x, y);
        while (i <= j) max = Math.max(score[i++], max);
        return max;
    }

    private static void update(int[] score, int x, int y) {
        score[x] = y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] score = new int[n];
            for (int i = 0; i < n; i++)
                score[i] = sc.nextInt();
            int[][] action = new int[m][3];
            for (int i = 0; i < m; i++) {
                if (sc.next().equals("Q")) action[i][0] = 1;
                action[i][1] = sc.nextInt();
                action[i][2] = sc.nextInt();
            }
            doAction(n, m, score, action);
        }
    }
}
