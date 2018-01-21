package netease.recommend_2018;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/1/20
 * 彩色的砖块
 */
public class ColoredBricks {

    public static int getWayValue(String s) {
        int[] bricks = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            bricks[s.charAt(i) - 65]++;
        for (int b : bricks) {
            if (b > 0) count++;
            if (count > 2) return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getWayValue(s));
    }
}
