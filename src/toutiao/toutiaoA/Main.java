package toutiao.toutiaoA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Main {

    public static int getPairNum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - k) || set.contains(nums[i] + k)) {
                count++;
                set.remove(nums[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(getPairNum(nums, k));
    }
}
