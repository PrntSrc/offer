package ctrip.ctripC;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-29
 */
public class Main {

    public static int[] roomDetail(int[][] rooms, double[] prize, int[] require) {
        if (rooms == null || rooms.length == 0) return null;
        int[] res = new int[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i][0] >= require[0] && rooms[i][1] >= require[1]) {
                res[i] = require[2];
//                res[res.length - 1] = rooms[i][2] * r equire[2];
            } else
                res[i] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] rooms = new int[n][2];
        double[] prize = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int temp = sc.nextInt();
                if (temp < 0) {
                    System.out.println(-1);
                    return;
                }
                rooms[i][j] = temp;
            }
            double temp = sc.nextDouble();
            if (temp < 0) {
                System.out.println(-1);
                return;
            }
            prize[i] = temp;
        }
        int[] require = new int[3];
        for (int i = 0; i < 3; i++) {
            int temp = sc.nextInt();
            if (temp < 0) {
                System.out.println(-1);
                return;
            }
            require[i] = temp;
        }
        int[] res = roomDetail(rooms, prize, require);
        if (res == null)
            System.out.println(-1);
        else {
            int choose = -1;
            for (int i = 0; i < n; i++) {
                if (res[i] == 1) choose = i;
                System.out.print(res[i] + ",");
            }
            if (choose != -1)
                System.out.println(prize[choose] * require[2]);
            else
                System.out.println("0");
        }
    }
}
