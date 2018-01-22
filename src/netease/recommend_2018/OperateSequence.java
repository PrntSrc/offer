package netease.recommend_2018;

import java.util.Scanner;

/**
 * 操作序列
 * @author Yue
 * @since 2018/1/21
 */
public class OperateSequence {

    public static String operateNTimes(int n, int[] nums) {
        int[] b = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                b[n / 2 - i - 1] = nums[ ];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : b)
            sb.append(i).append(" ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(operateNTimes(n, nums));
    }
}
