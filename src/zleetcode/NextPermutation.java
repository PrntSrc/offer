package zleetcode;

/**
 * leetcode 31 medium unsolved
 * @author Yue
 * @since 2018/1/27
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 1, j = nums.length;
        if (i <= 0) return;
        while (i > 0 && nums[i - 1] > nums[i]) i--;
        if (i != 0 && i != nums.length - 1) {
            while (j >= 0 && nums[j] < nums[i - 1]) j--;
            exchange(nums, i - 1, j);
        }
        for (int k = 0; k < (nums.length - i) / 2; k++) {
            exchange(nums, k + i, nums.length - k - 1);
        }
    }

    private void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
