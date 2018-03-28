package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-18
 */
public class Num3_DuplicateNum {

    public static int getOneOfDuplicateNumsWithoutChange(int[] nums) {
        return getOneOfDuplicateNumsWithoutChange(nums, 0, 7);
    }

    private static int getOneOfDuplicateNumsWithoutChange(int[] nums, int l, int h) {
        if (l >= h) return nums[l];
        int m = l + (h - l) / 2;
        int left = countPart(nums, l, m);
        int right = countPart(nums, m + 1, h);
        if (left < right) getOneOfDuplicateNumsWithoutChange(nums, l, m);
        else getOneOfDuplicateNumsWithoutChange(nums, m + 1, h);
        return nums[l];
    }

    private static int countPart(int[] nums, int l, int h) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] <= l && nums[i] >= h)
                count++;
        return count;
    }

    public static int getOneOfDuplicateNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[i] != nums[nums[i]]) {
                    int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                } else
                    return nums[i];
                i--;
            }
        }
        return -1; // nums.length = 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(getOneOfDuplicateNumsWithoutChange(nums));
    }
}
