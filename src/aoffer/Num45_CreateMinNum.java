package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-25
 */
public class Num45_CreateMinNum {

    private static long min = Integer.MAX_VALUE;

    public static void createMinNum(int[] nums) {
        createMinNum(nums, 0, "");
    }

    private static void createMinNum(int[] nums, int len, String s) {
        if (len == nums.length) {
            min = Math.min(min, Integer.valueOf(s));
            System.out.println(min);
            return;
        }

        for (int i = len; i < nums.length; i++) {
            exchange(nums, i, len);
            createMinNum(nums, len + 1, s + nums[i]);
            exchange(nums, len, i);
        }
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 32, 321};
        createMinNum(nums);
        System.out.println("-----" + min);
//        System.out.println(createMinNum(nums));
    }
}
