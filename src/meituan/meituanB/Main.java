package meituan.meituanB;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-22
 */
public class Main {

    public static int getSum(String s, String t) {
        int sum = 0, len = s.length() - t.length() + 1;
        for (int i = 0; i < len; i++) {
            sum += addDiff(s.substring(i, i + t.length()), t);
        }
        return sum;
    }

    private static int addDiff(String ssub, String tsub) {
        int count = 0;
        for (int i = 0; i < ssub.length(); i++) {
            if (ssub.charAt(i) != tsub.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(getSum(s, t));
    }
}
