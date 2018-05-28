package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-25
 */
public class Num838_PushDominoes {

    public static String pushDominoes(String dominoes) {
        char[] ds = dominoes.toCharArray();
        StringBuilder right = new StringBuilder();
        StringBuilder left = new StringBuilder();
        int i = 0, j = ds.length - 1;
        while (i < ds.length && ds[i++] == '.') right.append('.');
        while (j >= 0 && ds[j--] == '.') left.append('.');
        right.append(ds[i]);
        left.append(ds[j]);
        left = left.reverse();
        for (i++, j--; i < ds.length && j >= 0; i++, j--) {
            if (ds[i] == '.' && ds[i - 1] == 'R') right.append('R');
            else right.append(ds[i]);
            if (ds[j] == '.' && ds[j + 1] == 'L') right.append('L');
            else left.append(ds[i]);
        }
        for (int k = 0; k < ds.length; k++) {
            if (right.charAt(k) == left.charAt(k) && ds[k] == '.') ds[k] = right.charAt(k);
            else if (right.charAt(k) != '.' && left.charAt(k) != '.' && ds[k] != '.') {
                int c = 1;
                int t = k + 1;
                while (t < ds.length && right.charAt(t) != '.' && left.charAt(t) != '.' && ds[t] != '.') {
                    t++;
                    c++;
                }
                int n = k + c / 2;
                while (k < n) ds[k++] = 'R';
                k += (c & 1);
                while (k < k + c - 1) ds[k++] = 'L';
            }
        }
        return Arrays.toString(ds);
    }

    public static void main(String[] args) {
        String dominoes = ".L.R...LR..L..";
        System.out.println(pushDominoes(dominoes));
    }
}
