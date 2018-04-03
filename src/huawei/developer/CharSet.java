package huawei.developer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class CharSet {

    public static String getCharSet(String s) {
//        int[] letter = new int[52];
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getCharSet(s));
    }
}
