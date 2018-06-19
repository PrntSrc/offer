package zleetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-06-13
 */
public class Num784_LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        if (s == null) return new LinkedList<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] c = cur.toCharArray();

                c[i] = Character.toUpperCase(c[i]);
                queue.offer(String.valueOf(c));
                c[i] = Character.toLowerCase(c[i]);
                queue.offer(String.valueOf(c));
            }
        }
        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {

    }
}
