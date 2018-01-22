package netease.spring_2017;

import java.util.Scanner;

public class MagicBracelet {

    public static String getKthStatus(int[] nums, int n, int k) {
        for (int i = 0, temp = nums[0] % 100; i < n * k; i++) {
            if (i % n == 0)
                temp = nums[0] % 100;
            if ((i + 1) % n != 0)
                nums[i % n] = nums[i % n] % 100 + nums[(i + 1) % n] % 100;
            else
                nums[i % n] = nums[i % n] % 100 + temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : nums)
            sb.append(i % 100).append(" ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(getKthStatus(nums, n, k));
    }
}
