package jingdong.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/12
 */
public class SecurityPlan {

    public static int getSentryPairNum(int[] height) {
        if (height.length < 2) return 0;
        if (height.length == 2) return 1;
        int curMaxHeight = height[0], maxHeight = height[0], countPair = 0;
        for (int i = 2; i < height.length; i++) {
            if (height[i - 1] > height[i - 2]) {
                curMaxHeight = height[i];
                maxHeight = Math.max(curMaxHeight, maxHeight);
                countPair++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++)
                height[i] = sc.nextInt();
            System.out.println(getSentryPairNum(height));
        }
    }
}
