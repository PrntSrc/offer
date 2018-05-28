package aoffer;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class Num21_MoveOddEven {

//    public static void movdOddEven(int[] nums) {
//        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
//            while ((nums[i] & 1) == 1) i++;
//            while ((nums[j] & 1) == 0) j--;
//            if (i < j) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//            }
//        }
//    }

    public static void movdOddEven(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && (nums[i] & 1) == 1) i++;
            int j = i;
            while (j < nums.length && (nums[j] & 1) == 0) j++;
            if (j < nums.length) {
                int temp = nums[j];
                while (j > i) nums[j] = nums[--j];
                nums[j] = temp;
            } else return;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        movdOddEven(nums);
        System.out.println(Arrays.toString(nums));
    }
}
