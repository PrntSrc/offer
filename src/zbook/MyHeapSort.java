package zbook;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-03-25
 */
public class MyHeapSort {

    public static void heapSort(int[] nums) {
        int n = nums.length - 1;
        for (int i = n / 2; i >= 1; i--)
            sink(nums, n, i);
        while (n > 1) {
            exchange(nums, 1, n--);
            sink(nums, n, 1);
        }

    }

    private static void sink(int[] nums, int n, int k) {
        while (2 * k <= n) {
            int i = 2 * k;
            if (i < n && nums[2 * k] < nums[2 * k + 1]) i++;
            if (nums[k] >= nums[i]) break;
            exchange(nums, k, i);
            k = i;
        }
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    private static boolean less(int[] nums, int x, int y) {
        return nums[x] < nums[y];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
