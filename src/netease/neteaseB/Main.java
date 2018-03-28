package netease.neteaseB;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-27
 */
public class Main {

    public static long getPairNum(int n, int k) {
        long count = 0;
        for (int x = k; x < n; x++) {
            count += (n - x);
        }
        n -= k;
        if (n < 0) return count;
        count++;
        while (n % k == 0) {
            count++;
            n %= k;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(getPairNum(n, k));
    }
}
