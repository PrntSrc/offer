package toutiao.toutiaoB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Main {

    public static int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0, j = 0; i < nums.length; i++) {
            for (j = Math.max(j, i + 1); j < nums.length && nums[j] - nums[i] < k; j++);
//            for (j = Math.max(j, i + 1); j < nums.length && (long) nums[j] - nums[i] < k; j++) ;
            if (j < nums.length && nums[j] - nums[i] == k) ans++;
//            if (j < nums.length && (long) nums[j] - nums[i] == k) ans++;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
//            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(findPairs(nums, k));
    }
}
