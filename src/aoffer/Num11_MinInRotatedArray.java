package aoffer;

/**
 * todo 按书里重做
 * @author Yue Lin
 * @since 2018-03-18
 */
public class Num11_MinInRotatedArray {

    public static Integer getMin(int[] nums) {
        if (nums.length == 0) return null;
        int l = 0, r = nums.length - 1, m;
        while (l < r - 1) {
            m = l + (r - l) / 2;
            if (nums[m] == nums[l] && nums[m] == nums[r]) {
                // 遍历
            } else if (nums[m] < nums[r]) r = m;
            else if (nums[m] > nums[r]) l = m;
        }
        return nums[r];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 0, 1, 1, 1};
        System.out.println(getMin(nums));
    }
}
