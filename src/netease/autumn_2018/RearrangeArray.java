package netease.autumn_2018;

import java.util.Scanner;

/**
 * todo
 * @author Yue Lin
 * @since 2018-03-21
 */
public class RearrangeArray {

    public static String isMultipleOf4(int[] A) {
        int[] flags = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (flags[j] == 2) j++;
                long k = 0L;
                if (j < A.length)
                    k = A[i] * A[j];
                if (j == A.length - 1 && k % 4 != 0)
                    return "No";
                else flags[j]++;
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
            System.out.println(isMultipleOf4(A));
        }
    }
}
