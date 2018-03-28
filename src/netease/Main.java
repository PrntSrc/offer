package netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-21
 */
public class Main {

    public static int isExisted(int[][] nums, int key) {
        int len = nums.length, i = 0, j = len - 1;
        while (i < len && j >= 0) {
            if (key > nums[i][j]) i++;
            else if (key < nums[i][j]) j--;
            else return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
                if (!sc.hasNext()) {
                    System.out.println(sc.nextInt());
                    System.out.println("input error");
                    return;
                }
            }
        }
        int key = sc.nextInt();
        System.out.println(isExisted(nums, key));
    }
}
