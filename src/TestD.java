import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-04-09
 */
public class TestD {

    public static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && nums[j] < nums[j - 1]) {
                exchange(nums, j - 1, j);
                j--;
            }
        }
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) min = j;
            }
            exchange(nums, i, min);
        }
    }

//    public static void bubbleSort(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int )
//        }
//    }
    private static int[] temp;

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
            else if (temp[i] <= temp[j]) nums[k] = temp[i++];
            else nums[k] = temp[j++];
        }
    }

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int l, int h) {
        if (l >= h) return;
        int k = partition(nums, l, h);
        quickSort(nums, l, k - 1);
        quickSort(nums, k + 1, h);
    }

    private static int partition(int[] nums, int l, int h) {
        int m = nums[l];
        int i = l, j = h + 1;
        while (true) {
            while (nums[++i] <= m) if (i == h) break;
            while (nums[--j] >= m) if (j == l) break;
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
//        int[] nums = new int[] {5, 4, 3, 9, 6, 1, 0, 8};
//        quickSort(nums);
//        System.out.println(Arrays.toString(nums));
        boolean b1 = true;
        boolean b2 = true;
        System.out.println(b1 && b2);
    }
}
