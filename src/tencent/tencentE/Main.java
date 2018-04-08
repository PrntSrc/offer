package tencent.tencentE;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-05
 */
public class Main {

    public static long getSum(int n, int m) {
        long sum = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i += m, flag = !flag) {
            for (int j = i; flag == false && j < i+m; j++)
                sum -= j;
            for (int j = i; flag == true && j < i+m; j++)
                sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getSum(n, m));
    }
}
