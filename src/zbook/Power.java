package zbook;

/**
 * @author Yue
 * @since 2018/3/8
 */
public class Power {

    public static boolean invalidInput = false;

    public static double power(double base, int exponent) {
        invalidInput = false;
        if (Double.doubleToLongBits(base) == 0 && exponent < 0) {
            invalidInput = true;
            return 0;
        }
        if (exponent < 0) exponent = -exponent;
        double res = powerInPositiveExponent(base, exponent);
        return exponent < 0 ? (1 / res) : res;
    }

    private static double powerInPositiveExponent(double base, int exponent) {
        if (exponent == 0) return 0;
        if (exponent == 1) return base;
        double res = powerInPositiveExponent(base, exponent >> 1);
        res *= res;
        if ((exponent & 1) == 1) res *= base;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(3, 3));
        Double a = 3.0;
        a.equals(3);
    }

}
