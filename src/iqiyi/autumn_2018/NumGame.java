package iqiyi.autumn_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-28
 */
public class NumGame {

    public static int getMax(int n, String[] x) {
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(Integer.valueOf(sort(x[i].toCharArray())), max);
        return max;
    }

    private static String sort(char[] c) {
        Arrays.sort(c);
        int i = 0;
        while (c[i] == '0') i++;
        return String.valueOf(c, i, c.length - i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] x = new String[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.next();
        System.out.println(getMax(n, x));
    }
}
