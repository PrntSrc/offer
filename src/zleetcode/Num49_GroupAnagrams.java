package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yue Lin
 * @since 2018-04-23
 */
public class Num49_GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        for (List<String> str : groupAnagrams(strs))
            System.out.println(Arrays.toString(str.toArray(new String[]{})));
    }
}
