package aoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Num38_StringPermutation {

    public static List<String> getPermutations(String s) {
        return getPermutations(s.toCharArray(), new ArrayList<>(), 0);
    }

    private static List<String> getPermutations(char[] c, List<String> res, int index) {
        if (index == c.length)
            res.add(String.valueOf(c));
        else {
            for (int i = index; i < c.length; i++) {
                char t1 = c[i];
                c[i] = c[index];
                c[index] = t1;

                getPermutations(c, res, index + 1);

                char t2 = c[i];
                c[i] = c[index];
                c[index] = t2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        getPermutations(s).stream().forEach(System.out::println);
    }
}
