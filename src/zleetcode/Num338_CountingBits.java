package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-24
 */
public class Num338_CountingBits {

//    public static int[] countBits(int num) {
//        int[] dp = new int[num + 1];
//        if (num == 0) return dp;
//        dp[1] = 1;
//        int pow = 1;
//        for (int i = 2; i <= num; i++) {
//            if (i == pow << 1) {
//                dp[i] = 1;
//                pow <<= 1;
//            } else
//                dp[i] = dp[i - pow] + 1;
//        }
//        return dp;
//    }

    public static int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 0; i <= num; i++)
            dp[i] = dp[i >> 1] + (i & 1);
        return dp;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(Arrays.toString(countBits(num)));
    }
}
