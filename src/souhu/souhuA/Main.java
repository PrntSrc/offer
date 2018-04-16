package souhu.souhuA;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class Main {

    public static int getGrowValue(int n, int lenR1, int[][] r) {
        int sum1 = 0, sum2 = 0;
        int[] s = new int[lenR1];
        int[] e = new int[lenR1];
        int[] v = new int[lenR1];
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = 0; i < n; i++) {
            if (r[i][0] == 2)
                sum2 += r[i][2];
            else {
                s[j] = r[i][1];
                e[j] = r[i][2];
                if (e[j] > max) max = e[j];
                v[j] = r[i][3];
                j++;
            }
        }
        int[] res = new int[max];
        for (int i = 0; i < max; i++)
            res[i] = Integer.MIN_VALUE;
        for (int i = 0; i < lenR1; i++) {
            for (int j = s[i] - 1; j < e[i]; j++) {
                if (v[i] > res[j]) res[j] = v[i];
            }
        }
        for (int i : res) {
            if (i != Integer.MIN_VALUE)
                sum1 += i;
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] r = new int[n][4];
        int countR1 = 0;
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            r[i][0] = type;
            r[i][1] = sc.nextInt();
            r[i][2] = sc.nextInt();
            if (type == 1) {
                countR1++;
                r[i][3] = sc.nextInt();
            }
        }
        System.out.println(getGrowValue(n, countR1, r));
    }
}
