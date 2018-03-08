package zbook;

/**
 * @author Yue
 * @since 2018/3/5
 */
public class OddEvenArray {

    public static void changeTo(int[] nums) {
        if (nums.length <= 0) return;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && (nums[i] & 0x1) != 0) i++;
            while (i < j && (nums[j] & 0x1) != 1) j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 4, 6, 7, 10, 12};
        changeTo(nums);
        for (int i : nums)
            System.out.println(i);
    }
}
