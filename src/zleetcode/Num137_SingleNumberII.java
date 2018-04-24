package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-24
 */
public class Num137_SingleNumberII {

    public static int singleNumber(int[] nums) {
//        if (nums == null || nums.length == 0)
        int res = 0;
        int[] bits = new int[32];
        for (int n : nums) {
            int i = 0;
            while (n != 0) {
                bits[i++] += n & 1;
                n >>>= 1;
            }
        }
//        System.out.println(Arrays.toString(bits));
        for (int i = 0, pow = 1; i < 32; i++, pow *= 2)
            if (bits[i] % 3 != 0) res += pow;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,-2,1,1,-3,1,-3,-3,-4,-2};
        System.out.println(singleNumber(nums));
    }
}
