package aoffer;

/**
 * todo 看书优化
 * @author Yue Lin
 * @since 2018-03-26
 */
public class Num49_UglyNum {

    public static int getKthUglyNum(int k) throws Exception {
        if (k == 0) throw new Exception("input error!");
        int i = 1;
        while (k > 0) {
            if (isUglyNum(i)) k--;
            i++;
        }
        return i;
    }

    private static boolean isUglyNum(int num) {
        while (num % 2 == 0) num >>= 1;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) throws Exception {
        int k = 1500;
        System.out.println(getKthUglyNum(k));
    }
}
