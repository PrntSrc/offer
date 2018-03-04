package toutiao.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/2
 */
public class UserPreferences {

    public static void getPreferenceKNum(int[] preferences, int l, int r, int k) {
        int num = 0;
        for (int i = l - 1; i < r; i++) {
            if (preferences[i] == k)
                num++;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preferences = new int[n];
        for (int i = 0; i < n; i++)
            preferences[i] = sc.nextInt();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            getPreferenceKNum(preferences, l, r, k);
        }
    }
}
