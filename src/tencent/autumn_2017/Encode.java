package tencent.autumn_2017;

import java.util.Scanner;

/**
 * 编码
 * @author Yue
 * @since 2018/2/21
 */
public class Encode {

    public static long getIndex(String s) {
        long res = 0;
        for (int i = 0; i < s.length(); i++)
            res += (s.charAt(i) - 'a') * powSum(25, 3 - i);
        return res + s.length() - 1;
    }

    private static long powSum(int a, int b) {
        long sum = 0;
        for (int i = 0; i <= b; i++)
            sum += Math.pow(a, i);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getIndex(s));
    }
}
