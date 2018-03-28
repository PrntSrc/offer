package aoffer;

import java.util.Stack;

/**
 * todo
 * @author Yue Lin
 * @since 2018-03-23
 */
public class Num40_GetLeastKNum {

    public static Stack getLeastKNum(int[] nums, int k) {
        if (nums == null || nums.length < k) return null;
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; stack.size() != k; i++) {
            if (nums[i] < stack.peek())
                stack.push(nums[i]);
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        getLeastKNum(nums, k).stream().forEach(System.out::println);
    }
}
