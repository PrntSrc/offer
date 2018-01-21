package netease.spring_2017;

import java.util.Scanner;

/**
 * Created by Yue on 2018/1/14.
 * 调整队形
 */
public class AdjustFormation {

    public static int getMinAdjustNum(String s) {
        int sumB = 0, sumG = 0;
        int adjustG = 0, adjustB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') adjustG++;
            else sumB += adjustG;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'G') adjustB++;
            else sumG += adjustB;
        }
        return Math.min(sumB, sumG);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getMinAdjustNum(s));
    }
}
