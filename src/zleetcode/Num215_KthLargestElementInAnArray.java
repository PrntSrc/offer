package zleetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Yue Lin
 * @since 2018-05-10
 */
public class Num215_KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
}
