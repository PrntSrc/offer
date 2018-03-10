package meituan.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/9
 */
public class MonopolyGame {

    public static int getWaysToNSteps(int n) {
        int i = 1;
        while (--n > 0)
            i <<= 1;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getWaysToNSteps(n));
    }
}
