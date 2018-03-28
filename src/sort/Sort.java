package sort;

import java.util.Arrays;

/**
 * @author Yue
 * @since 2018/3/15
 */
public class Sort {

    private static int[] temp;

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1])
                    exchange(nums, j, j + 1);
            }
        }
    }

    public static void selectSort(int[] nums) {
        for (int i = 0, j; i < nums.length - 1; i++) {
            int k = i;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[k]) k = j;
            }
            exchange(nums, k, i);
        }
    }

    public static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && nums[j] < nums[j - 1]) exchange(nums, j, j -1);
        }
    }

    public static void mergeSort(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
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
        for (int k = l; k <= h; k++) {
            if (i > m) nums[k] = temp[j++];
            else if (j > h) nums[k] = temp[i++];
            else if (temp[i] > temp[j]) nums[k] = temp[j++];
            else nums[k] = temp[i++];
        }
    }

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int l, int h) {
        if (l >= h) return;
        int j = partition(nums, l, h);
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, h);
    }

    private static int partition(int[] nums, int l, int h) {
        int v = nums[l], i = l, j = h + 1;
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
        int[] nums = new int[] {3, 2, 4, 8, 10, 2, 0};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
