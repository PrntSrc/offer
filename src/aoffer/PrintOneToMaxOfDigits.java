package aoffer;

/**
 * @author Yue Lin
 * @since 2018-04-16
 */
public class PrintOneToMaxOfDigits {

    public static void print(int digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= digits; i++) sb.append('9');
        for (String i = "0"; !i.equals(sb.toString());) {
            i = increment(i);
            System.out.println(i);
        }
     }

    private static String increment(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int i = c.length - 1;
        while (i >= 0 && c[i] == '9') i--;
        if (i < 0) sb.append(1);
        else c[i] += 1;
        while (i + 1 < c.length) c[++i] = '0';
        return sb.append(c).toString();
    }

    public static void main(String[] args) {
        int digits = 3;
        print(digits);
    }
}
