package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-23
 */
public class Num39_MoreThanHalfNum {

    public static int getMoreThanHalfNum(int[] nums) throws Exception {
        if (nums == null || nums.length == 0) {
            throw new Exception("null arrays exceptions");
        }
        int cur = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == cur) count++;
            else count--;
            if (count == 0) {
                cur = nums[i];
                count = 1;
            }
        }
        return cur;
    }

    public static int getMoreThanHalfNum2(int[] nums) throws Exception {
        if (nums == null || nums.length == 0) {
            throw new Exception("input error");
        }
        int l = 0, h = nums.length - 1, m = nums.length >> 1;
        int index = partition(nums, l, h);
        while (m != index) {
            if (index <= m) {
                l = m + 1;
                index = partition(nums, l, h);
            } else {
                h = m - 1;
                index = partition(nums, l, h);
            }
        }
        return nums[index];
    }

    private static int partition(int[] nums, int l, int h) {
        int v = nums[l], i = l, j = h + 1;
        while (true) {
            while (nums[++i] <= v) if (i == h) break;
            while (nums[--j] >= v) if (j == l) break;
            if (i >= j) break;
            if (i < j) exchange(nums, i, j);
        }
        exchange(nums, l, j);
        return j;
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(getMoreThanHalfNum2(nums));
    }
}
