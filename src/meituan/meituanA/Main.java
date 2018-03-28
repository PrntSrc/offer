package meituan.meituanA;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-22
 */
public class Main {

    public static int getMin(String s) {
        int[] nums = new int[10];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - '0']++;
        }
        int m = -1, n = -1;
        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                if (m == -1) {
//                    m = nums[i];
//                    nums[i]--;
//                } else if (n == -1) {
//                    n = nums[i];
//                    nums[i]--;
//                }
//                i--;
//            }
//            if (m != -1 && n != -1) break;
        }
        return m * 10 - n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getMin(s));
    }
}
