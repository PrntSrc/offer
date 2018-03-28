package netease.neteaseA;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yue Lin
 * @since 2018-03-27
 */
public class Main {

    public static int getReplaceNum(int n, int[] x1, int[] x2, int[] y1, int[] y2) {
        int count, max = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (x1[i] > x1[j] || y1[i] > x1[j])
                    count++;
            }
//            System.out.println(count);
            max = Math.max(count, max);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] y1 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) x1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) x2[i] = sc.nextInt();
        for (int i = 0; i < n; i++) y1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) y2[i] = sc.nextInt();
        System.out.println(getReplaceNum(n, x1, x2, y1, y2));
    }
}
