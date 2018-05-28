package toutiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-24
 */
public class UserPreferences {

    public static void getKUserNum(int n, int q, Map<Integer, List<Integer>> map, int[][] queries) {
        for (int i = 0; i < q; i++) {
            List<Integer> list = map.get(queries[i][0]);
            if (list == null) System.out.println(0);
            else {

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int preference = sc.nextInt();
            List<Integer> list = map.get(preference);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(i, list);
        }
        int q = sc.nextInt();
        int[][] queries = new int[q][3];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }
        getKUserNum(n, q, map, queries);
    }
}
