package baidu.spring_2017;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Yue on 2018/1/1.
 * 买帽子
 */
public class BuyHat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] price = new int[N];
        for (int i = 0; i < N; i++)
            price[i] = sc.nextInt();
        System.out.println(buyHat(price));
    }

    public static int buyHat(int[] price) {
        Integer first = null, second = null, third = null;
        Set<Integer> set = new HashSet<>();
        for (int p : price) set.add(p);
        for (int p : set) {
            if (first == null || p < first) {
                third = second;
                second = first;
                first = p;
            }
            else if (second == null || p < second) {
                third = second;
                second = p;
            }
            else if (third == null || p < third)
                third = p;
        }
        return third == null ? -1 : third;
    }
}
