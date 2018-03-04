package zbook;

/**
 * @author Yue
 * @since 2018/3/3
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c;
        while (n-- > 1) {
            c = b;
            b += a;
            a = c;
        }
        return b;
    }

    public static int fibonacciR(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciR(n - 2) + fibonacciR(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(11));
        System.out.println(fibonacciR(5));
    }
}
