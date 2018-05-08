package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-08
 */
public class Num201_BitwiseANDOfNumbersRange {

    public static int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        int res = 1;
        while (n != m) {
            n >>>= 1;
            m >>>= 1;
            res <<= 1;
        }
        return m * res;
    }

    public static void main(String[] args) {
        int m = 1, n = 3;
        System.out.println(rangeBitwiseAnd(m, n));
    }
}
