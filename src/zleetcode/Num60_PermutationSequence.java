package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-06-09
 */
public class Num60_PermutationSequence {

    private static String res;
    private static Integer count;

    public static String getPermutation(int n, int k) {
        char[] c = new char[n];
        for (int i = 0; i < n; i++) c[i] = (char) (i + '1');
        permutation(n, k, c, 0);
        return res;
    }

    private static void permutation(int n, int k, char[] c, int start) {
        if (start == n - 1) count++;
        if (count == k) res = String.valueOf(c);
        for (int i = start; i < n; i++) {
            exchange(start, i, c);
            permutation(n, k, c, start + 1);
            exchange(start, i, c);
        }
    }

    private static void exchange(int x, int y, char[] c) {
        char t = c[x];
        c[x] = c[y];
        c[y] = t;
    }

    public static void main(String[] args) {
        int n = 4, k = 9;
        System.out.println(getPermutation(n, k));
    }
}
