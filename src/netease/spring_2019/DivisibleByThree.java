package netease.spring_2019;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-10
 */
public class DivisibleByThree {

    public static int countNumDivByThree(int l, int r) {
        int sum = 0, count = 0;
        for (int i = 1; i < l; i++) sum += i;
        while (l <= r) {
            sum += l;
            if (sum % 3 == 0) {
                count++;
                sum = 0;
            }
            l++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(countNumDivByThree(l, r));
    }
}
