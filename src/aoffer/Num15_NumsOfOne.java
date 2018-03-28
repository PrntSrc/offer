package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class Num15_NumsOfOne {

    public static int getNumsOfOne(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(getNumsOfOne(n));
    }
}
