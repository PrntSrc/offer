package aoffer;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Num63_MaxStockProfit {

    public static int getMaxProfit(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int max = 0, min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            else max = Math.max(max, nums[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 11, 8, 5, 7, 12, 16, 14};
        System.out.println(getMaxProfit(nums));
    }
}
