package souhu.souhuB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class Main {

    public static void getKMinNum(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            if (i != k - 1) {
                System.out.print(nums[i] + ",");
            } else System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        getKMinNum(nums, k);
    }
}
