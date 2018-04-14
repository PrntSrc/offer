/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class Fibonacci {

    public static long fibonacci(int n) {
        // todo n >= 0
        if (n < 2) return 1;
        long a = 1, b = 1, i = 2;
        long res = 0;
        while (i++ <= n) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(fibonacci(n));
    }
}
