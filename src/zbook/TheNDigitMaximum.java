package zbook;

/**
 * @author Yue
 * @since 2018/3/4
 */
public class TheNDigitMaximum {

    public static int getMaximum(int digit) {
        if (digit < 1) return 0;
        int res = 1, i = 0;
        while (i++ < digit) res *= 10;
        return res - 1;
    }

    public static void main(String[] args) {
        System.out.println(getMaximum(3));
    }
}
