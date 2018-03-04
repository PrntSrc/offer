package zbook;

/**
 * @author Yue
 * @since 2018/3/4
 */
public class OneInBinary {

    public static int countOneInBinary(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = (n - 1) & n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countOneInBinary(0x80000009));
    }
}
