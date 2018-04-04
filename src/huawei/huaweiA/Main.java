package huawei.huaweiA;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Main {

    private static int max;

    public static int getLen(String s) {
        int len = s.length();
        if (len < 2) return s.length();
        for (int i = 0; i < len - 1; i++) {
            getLenHelper(s, i, i);
            getLenHelper(s, i, i + 1);
        }
        return max;
    }

    private static void getLenHelper(String s, int x, int y) {
        while (x >= 0 && y < s.length() && s.charAt(x) == s.charAt(y)) {
            x--;
            y++;
        }
        if (max < y - x - 1) max = y - x - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getLen(s));
    }
}
