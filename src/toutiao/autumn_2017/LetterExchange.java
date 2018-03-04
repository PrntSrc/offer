package toutiao.autumn_2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/2
 */
public class LetterExchange {

    public static int getSameLetterNum(String s, int m) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                List<Integer> indexs = map.get(s.charAt(i));
                indexs.add(i);
                map.put(s.charAt(i), indexs);
            } else {
                List<Integer> indexs = new ArrayList<>();
                indexs.add(i);
                map.put(s.charAt(i), indexs);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = sc.nextInt();
        System.out.println(getSameLetterNum(s, m));
    }
}
