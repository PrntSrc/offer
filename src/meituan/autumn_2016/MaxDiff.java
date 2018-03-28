package meituan.autumn_2016;

/**
 * @author Yue Lin
 * @since 2018-03-17
 */
public class MaxDiff {

    public static int getMaxDiff(int[] A, int n) {
        int diff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                diff = Math.max(A[j] - A[i], diff);
            }
        }
        return diff < 0 ? 0 : diff;
    }

    public static void main(String[] args) {

    }
}
