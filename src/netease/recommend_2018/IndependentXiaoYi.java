package netease.recommend_2018;

import java.util.Scanner;

/**
 * 独立的小易
 * @author Yue
 * @since 2018/1/25
 */
public class IndependentXiaoYi {

    public static long getIndependentDay(long x, long f, long d, long p) {
        long independentDay = (d  + p * f) / (x + p);
        if (independentDay < f)
            independentDay = d / x;
        return independentDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(getIndependentDay(x, f, d, p));
    }
}