package didi.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-06-03
 */
public class SumWays {

    private static int count = 0;

    public static int countWay(int[] a, int sum, int n) {
//        for (int i = 0; i < n; i++)
        count(a, sum, n, 0);
        return count;
    }

    private static void count(int[] a, int sum, int n, int start) {
        for (int i = start; i < n; i++) {
            sum -= a[i];
            if (sum == 0) count++;
            else if (sum > 0) count(a, sum, n, i + 1);
            sum += a[i];
        }
    }

    public static void main(String[] args) {
//        5 15 5 5 10 2 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(countWay(a, sum, n));
    }
}
