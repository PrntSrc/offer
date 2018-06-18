package jingdong.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/6/18
 */
public class LuckyNum {

    public static int countLuckyNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (sumByBase(i, 10) == sumByBase(i, 2))
                count++;
        }
        return count;
    }

    private static int sumByBase(int n, int base) {
        int sum = 0;
        while (n > 0) {
            sum += n % base;
            n /= base;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countLuckyNum(n));
    }
}
