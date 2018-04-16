package aoffer;

/**
 * @author Yue Lin
 * @since 2018-04-16
 */
public class Num16_Power {

    public static double power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        double res = power(base, exponent >>> 1);
        res *= res;
        if ((exponent & 1) == 1) res *= base;
        return res;
    }

    public static void main(String[] args) {
        double base = 3;
        int exponent = 3;
        System.out.println(power(base, exponent));
    }
}
