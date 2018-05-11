package zleetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-05-09
 */
public class Num187_RepeatedDNASequences {

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> words = new HashSet<>();
        Set<Integer> doubled = new HashSet<>();
        List<String> res = new ArrayList<>();
        char[] map = new char[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        for (int i = 0; i < s.length() - 9; i++) {
            int v = 0;
            for (int j = i; j < i + 10; j++) {
                v <<= 2;
                v |= map[s.charAt(j) - 'A'];
            }
            if (!words.add(v) && doubled.add(v))
                res.add(s.substring(i, i + 10));
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AAAAAAAAAAAA";
        List<String> res = findRepeatedDnaSequences(s);
        res.forEach(System.out::println);
    }

}
