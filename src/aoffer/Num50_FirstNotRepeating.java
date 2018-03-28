package aoffer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * todo 改成循环遍历两次字符串 判断map.value == 1;
 * @author Yue Lin
 * @since 2018-03-26
 */
public class Num50_FirstNotRepeating {

    public static char getFirstNotRepeating(String s) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!set.contains(c)) {
                list.add(c);
                set.add(c);
            } else list.remove(c);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        String s = "abavbdeff";
        System.out.println(getFirstNotRepeating(s));
    }
}
