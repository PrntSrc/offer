package netease.autumn_2018;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-19
 */
public class OppositeNumber {

    public static long getOppositeNumber(int n) {
        int bits = 0, temp = n;
        while (temp != 0) {
            bits++;
            temp /= 10;
        }
        long res = n;
        double pow = Math.pow(10, bits - 1);
        for (int i = bits; i > 0; i--, n /= 10, pow /= 10)
            res += (n % 10) * pow;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getOppositeNumber(n));
    }
}
