package zbook;

import java.util.Arrays;

/**
 * @author Yue
 * @since 2018/3/1
 */
public class QuickSort {

    public static void sort(int[] nums, int l, int h) {
        if (l >= h) return;
        int v = partition(nums, l, h);
        sort(nums, l, v - 1);
        sort(nums, v + 1, h);
    }

    private static int partition(int[] nums, int l, int h) {
        int i = l, j = h + 1;
        int v = nums[i];
        while (true) {
            while (nums[++i] < v) if (i == h) break;
            while (nums[--j] > v) if (j == l) break;
            if (i >= j) break;
            exchange(nums, i, j);
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
        int[] nums = new int[] {2, 3, 9, 4, 5, 7};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
