package aoffer;

/**
 * @author Yue Lin
 * @since 2018-04-16
 */
public class PrintOneToMaxOfDigits {

    public static void print(int digits) {
        int temp = 1, i, exp = 1;
        while (digits-- > 0) {
            exp *= 10;
            i = temp;
            while (i < exp) {
                System.out.println(i);
                i++;
            }
            temp = i;
        }
    }

    public static void main(String[] args) {
        int digits = 3;
        print(digits);
    }
}
