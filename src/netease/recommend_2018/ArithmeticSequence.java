package netease.recommend_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 等差数列
 * @author Yue
 * @since 2018/1/21
 */
public class ArithmeticSequence {

    public static String isArithmeticSequence(int n, int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (nums[i + 2] - nums[i + 1] != nums[i + 1] - nums[i])
                return "Impossible";
        }
        return "Possible";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(isArithmeticSequence(n, nums));
    }
}
