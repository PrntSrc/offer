package aoffer;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class Num58_ReverseWords {

    public static String reverse(String s) {
        s = reverse(s, 0, s.length() - 1);
        int len = s.length();
        for (int i = 0, j = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (i - j > 1) s = reverse(s, j, i - 1);
                j = i + 1;
            }
            else if (i == len - 1 && i - j >= 1) s = reverse(s, j, i);
        }
        return s;
    }

    private static String reverse(String s, int h, int t) {
        char[] c = s.toCharArray();
        while (h < t) {
            char temp = c[h];
            c[h] = c[t];
            c[t] = temp;
            h++;
            t--;
        }
//        System.out.println(Arrays.toString(c));
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String s = "IC am a student. ";
        s = reverse(s);
        System.out.println(s);
//        System.out.println(2 + 2 >> 1);
//        System.out.println(2 + (2 >> 1));
    }
}
