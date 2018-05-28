package iqiyi.autumn_2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-28
 */
public class DNASequence {

    public static int getMinLen(String s) {
        int min = s.length();
        char[] c = new char[] {'A', 'C', 'G', 'T'};
        for (int i = 1; i <= s.length(); i++) {
            if (!unrecurse(s, new StringBuilder(), c, i))
                return i;
        }
        return 0;
    }

    private static int permutation(String s, StringBuilder t, char[] c, int start, int len, int res) {
        if (!s.contains(t)) return t.length();
        for (int i = start; i < c.length && t.length() < len; i++) {
            t.append(c[i]);
            res = permutation(s, t, c, start + 1, len, res);
            t.deleteCharAt(start);
        }
        return res;
    }

    private static boolean unrecurse(String s, StringBuilder t, char[] c, int len) {
        int i, start = 0;
        while (t.length() <= len && start < c.length) {
            for (i = start; i < c.length && t.length() < len; i++) {
                t.append(c[i]);
            }
            start = i;
            //            if (!s.contains(t)) return false;
            System.out.println(t.toString());
            t.deleteCharAt(t.length() - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getMinLen(s));
    }
}
