package tencent.tencentD;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-05
 */
public class Main {

    public static int getWayNum(int k, int a, int x, int b, int y) {
        int[] music = new int[] {a, b};
        int[] count = new int[2];
        int[] dp = new int[k + 1];
        int[] pre = new int[k + 1];
        int[] ans = new int[k + 1];
        int min = Math.min(a, b);
        int max = Math.max(a, b);
//        dp[0] = 2;
//        dp[1] = 3;
//        dp[min] = min;
//        dp[max] = max;
        for (int i = 0; i < music.length; i++) {
            for (int j = music[i]; j <= k; j++) {
                dp[j] = Math.max(dp[j], dp[j - music[i]] + music[i]);
                pre[j] = j - music[i];
            }
        }

//        for (int i = music.length - 1, j = k; i >= 0 && j >= music[i]; i--) {
//            if (dp[j] == dp[j - music[i]] + music[i]) {
//                System.out.print(i + " ");
//                j -= music[i];
//            }
//        }
        int t=k;
        while(true)
        {
            if(pre[t]==0) break;
            ans[t-pre[t]]++;
            t=pre[t];
        }
        for (int l : ans)
            System.out.println(l);

//        int t = k;
//        while (pre[t] != 0) {
//            ans[t - pre[t]]++;
//            t = pre[t];
//        }
//
//        for (long i : ans)
//            System.out.println(i);
        return dp[k];
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int a = sc.nextInt();
//        int x = sc.nextInt();
//        int b = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(getWayNum(k, a, x, b, y));
        System.out.println(getWayNum(7, 2, 3, 3, 3));
    }

}
