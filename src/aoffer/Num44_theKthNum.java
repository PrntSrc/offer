package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-25
 */
public class Num44_theKthNum {

    public static int getKthNum(int k) {
        if (k < 10) return k;
        k -= 9;
        int digits = 2, total = 90, num = 9, pro, quo, rem;
        while (true) {
            pro = digits * total;
            if (k > pro) {
                k -= pro;
                num += total;
                digits++;
                total *= 10;
            } else {
                quo = k / digits;
                rem = k % digits;
                num += quo;
                if (rem != 0) {
                    num++;
                    while (rem-- > 1) num /= 10;
                }
                return num % 10;
            }

        }
    }

    public static void main(String[] args) {
        int k = 101;
        System.out.println(getKthNum(k));
    }
}
