import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class TestA {

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int l, int h) {
        if (l >= h) return;
        int m = partition(nums, l, h);
        quickSort(nums, l, m - 1);
        quickSort(nums, m + 1, h);
    }

    private static int partition(int[] nums, int l, int h) {
        int i = l, j = h + 1, v = nums[l];
        while (true) {
            while (nums[++i] < v) if (i == h) break;
            while (nums[--j] > v) if (j == l) break;
            if (i >= j) break;
            else exchange(nums, i, j);
        }
        exchange(nums, l, j);
        return j;
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 2, 6, 7, 5, 4, 8};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
