package zbook;

/**
 * @author Yue
 * @since 2018/3/11
 */
public class MoreThanHalfNumber {

    public static Integer getNumber(int[] nums) {
        if (nums.length == 0) return null;
        int res = 0, count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (count == 0) {
                res = nums[i];
                count++;
            } else if (nums[i + 1] == nums[i]) count++;
            else count--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 5, 3, 2, 5, 5, 5, 4, 2};
        System.out.println(getNumber(nums));
    }

}
