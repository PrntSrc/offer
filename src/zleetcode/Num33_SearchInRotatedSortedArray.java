package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class Num33_SearchInRotatedSortedArray {

    public static int getIndexOfTarget(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) return m;
            if (nums[l] <= nums[m]) {
                if (nums[l] <= target && nums[m] > target) h = m - 1;
                else l = m + 1;
            } else {
                if (nums[h] >= target && nums[m] < target) l = l + 1;
                else h = m - 1;
            }
        }
        return nums[l] == target ? l : -1;
    }

    public static void main(String[] args) {
        System.out.println(0 <= 1);
    }
}
