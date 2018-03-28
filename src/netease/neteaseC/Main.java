package netease.neteaseC;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-27
 */
public class Main {

//    public static int getMaxSal(int n, int[] har, int[] sal, int cav) {
//        int[] dp = new int[cav + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = cav; j >= 0; j--) {
//                if (j >= har[i - 1])
//                    dp[j] = Math.max(dp[j], dp[j - har[i - 1]] + sal[i - 1]);
//            }
//        }
//        return dp[cav];
//    }
//    public static void getMaxSal(int n, int[] har, int[] sal, int[] cav) {
//        selectSort(har, sal);
//        for (int i = 0; i < cav.length; i++) {
//            for (int j = 0; j < har.length; j++) {
//                if (cav[i] == har[j]) {
//                    System.out.println(sal[j]);
//                    break;
//                }
//                if (j != har.length - 1 && cav[i] > har[j] && cav[i] < har[j + 1]) {
//                    System.out.println(sal[j]);
//                    break;
//                }
//            }
//        }
//    }

    public static void getMaxSal(int n, int[] har, int[] sal, int[] cav) {
        selectSort(har, sal);
        for (int aCav : cav) {
            int index = getNoGreaterThanK(har, aCav);
            System.out.println(sal[index]);
        }
    }

    /**
     * get the index of result that no greater than k in sorted array num;
     * @param sortedArray the sorted array for searching
     * @param k the value to search
     * @return the index of result
     */
    private static int getNoGreaterThanK(int[] sortedArray, int k) {
        int l = 0, h = sortedArray.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (sortedArray[m] == k) return m;
            else if (sortedArray[m] < k) l = m + 1;
            else h = m - 1;
        }
        return h;
    }

    private static void selectSort(int[] har, int[] sal) {
        for (int i = 0, j; i < har.length - 1; i++) {
            int k = i;
            for (j = i + 1; j < har.length; j++) {
                if (har[j] < har[k]) k = j;
            }
            exchange(har, k, i);
            exchange(sal, k, i);
        }
    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] har = new int[n];
//        int[] sal = new int[n];
//        int[] cav = new int[m];
//        for (int i = 0; i < n; i++) {
//            har[i] = sc.nextInt();
//            sal[i] = sc.nextInt();
//        }
//        for (int i = 0; i < m; i++)
//            cav[i] = sc.nextInt();
//        getMaxSal(n, har, sal, cav);
        int n = 7;
        int[] har = new int[] {7, 3, 4, 9, 1, 8, 6};
        int[] sal = new int[] {70, 30, 40, 90, 10, 80, 60};
        int[] cav = new int[] {7, 4, 5, 10, 2, 12, 2};
        getMaxSal(n, har, sal, cav);
//        System.out.println(getNoGreaterThanK(har, 41));

    }
}
