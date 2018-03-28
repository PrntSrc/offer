package aoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Num38_StringPermutation {

    public static List getPermutations(String s) {
        return getPermutations(s, "", new ArrayList<>(), 0);
    }

    private static List getPermutations(String s, String t, List<String> permutations, int index) {
        if (t.length() == s.length()) {
            permutations.add(t);
            return permutations;
        }
        if (index == s.length()) return permutations;
        getPermutations(s, t + s.charAt(index), permutations, index + 1);
        getPermutations(s, t, permutations, index + 1);
        return permutations;
    }

    public static void main(String[] args) {
        String s = "abc";
        getPermutations(s).stream().forEach(System.out::println);
    }
}
