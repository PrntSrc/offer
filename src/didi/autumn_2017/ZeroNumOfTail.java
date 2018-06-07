package didi.autumn_2017;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-06-03
 */
public class ZeroNumOfTail {

    public static int getZeroNumOfTail(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int t = i;
            while (t % 5 == 0) {
                t /= 5;
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getZeroNumOfTail(n));
    }
}
