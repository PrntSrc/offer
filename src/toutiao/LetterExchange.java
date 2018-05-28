package toutiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-25
 */
public class LetterExchange {

    public static int getMaxLen(String s, int m) {
        int res = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> list = map.get(c);
            if (list == null) list = new ArrayList<>();
            list.add(i);
            map.put(c, list);
        }
        Iterator iter = map.values().iterator();
        while (iter.hasNext()) {
            List<Integer> list = (List<Integer>) iter.next();
            for (int i = 0; i < list.size(); i++) {

            }

        }
        return res;
    }

    private static int getMax(int[] letters) {
        int max = 0;
        for (int l : letters)
            if (l > max) max = l;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = sc.nextInt();
        System.out.println(getMaxLen(s, m));
    }
}
