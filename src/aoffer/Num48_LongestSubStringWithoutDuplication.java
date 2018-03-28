package aoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yue Lin
 * @since 2018-03-26
 */
public class Num48_LongestSubStringWithoutDuplication {

    public static String getLongestSubString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int head = 0, resH = 0, cur, len = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= head)
                head = map.get(c) + 1;
            map.put(c, i);
            cur = i - head + 1;
            if (cur >= len) {
                len = cur;
                resH = head;
            }
        }
        return s.substring(resH, resH + len);
    }

    public static String getLongestSubStringByDp(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int head = 0, resH = 0, cur = 0, len = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int ci = map.get(c);
                if (i - ci <= cur) {
                    head = ci + 1;
                    cur = i - ci;
                } else cur++;
            } else cur++;
            map.put(c, i);
            if (len <= cur) {
                len = cur;
                resH = head;
            }
        }
        return s.substring(resH, resH + len);
    }

    public static void main(String[] args) {
        String s = "arabcacfd";
        System.out.println(getLongestSubString(s));
        System.out.println(getLongestSubStringByDp(s));
    }
}
