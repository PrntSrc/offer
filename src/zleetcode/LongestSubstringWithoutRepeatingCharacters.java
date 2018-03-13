package zleetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yue
 * @since 2018/3/13
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int getLongestSubstringLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, len = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j)))
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            map.put(s.charAt(j), j);
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(getLongestSubstringLength(s));
    }
}
