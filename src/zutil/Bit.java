package zutil;

/**
 * @author Yue Lin
 * @since 2018-04-13
 */
public class Bit {

    public static int getNumOfOneInBinary(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(getNumOfOneInBinary(n));
    }
}
