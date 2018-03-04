package netease.recommend_2018;

import java.util.Scanner;

/**
 * 堆棋子
 * @author Yue
 * @since 2018/1/27
 */
public class PutPiece {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            y[i] = sc.nextInt();
    }
}
