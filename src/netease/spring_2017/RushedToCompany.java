package netease.spring_2017;

import java.util.Scanner;

/**
 * Created by Yue on 2018/1/14.
 * 赶去公司
 */
public class RushedToCompany {

    public static int getMinTime(int n, int[][] t, int gx, int gy, int walkTime, int taxiTime) {
        int walk = (Math.abs(gx) + Math.abs(gy)) * walkTime;
        int sum = walk;
        for (int i = 0; i < n; i++) {
            int walkAndTaxi = (Math.abs(t[i][0]) + Math.abs(t[i][1])) * walkTime +
                    (Math.abs(gx - t[i][0]) + Math.abs(gy - t[i][1])) * taxiTime;
            sum = Math.min(sum, walkAndTaxi);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] t = new int[n][2];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < n; x++)
                t[x][y] = sc.nextInt();
        }
        int gx = sc.nextInt(), gy = sc.nextInt();
        int walkTime = sc.nextInt(), taxiTime = sc.nextInt();
        System.out.println(getMinTime(n, t, gx, gy, walkTime, taxiTime));
    }
}
