import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-08
 */
public class TestB {

    private static int[] temp;

    public static void mergeSort(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int[] temp, int l, int r) {
        if (l == r) return;
        int m = l + (r - l) / 2;
        mergeSort(nums, temp, l, m);
        mergeSort(nums, temp, m + 1, r);
        merge(nums, temp, l, m, r);
    }

    private static void merge(int[] nums, int[] temp, int l, int m, int r) {
        int i = l, j = m + 1;
        for (int k = l; k <= r; k++) temp[k] = nums[k];
        for (int k = l; k <= r; k++) {
            if (i > m) nums[k] = temp[j++];
            else if (j > r) nums[k] = temp[i++];
            else if (temp[i] <= temp[j]) nums[k] = temp[i++];
            else nums[k] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 2, 6, 7, 5, 4, 8};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
