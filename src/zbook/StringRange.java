package zbook;

/**
 * @author Yue
 * @since 2018/3/7
 */
public class StringRange {

    public static void rangeString(String s) {
        if (s == null) return;
        exchange(s.toCharArray(), 0);
    }

    private static void exchange(char[] c, int i) {
        if (i == c.length) {
            System.out.println(String.valueOf(c));
            return;
        }
        for (int j = i; j < c.length; j++) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            exchange(c, i + 1);
            t = c[i];
            c[i] = c[j];
            c[j] = t;
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        rangeString(s);
    }
}
