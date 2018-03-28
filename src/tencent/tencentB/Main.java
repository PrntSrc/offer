package tencent.tencentB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-23
 */
public class Main {

    public static String isSquare(int[] xs, int[] ys) {
        double[] lens = new double[6];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                lens[k++] = Math.sqrt((xs[i] - xs[j]) * (xs[i] - xs[j]) + (ys[i] - ys[j]) * (ys[i] - ys[j]));
            }
        }
        Map<Double, Integer> map = new HashMap<>();
        for (double l : lens) {
            if (map.containsKey(l))
                map.put(l, map.get(l) + 1);
            else
                map.put(l, 1);
        }
        if (map.values().size() != 2) return "No";
        int[] a = new int[2];
        int t = 0;
        for (Map.Entry entry : map.entrySet()) {
            a[t++] = (Integer)entry.getValue();
        }
        if ((a[0] == 2 && a[1] == 4) || (a[0] == 4 && a[1] == 2))
            return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int[] xs = new int[4];
            int[] ys = new int[4];
            for (int i = 0; i < 4; i++) {
                xs[i] = sc.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                ys[i] = sc.nextInt();
            }
            System.out.println(isSquare(xs, ys));
        }
    }
}
