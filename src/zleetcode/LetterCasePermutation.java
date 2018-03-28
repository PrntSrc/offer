package zleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-03-19
 */
public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        helper(s, "", 0, list);
        return list;
    }

    private static void helper(String s, String res, int index, List list) {
        if (index == s.length()) {
            list.add(res);
            return;
        }
        if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
            res += (char) (s.charAt(index) - 32);
            helper(s, res, index + 1, list);
        } else if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
            res += (char) (s.charAt(index) + 32);
            helper(s, res, index + 1, list);
        } else {
            res += s.charAt(index);
            helper(s, res, index + 1, list);
        }
    }

    public static void main(String[] args) {
        String s = "a1b2";
        letterCasePermutation(s).stream().forEach(System.out::println);
    }
}
