package sort;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-03-27
 */
public class MergeSort {

    private static int[] temp;

    public static void mergeSort(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums,0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int l, int h) {
        if (l >= h) return;
        int m = l + (h - l) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, h);
        merge(nums, l, m, h);
    }

    private static void merge(int[] nums, int l, int m, int h) {
        int i = l, j = m + 1;
        for (int k = l; k <= h; k++)
            temp[k] = nums[k];
        for (int k = l; k <= h; k++){
            if (i > m) nums[k] = temp[j++];
            else if (j > h) nums[k] = temp[i++];
            else if (temp[i] <= temp[j]) nums[k] = temp[i++];
            else nums[k] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 3, 7, 6, 5, 1, 8, 0, 2};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
