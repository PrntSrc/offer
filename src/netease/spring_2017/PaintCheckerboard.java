package netease.spring_2017;

import java.util.Scanner;

/**
 * Created by Yue on 2018/1/19.
 * 涂棋盘
 */
public class PaintCheckerboard {
    public static int getMaxPaintedArea(String[] checkerboard, int n) {
        int max = 0;
        for (int j = 0; j < n; j++) {
            int count = 1;
            for (int i = 0; i < n -1; i++) {
                if (checkerboard[i].charAt(j) == checkerboard[i + 1].charAt(j)) {
                    count++;
                    max = Math.max(count, max);
                } else {
                    count = 1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] checkerboard = new String[n];
        for (int i = 0; i < n; i++)
            checkerboard[i] = sc.next();
        System.out.println(getMaxPaintedArea(checkerboard, n));
    }
}
