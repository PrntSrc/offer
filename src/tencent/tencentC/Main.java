package tencent.tencentC;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-05
 */
public class Main {

    public static long[] getMax(int n, int m, int[] xi, int[] yi, int[] zi, int[] wi) {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
            int x = -1;
            for (int j = 0; j < m; j++) {
                if (zi[j] != -1 && wi[j] != -1 && xi[i] >= zi[j] && yi[i] >= wi[j] && xi[i] - zi[j] < minX && yi[i] - wi[j] < minY) {
                    x = j;
                    minX = xi[i] - zi[j];
                    minY = yi[i] - wi[j];
                }
            }
            if (x != -1) {
                count ++;
                sum += 200 * xi[i] + 3 * yi[i];
                zi[x] = -1;
                wi[x] = -1;
            }
        }
        return new long[] {count, sum};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] xi = new int[n];
        int[] yi = new int[n];
        for (int i = 0; i < n; i++) {
            xi[i] = sc.nextInt();
            yi[i] = sc.nextInt();
        }
        int[] zi = new int[m];
        int[] wi = new int[m];
        for (int i = 0; i < m; i++) {
            zi[i] = sc.nextInt();
            wi[i] = sc.nextInt();
        }
        long[] res = getMax(n, m, xi, yi, zi, wi);
        System.out.println(res[0] + " " + res[1]);
    }
}
