package netease.recommend_2018;

import java.util.Scanner;

/**
 * 交错01串
 * @author Yue
 * @since 2018/1/21
 */
public class ZeroOneString {

    public static int getMaxSubStringLength(String s) {
        int pre = 0, len = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                pre = i;
            len = Math.max(len, i - pre + 1);
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getMaxSubStringLength(s));
    }
}
