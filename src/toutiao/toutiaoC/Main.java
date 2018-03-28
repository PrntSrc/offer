package toutiao.toutiaoC;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Main {

    private static int min = Integer.MAX_VALUE;

    public static void getMinStep(int len) {
        getMinStepHelper(1,1, len, 0);
    }

    private static void getMinStepHelper(int m, int s, int len, int count) {
        if (s > len) return;
        if (s == len) {
            min = Math.min(min, count);
//            System.out.println(count);
            return;
        }
        getMinStepHelper(s,s + s, len, count + 1);
        getMinStepHelper(m,s + m, len, count + 1);
//        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        getMinStep(len);
        System.out.println(min);
//        System.out.println(getMinStep(len));
    }
}
