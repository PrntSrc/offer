package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-16
 */
public class Num628_MaximumProductOfThreeNumbers {

    public static int maximumProduct(int[] nums) {
        Integer min1 = null, min2 = null, max1 = null, max2 = null, max3 = null;
        for (int num : nums) {
            if (min1 == null || num < min1) {
                min2 = min1;
                min1 = num;
            } else if (min2 == null || num < min2) min2 = num;
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) max3 = num;
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }
}
