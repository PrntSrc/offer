package aoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 约瑟夫环
 * @author Yue Lin
 * @since 2018-04-02
 */
public class Num62_LastInCircle {

    // delete the mth element.
    public static int getLastInCircle(int n, int m) {
        if (n < 1 || m < 1) return -1;
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        System.out.println(getLastInCircle(n, m));
    }
}
