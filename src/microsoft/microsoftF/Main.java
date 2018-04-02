package microsoft.microsoftF;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-01
 */
public class Main {

    public static int getMaxSize(int n, int p, int w, int h , int aSum) {
        int size = 0, res = 0;
        while (res < p) {
            size++;
            res = (aSum / Math.floorDiv(w, size)) / Math.floorDiv(h, size);
        }
        return res == p ? size : size - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tasks = sc.nextInt();
        for (int i = 0; i < tasks; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
//            int[] a = new int[n];
            int aSum = 0;
            for (int j = 0; j < n; j++)
                aSum += sc.nextInt();
//                a[j] = sc.nextInt();
            System.out.println(getMaxSize(n, p, w, h, aSum));
        }
    }
}
