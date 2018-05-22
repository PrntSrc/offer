package aoffer;

/**
 * todo 按书里重做 重做！！
 * @author Yue Lin
 * @since 2018-03-18
 */
public class Num11_MinInRotatedArray {

//    public static Integer getMin(int[] nums) {
//        if (nums.length == 0) return null;
//        int l = 0, r = nums.length - 1, m;
//        while (l < r - 1) {
//            m = l + (r - l) / 2;
//            if (nums[m] == nums[l] && nums[m] == nums[r]) {
//                // 遍历
//            } else if (nums[m] < nums[r]) r = m;
//            else if (nums[m] > nums[r]) l = m;
//        }
//        return nums[r];
//    }

    public static Integer getMin(int[] array) {
        int len = array.length;
        if (len == 0) return 0;
        int l = 0, r = len - 1, m = 0;
        while (array[l] >= array[r]) {
            m = l + (r - l) / 2;
            if (r - l == 1) {
                return array[r];
            }
            if (array[l] == array[m] && array[m] == array[r]) {
                int res = array[l];
                for (int i = l + 1; i <= r; i++)
                    res = Math.min(res, array[i]);
                return res;
            }
            if (array[m] >= array[l]) l = m;
            else r = m;
        }
        return array[m];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 0, 1, 1, 1};
        System.out.println(getMin(nums));
    }
}
