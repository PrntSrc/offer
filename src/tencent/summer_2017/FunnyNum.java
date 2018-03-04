package tencent.summer_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/1/29
 */
public class FunnyNum {

    public static void funnyNum(int[] nums) {
        int min = Integer.MAX_VALUE, max = 0, countMin = 0, countMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                if (diff < min) {
                    min = diff;
                    countMin = 1;
                } else if (diff == min) countMin++;
                if (diff > max) {
                    max = diff;
                    countMax = 1;
                } else if (diff == max) countMax++;
            }
        }
        System.out.println(countMin + " " + countMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            funnyNum(nums);
        }
    }
}
