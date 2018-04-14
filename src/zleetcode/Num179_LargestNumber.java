package zleetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class Num179_LargestNumber {

    public static String largestNumber(int[] nums) {
        String[] sn = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            sn[i] = String.valueOf(nums[i]);
        // 逆序
        Comparator<String> comp = (o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        };
        Arrays.sort(sn, comp);
        if (sn[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for (String s :sn)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }
}
