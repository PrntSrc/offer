package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-04-01
 */
public class Num55_JumpGame {

    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
}
