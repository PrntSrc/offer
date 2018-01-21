package baidu.spring_2017;

import java.util.Scanner;

/**
 * Created by Yue on 2018/1/7.
 * 度度熊回家
 */
public class BackHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] pos = new int[N];
        for (int i = 0; i < N; i++)
            pos[i] = sc.nextInt();
        System.out.println(backHome(pos));
    }

    public static int backHome(int[] pos) {
        int cur = 0, pre = 0;
        int ci = 0, pi = 0;
        for (int i = 1; i < pos.length - 1; i++) {
            pre = cur;
            cur = Math.abs(pos[i] - pos[i - 1]);

        }
        return 0;
    }
}
