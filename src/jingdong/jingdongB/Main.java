package jingdong.jingdongB;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-09
 */
public class Main {

    public static void findXY(long n) {
        if (n % 2 != 0) {
            System.out.println("No");
            return;
        }
        int count = 0;
        while (n % 2 == 0) {
            count++;
            n >>= 1;
        }
        for (long y = 2; y <= n; y += 2) {
            long x = (n & 1) == 1 ? n : n - 1;
            long temp = x * y;
            for (; x > 0 && temp >= n; x -= 2) {
                temp = x * y;
                if (temp == n) {
                    System.out.print(x);
                    System.out.print(" ");
                    System.out.println(y * count);
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            findXY(sc.nextLong());
    }
}
