package aoffer;

import java.util.Arrays;

/**
 * require time O(n) space O(1)
 * @author Yue Lin
 * @since 2018-03-29
 */
public class Num56_FindNumsAppearOnce {

    public static int[] getNumsAppearOnce(int[] nums) {
        int[] res = new int[2];
        int xorRes = 0;
        for (int n : nums)
            xorRes ^= n;
        int k = getFirstBitEqualsOne(xorRes);
//        System.out.println(k);
        int i = -1, j = nums.length;
        while (i < j) {
            while (isKBitEqualsOne(nums[++i], k)) if (i == nums.length - 1) break;
            while (!isKBitEqualsOne(nums[--j], k)) if (j == 0) break;
            if (i < j) exchange(nums, i, j);
        }
//        System.out.println(j);
//        System.out.println(Arrays.toString(nums));
        for (int m = 0; m <= j; m++)
            res[0] ^= nums[m];
        for (int m = j + 1; m < nums.length; m++)
            res[1] ^= nums[m];
        return res;
    }

    private static int getFirstBitEqualsOne(int num) {
        int index = 0;
        while ((num & 1) != 1) {
            num >>= 1;
            index++;
        }
        return index;
    }

    private static boolean isKBitEqualsOne(int num, int k) {
        while (k-- > 0)
            num >>= 1;
        return (num & 1) == 1;
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 4, 3, 6, 3, 2, 5, 5};
        System.out.println(Arrays.toString(getNumsAppearOnce(nums)));
    }
}
